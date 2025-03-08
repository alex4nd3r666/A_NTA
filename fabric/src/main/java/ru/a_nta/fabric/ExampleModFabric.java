package ru.a_nta.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import ru.a_nta.A_NTABlocks;
import ru.a_nta.A_NTA;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        A_NTA.init();
        A_NTA.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), A_NTA.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        A_NTABlocks.REGISTRATE.register();
    }
}
