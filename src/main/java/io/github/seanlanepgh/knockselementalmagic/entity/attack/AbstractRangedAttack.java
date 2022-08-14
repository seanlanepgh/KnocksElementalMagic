package io.github.seanlanepgh.knockselementalmagic.entity.attack;


import io.github.seanlanepgh.knockselementalmagic.entity.*;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.*;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public abstract class AbstractRangedAttack implements IRangedAttack {

	public KnocksEntity parentEntity;
	public double xOffSetModifier = 2;
	public double entityHeightFraction = 0.5;
	public double zOffSetModifier = 2;
	public float damage = 1;
	public double accuracy = 0.95;

	public AbstractRangedAttack(KnocksEntity parentEntity) {
		this.parentEntity = parentEntity;
	}

	public AbstractRangedAttack(KnocksEntity parentEntity, double xOffSetModifier, double entityHeightFraction,
			double zOffSetModifier, float damage) {
		this.parentEntity = parentEntity;
		this.xOffSetModifier = xOffSetModifier;
		this.entityHeightFraction = entityHeightFraction;
		this.zOffSetModifier = zOffSetModifier;
		this.damage = damage;
	}

	public AbstractRangedAttack setProjectileOriginOffset(double x, double entityHeightFraction, double z) {
		xOffSetModifier = x;
		this.entityHeightFraction = entityHeightFraction;
		zOffSetModifier = z;
		return this;
	}

	public AbstractRangedAttack setDamage(float damage) {
		this.damage = damage;
		return this;
	}

	private AttackSound sound;

	public AbstractRangedAttack setSound(AttackSound sound) {
		this.sound = sound;
		return this;
	}

	public AbstractRangedAttack setSound(SoundEvent sound, float volume, float pitch) {
		this.sound = new AttackSound(sound, volume, pitch);
		return this;
	}

	public AbstractRangedAttack setAccuracy(double accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	public double rollAccuracy(double directional) {
		return directional + (1.0D - accuracy) * directional * this.parentEntity.getRandom().nextGaussian();
	}

//	@Override
public void shoot() {
		LivingEntity livingentity = this.parentEntity.getTarget();
		Level world = this.parentEntity.getCommandSenderWorld();
		Vec3 vector3d = this.parentEntity.getViewVector(1.0F);
		double d2 = livingentity.getX() - (this.parentEntity.getX() + vector3d.x * xOffSetModifier);
		double d3 = livingentity.getY(0.5D) - (this.parentEntity.getY(entityHeightFraction));
		double d4 = livingentity.getZ() - (this.parentEntity.getZ() + vector3d.z * zOffSetModifier); //                            System.out.println(icicle);
	                            System.out.println(d2);
	                            System.out.println(d3);
	                            System.out.println(d4);
		Projectile projectile = getProjectile(world, rollAccuracy(d2), rollAccuracy(d3), rollAccuracy(d4));

		System.out.println(projectile);

		projectile.setPos(this.parentEntity.getX() + vector3d.x * xOffSetModifier,
				this.parentEntity.getY(entityHeightFraction), this.parentEntity.getZ() + vector3d.z * zOffSetModifier);
		projectile.shootFromRotation((Entity) this.parentEntity, (float) this.parentEntity.getX(), (float) this.parentEntity.getY(), (float) this.parentEntity.getZ(),2.0F,0.95F);

	System.out.println(projectile);
	//projectile.shootFromRotation(livingentity, (float)d2,(float)d3,(float)d4, 1.0F, (float) (1.0D - accuracy));
	//projectile.shoot(rollAccuracy(d2), rollAccuracy(d3), rollAccuracy(d4));
		world.addFreshEntity(projectile);
		if (sound == null)
			getDefaultAttackSound().play(this.parentEntity);
		else
			sound.play(this.parentEntity);
	}
}