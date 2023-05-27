# Overworld Quartz Ore

its pretty simple

## Details

- Spawn rates are the same as in the nether (uniform distribution covering
the entire world except top and bottom 10 blocks). If you want to change it,
override [the placed feature](Common/src/main/resources/data/overworld_quartz_ore/worldgen/placed_feature/ore_quartz.json)
to change where and how often it spawns, and override
[the configured feature](Common/src/main/resources/data/overworld_quartz_ore/worldgen/configured_feature/ore_quartz.json)
to change the blob size.
- Drops same amount of xp and quartz as nether quartz ore
- Renames the "Nether Quartz" item to "Quartz" (`en_us` only)
- (Only on fabric) If you want to make it not spawn in a biome, add it to the
`#overworld_quartz_ore:quartz_ore_blocklist` biome tag. I couldn't find a good
way to implement this on forge, sorry (you might be able to add your own biome
modifier that removes the biomes you want? i haven't tried it). If you want
to use a tag to *include* biomes on forge, you can override
[this file](Forge/src/main/resources/data/overworld_quartz_ore/forge/biome_modifier/add_quartz_ore.json)
and make it use your tag instead
