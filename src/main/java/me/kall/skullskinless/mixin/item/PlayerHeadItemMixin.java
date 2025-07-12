package me.kall.skullskinless.mixin.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PlayerHeadItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerHeadItem.class)
public abstract class PlayerHeadItemMixin {
    @Redirect(method = "getName", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hasTag()Z"))
    private boolean noSkin(ItemStack instance) {
        return false;
    }

    @Redirect(method = "verifyTagAfterLoad", at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/CompoundTag;contains(Ljava/lang/String;I)Z"))
    private boolean noSkin(CompoundTag instance, String i, int key) {
        return false;
    }
}
