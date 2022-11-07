package io.github.seanlanepgh.knockselementalmagic.mixin.common;

import io.github.seanlanepgh.knockselementalmagic.core.KnocksMaterial;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(Sheets.class)
public class SheetsMixin {
    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/client/renderer/Sheets;getAllMaterials(Ljava/util/function/Consumer;)V")
    private static void knockselementalmagic$getAllMaterials(Consumer<Material> acceptor, CallbackInfo callback) {
        acceptor.accept(KnocksMaterial.FIRE_BOOK_LOCATION);
        acceptor.accept(KnocksMaterial.ICE_BOOK_LOCATION);
        acceptor.accept(KnocksMaterial.AIR_BOOK_LOCATION);
        acceptor.accept(KnocksMaterial.EARTH_BOOK_LOCATION);
    }
}