package net.flrr.mg24.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flrr.mg24.Magnesium24;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MAGNESIUM = registerItem("magnesium", new Item(new FabricItemSettings()));
    public static final Item RAW_MAGNESIUM = registerItem("raw_magnesium", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MAGNESIUM);
        entries.add(RAW_MAGNESIUM);
    }


    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Magnesium24.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Magnesium24.LOGGER.info("Registering Mod Items for " + Magnesium24.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
