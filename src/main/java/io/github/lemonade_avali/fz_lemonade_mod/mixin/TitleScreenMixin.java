package io.github.lemonade_avali.fz_lemonade_mod.mixin;

import io.github.lemonade_avali.fz_lemonade_mod.FZ_Lemonade_Mod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void onInit(CallbackInfo ci) {
		FZ_Lemonade_Mod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
