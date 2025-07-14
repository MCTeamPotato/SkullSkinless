package me.kall.skullskinless.mixin.item;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PlayerHeadItem;
import net.minecraft.world.item.component.ResolvableProfile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerHeadItem.class)
public abstract class PlayerHeadItemMixin {
    @Redirect(method = {"getName", "verifyComponentsAfterLoad"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;"))
    private Object noSkin(ItemStack instance, DataComponentType<ResolvableProfile> dataComponentType) {
        return null;
    }
}
