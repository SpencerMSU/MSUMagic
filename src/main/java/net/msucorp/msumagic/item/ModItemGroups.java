package net.msucorp.msumagic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.msucorp.msumagic.MSUMagic;

public class ModItemGroups {

    public static final ItemGroup MSUMAGIC = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MSUMagic.MOD_ID,"msumagic"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.MAGIC_ESSENCE))
                    .displayName(Text.translatable("itemgroup.msumagic.msumagic"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.MAGIC_ESSENCE);
                    })
                    .build()

    );

    public static void registerItemGroups() {
        MSUMagic.LOGGER.info("Registering Mod Item Groups"+MSUMagic.MOD_ID);

    }
}
