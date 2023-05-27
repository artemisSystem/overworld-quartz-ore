package artemis.overworld_quartz_ore;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@Mod(OverworldQuartzOre.MOD_ID)
public class ForgeInitializer {
	public ForgeInitializer() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener((RegisterEvent event) -> {
			event.register(ForgeRegistries.Keys.BLOCKS,
				helper -> OverworldQuartzOre.BLOCKS_WITH_ITEM.forEach(helper::register)
			);
			event.register(ForgeRegistries.Keys.ITEMS,
				helper -> OverworldQuartzOre.BLOCKS_WITH_ITEM.forEach((rl, block) ->
					helper.register(rl, new BlockItem(block, (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)))
				)
			);
		});
	}
}