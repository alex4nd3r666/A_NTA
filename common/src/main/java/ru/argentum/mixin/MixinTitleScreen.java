package ru.argentum.mixin;

import ru.argentum.NTA;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TitleScreen.class)
public class MixinTitleScreen {
    @Inject(at = @At("HEAD"), method = "init()V", remap = false)
    private void init(CallbackInfo info) {
        NTA.LOGGER.info("Hello from {}!", NTA.class.getName());
    }
}