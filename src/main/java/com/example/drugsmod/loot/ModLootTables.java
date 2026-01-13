package com.example.drugsmod.loot;

import com.example.drugsmod.core.init.ItemInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "drugsmod")
public class ModLootTables {

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation name = event.getName();
        
        // Add chemical ingredients to village blacksmith chests
        if (name.toString().equals("minecraft:chests/village/village_weaponsmith")) {
            event.getTable().addPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(ItemInit.ACETONE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ItemInit.SULFURIC_ACID.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ItemInit.TEST_TUBE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .build());
        }

        // Add lab equipment to desert pyramid chests
        if (name.toString().equals("minecraft:chests/desert_pyramid")) {
            event.getTable().addPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(ItemInit.BEAKER.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ItemInit.BUNSEN_BURNER.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .add(LootItem.lootTableItem(ItemInit.DISTILLATION_COIL.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .build());
        }

        // Add rare ingredients to shipwreck chests
        if (name.toString().equals("minecraft:chests/shipwreck_treasure")) {
            event.getTable().addPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(ItemInit.LITHIUM.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ItemInit.RED_PHOSPHORUS.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .add(LootItem.lootTableItem(ItemInit.IODINE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .build());
        }

        // Add natural drugs to dungeon chests
        if (name.toString().equals("minecraft:chests/simple_dungeon")) {
            event.getTable().addPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(ItemInit.WEED.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ItemInit.MUSHROOM.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ItemInit.PEYOTE_CACTUS.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .build());
        }

        // Add rolling materials to abandoned villages
        if (name.toString().equals("minecraft:chests/village/village_house")) {
            event.getTable().addPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(ItemInit.ROLLING_PAPER.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 5))))
                .add(LootItem.lootTableItem(ItemInit.TOBACCO.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ItemInit.PIPE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .build());
        }

        // Add dangerous chemicals to nether fortress chests
        if (name.toString().equals("minecraft:chests/nether_bridge")) {
            event.getTable().addPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(ItemInit.ANHYDROUS_AMMONIA.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ItemInit.HYDROCHLORIC_ACID.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ItemInit.SODIUM_HYDROXIDE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .build());
        }

        // Add exotic ingredients to end city chests
        if (name.toString().equals("minecraft:chests/end_city_treasure")) {
            event.getTable().addPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(ItemInit.LSD.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ItemInit.DMT.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .add(LootItem.lootTableItem(ItemInit.NALOXONE.get())
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))))
                .build());
        }
    }
}
