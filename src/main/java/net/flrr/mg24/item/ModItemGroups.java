package net.flrr.mg24.item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flrr.mg24.Magnesium24;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MAGNESIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Magnesium24.MOD_ID, "magnesium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.magnesium"))
                    .icon(() -> new ItemStack(ModItems.MAGNESIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MAGNESIUM);
                        entries.add(ModItems.RAW_MAGNESIUM);

                    }).build());

    public static void registerItemGroup() {
        Magnesium24.LOGGER.info("Registering Item Groups For " + Magnesium24.MOD_ID);
    }
}
