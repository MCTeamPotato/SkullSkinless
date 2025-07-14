package me.kall.skullskinless.mixin.block;

import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(SkullBlockEntity.class)
public abstract class SkullBlockEntityMixin {
    @ModifyVariable(method = "setOwner", at = @At("HEAD"), argsOnly = true)
    private static @Nullable ResolvableProfile noSkin(ResolvableProfile gameProfile) {
        return null;
    }
}
