package io.github.seanlanepgh.knockselementalmagic.core.items;

        import io.github.seanlanepgh.knockselementalmagic.core.KnocksItems;
        import io.github.seanlanepgh.knockselementalmagic.entity.projectile.BlazeBlast;
        import io.github.seanlanepgh.knockselementalmagic.entity.projectile.TornadoBolt;
        import io.github.seanlanepgh.knockselementalmagic.entity.projectile.BlazeStrike;

        import net.minecraft.server.level.ServerLevel;

        import net.minecraft.world.InteractionHand;
        import net.minecraft.world.entity.LivingEntity;
        import net.minecraft.world.entity.player.Player;

        import net.minecraft.world.item.ItemStack;
        import net.minecraft.world.item.enchantment.Enchantment;
        import net.minecraft.world.item.enchantment.EnchantmentHelper;
        import net.minecraft.world.item.enchantment.Enchantments;
        import net.minecraft.world.level.Level;

        import net.minecraftforge.network.PacketDistributor;

        import software.bernie.geckolib3.util.GeckoLibUtil;

public class ExpertFireStaff extends KnocksBaseItem {

    public ExpertFireStaff(Properties props) {
        super(props);
    }

    @Override
    public void releaseUsing(ItemStack stack, Level Level, LivingEntity entityLiving, int timeLeft) {

        if (entityLiving instanceof Player) {
            Player playerentity = (Player) entityLiving;
            if (!Level.isClientSide) {
                BlazeBlast abstractarrowentity = createArrow(Level, stack, playerentity);
                abstractarrowentity.shootFromRotation(playerentity, playerentity.getXRot(), playerentity.getYRot(),
                        0.0F, 0.25F * 3.0F, 1.0F);
                abstractarrowentity.isNoGravity();

                stack.hurtAndBreak(1, entityLiving, p -> p.broadcastBreakEvent(entityLiving.getUsedItemHand()));
                Level.addFreshEntity(abstractarrowentity);
                if (!Level.isClientSide) {
                    final int id = GeckoLibUtil.guaranteeIDForStack(stack, (ServerLevel) Level);
                    final PacketDistributor.PacketTarget target = PacketDistributor.TRACKING_ENTITY_AND_SELF
                            .with(() -> playerentity);
                }

            }
        }
    }


    @Override
    public boolean isEnchantable(ItemStack pStack) {
        return false;
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return false;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return false;
    }

    public static void reload(Player user, InteractionHand hand) {
        if (user.getItemInHand(hand).getItem() instanceof io.github.seanlanepgh.knockselementalmagic.core.items.ApprenticeAirStaff) {
            while (!user.isCreative() && user.getItemInHand(hand).getDamageValue() != 0
                    && user.getInventory().countItem(KnocksItems.AIR_RUNE.get()) > 0) {
                removeAmmo(KnocksItems.AIR_RUNE.get(), user);
                user.getItemInHand(hand).hurtAndBreak(-2, user, s -> user.broadcastBreakEvent(hand));
                user.getItemInHand(hand).setPopTime(3);
            }
        }
    }

    public BlazeBlast createArrow(Level level, ItemStack stack, LivingEntity shooter) {
        float j = EnchantmentHelper.getTagEnchantmentLevel(Enchantments.POWER_ARROWS, stack);
        BlazeBlast arrowentity = new BlazeBlast(level, shooter,
                (2.0F + (j * 2.0F)));
        return arrowentity;
    }


}


