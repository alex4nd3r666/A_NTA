package ru.a_nta;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class A_NTABlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(A_NTA.MOD_ID);

	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new).register();

	public static void init() {
		// load the class and register everything
		A_NTA.LOGGER.info("Registering blocks for " + A_NTA.NAME);
	}
}
