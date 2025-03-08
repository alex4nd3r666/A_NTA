package ru.a_nta.forge;

import ru.a_nta.A_NTABlocks;
import ru.a_nta.A_NTA;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(A_NTA.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        A_NTABlocks.REGISTRATE.registerEventListeners(eventBus);
        A_NTA.init();
    }
}
