package artemis.overworld_quartz_ore;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverworldQuartzOre {
	public static final String MOD_ID = "overworld_quartz_ore";
	public static final String MOD_NAME = "Overworld Quartz Ore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
	public static final Map<ResourceLocation, Block> BLOCKS_WITH_ITEM = new HashMap<>();

	public static final Block QUARTZ_ORE = register("quartz_ore",
		new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 5))
	);
	public static final Block DEEPSLATE_QUARTZ_ORE = register("deepslate_quartz_ore",
		new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).color(MaterialColor.DEEPSLATE).sound(SoundType.DEEPSLATE), UniformInt.of(2, 5))
	);

	public static final TagKey<Biome> QUARTZ_ORE_BLOCKLIST = TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(MOD_ID, "quartz_ore_blocklist"));

	public static final ResourceKey<PlacedFeature> QUARTZ_ORE_FEATURE = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(MOD_ID, "ore_quartz"));

	private static Block register(String string, Block block) {
		return BLOCKS_WITH_ITEM.put(new ResourceLocation(MOD_ID, string), block);
	}
}