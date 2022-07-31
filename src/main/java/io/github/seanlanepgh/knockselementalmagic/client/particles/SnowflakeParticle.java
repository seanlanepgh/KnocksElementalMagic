package io.github.seanlanepgh.knockselementalmagic.client.particles;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SnowflakeParticle extends TextureSheetParticle {
    private static final Random RANDOM = new Random();

    private SnowflakeParticle(ClientLevel clientLevel, double x, double y, double z, double motionX, double motionY, double motionZ, SpriteSet spriteWithAge) {
        super(clientLevel, x, y, z, 0.5D - RANDOM.nextDouble(), y, 0.5D - RANDOM.nextDouble());
        this.yd *= 0.20000000298023224D;
        if( motionX == 0.0D && motionZ == 0.0D) {
            this.xd *= 0.10000000149011612D;
            this.zd *= 0.10000000149011612D;
        }

        this.quadSize *= 0.75F;
        this.lifetime = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
        this.hasPhysics = false;
    }

    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }


    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.age ++ >= this.lifetime) {
            this.remove();
        } else {
            this.yd += 0.004D;
            this.move(this.xd, this.yd, this.zd);
            if (this.y == this.yo) {
                this.xd *= 1.1D;
                this.zd *= 1.1D;
            }

            this.xd *= 0.9599999785423279D;
            this.yd *= 0.9599999785423279D;
            this.zd *= 0.9599999785423279D;
            if (this.onGround) {
                this.xd *= 0.699999988079071D;
                this.zd *= 0.699999988079071D;
            }
        }

    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Factory(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel LevelIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            SnowflakeParticle snowflakeParticle = new SnowflakeParticle(LevelIn, x, y, z, xSpeed, ySpeed, zSpeed,this.spriteSet);
            snowflakeParticle.pickSprite(this.spriteSet);
            return snowflakeParticle;
        }


    }
}