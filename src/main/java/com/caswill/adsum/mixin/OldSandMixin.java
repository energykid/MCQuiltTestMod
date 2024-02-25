package com.caswill.adsum.mixin;

import com.caswill.adsum.content.*;

import net.minecraft.entity.mob.MobEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MobEntity.class)
public class OldSandMixin {
	@Inject(method = "tick", at = @At("TAIL"))
	public void onTick(CallbackInfo ci) {
		MobEntity mob = (MobEntity)(Object)this;

		if (mob.isBaby() && mob.getLandingBlockState().isOf(Blocks.OLD_SAND_BLOCK))
		{
			mob.setBaby(false);
		}
	}
}
