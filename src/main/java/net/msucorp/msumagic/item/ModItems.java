package net.msucorp.msumagic.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.msucorp.msumagic.MSUMagic;

public class ModItems {

    public static final Item MAGIC_ESSENCE = registerItem("magic_essence",new Item(new Item.Settings().maxCount(64)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MSUMagic.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MSUMagic.LOGGER.info("Registering Mod Items"+MSUMagic.MOD_ID);

        } ;
    }
