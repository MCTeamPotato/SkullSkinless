package me.kall.skullskinless.mixin.block;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.PlayerHeadBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerHeadBlock.class)
public abstract class PlayerHeadBlockMixin {
    @Redirect(method = "setPlacedBy", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hasTag()Z"))
    private boolean noSkin(ItemStack instance) {
        return false;
    }
}
