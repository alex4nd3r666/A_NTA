package ru.argentum.forge;

import ru.argentum.ExampleBlocks;
import ru.argentum.NTA;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NTA.MOD_ID)
public class NTAForge {
    public NTAForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        NTA.init();
    }
}
