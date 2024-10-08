package io.github.seanlanepgh.knockselementalmagic.core.items.armor;

import io.github.seanlanepgh.knockselementalmagic.core.KnocksEnchantments;
import net.minecraft.ChatFormatting;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import java.util.List;


public class IceWarlockArmor extends GeoArmorItem implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 20, this::predicate));
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    public IceWarlockArmor(ArmorMaterial materialIn, EquipmentSlot slot) {
        super(materialIn, slot, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1));

    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return false;
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> items) {
        if (this.allowedIn(tab)) {
            ItemStack stack = new ItemStack(this);
            switch (this.getSlot()) {
                case HEAD -> stack.enchant(KnocksEnchantments.ICE_RESISTANCE.get(), 1);
                case CHEST -> stack.enchant(KnocksEnchantments.ICE_RESISTANCE.get(), 1);
                case LEGS -> stack.enchant(KnocksEnchantments.ICE_RESISTANCE.get(), 1);
                case FEET -> stack.enchant(KnocksEnchantments.ICE_RESISTANCE.get(), 1);
                default -> {
                }
            }
            items.add(stack);
        }
    }

}