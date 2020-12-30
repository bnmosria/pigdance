package io.github.bnmosria.pigdance.Init;

import io.github.bnmosria.pigdance.Item.ModdedSpawnEggItem;
import io.github.bnmosria.pigdance.PigDance;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PigDance.MODID);
	public static final RegistryObject<Item> DANCING_PIG_CRYSTAL = ITEMS.register("dancing_pig_crystal", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<ModdedSpawnEggItem> DANCING_PIG_SPAWN_EGG = ITEMS.register("dancing_pig_spawn_egg", () -> new ModdedSpawnEggItem(EntityTypes.DANCING_PIG, 0xF0A5A2, 0xA9672B, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
