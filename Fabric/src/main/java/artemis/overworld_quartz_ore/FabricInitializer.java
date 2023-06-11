package artemis.overworld_quartz_ore;

import java.util.function.Predicate;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.levelgen.GenerationStep;

public class FabricInitializer implements ModInitializer {
	@Override
	public void onInitialize() {
		OverworldQuartzOre.BLOCKS_WITH_ITEM.forEach((rl, block) -> {
			Registry.register(Registry.BLOCK, rl, block);
			Registry.register(Registry.ITEM, rl, new BlockItem(block, (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		});

		Predicate<BiomeSelectionContext> quartzOreBiomes = BiomeSelectors.foundInOverworld()
			.and(BiomeSelectors.tag(OverworldQuartzOre.QUARTZ_ORE_BLOCKLIST).negate());
		BiomeModifications.addFeature(quartzOreBiomes, GenerationStep.Decoration.UNDERGROUND_ORES, OverworldQuartzOre.QUARTZ_ORE_FEATURE);
	}
}
