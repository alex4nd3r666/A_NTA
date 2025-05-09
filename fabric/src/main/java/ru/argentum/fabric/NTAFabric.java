package ru.argentum.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import ru.argentum.ExampleBlocks;
import ru.argentum.NTA;
import net.fabricmc.api.ModInitializer;

public class NTAFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        NTA.init();
        NTA.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), NTA.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ExampleBlocks.REGISTRATE.register();
    }
}
