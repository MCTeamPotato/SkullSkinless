package me.kall.skullskinless.mixin.block;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(SkullBlockRenderer.class)
public abstract class SkullBlockRendererMixin {
    @ModifyVariable(method = "getRenderType", at = @At("HEAD"), argsOnly = true)
    private static @Nullable GameProfile noSkin(GameProfile gameProfile) {
        return null;
    }
}
