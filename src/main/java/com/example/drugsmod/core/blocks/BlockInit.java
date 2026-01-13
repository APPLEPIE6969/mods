package com.example.drugsmod.core.blocks;

import com.example.drugsmod.DrugsMod;
import com.example.drugsmod.core.blocks.custom.ChemistryLabTableBlock;
import com.example.drugsmod.core.blocks.custom.DrugProcessingTableBlock;
import com.example.drugsmod.core.blocks.custom.ExtractionTableBlock;
import com.example.drugsmod.core.blocks.custom.SynthesisTableBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DrugsMod.MOD_ID);

    public static final RegistryObject<Block> CHEMISTRY_LAB_TABLE = BLOCKS.register("chemistry_lab_table",
            () -> new ChemistryLabTableBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DRUG_PROCESSING_TABLE = BLOCKS.register("drug_processing_table",
            () -> new DrugProcessingTableBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EXTRACTION_TABLE = BLOCKS.register("extraction_table",
            () -> new ExtractionTableBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SYNTHESIS_TABLE = BLOCKS.register("synthesis_table",
            () -> new SynthesisTableBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DISTILLATION_RIG = BLOCKS.register("distillation_rig",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REACTION_VESSEL = BLOCKS.register("reaction_vessel",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRYSTALLIZATION_CHAMBER = BLOCKS.register("crystallization_chamber",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DRYING_RACK = BLOCKS.register("drying_rack",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5f)));

    // Block Items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DrugsMod.MOD_ID);

    public static final RegistryObject<Item> CHEMISTRY_LAB_TABLE_ITEM = ITEMS.register("chemistry_lab_table",
            () -> new BlockItem(CHEMISTRY_LAB_TABLE.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static final RegistryObject<Item> DRUG_PROCESSING_TABLE_ITEM = ITEMS.register("drug_processing_table",
            () -> new BlockItem(DRUG_PROCESSING_TABLE.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static final RegistryObject<Item> EXTRACTION_TABLE_ITEM = ITEMS.register("extraction_table",
            () -> new BlockItem(EXTRACTION_TABLE.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static final RegistryObject<Item> SYNTHESIS_TABLE_ITEM = ITEMS.register("synthesis_table",
            () -> new BlockItem(SYNTHESIS_TABLE.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static final RegistryObject<Item> DISTILLATION_RIG_ITEM = ITEMS.register("distillation_rig",
            () -> new BlockItem(DISTILLATION_RIG.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static final RegistryObject<Item> REACTION_VESSEL_ITEM = ITEMS.register("reaction_vessel",
            () -> new BlockItem(REACTION_VESSEL.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static final RegistryObject<Item> CRYSTALLIZATION_CHAMBER_ITEM = ITEMS.register("crystallization_chamber",
            () -> new BlockItem(CRYSTALLIZATION_CHAMBER.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static final RegistryObject<Item> DRYING_RACK_ITEM = ITEMS.register("drying_rack",
            () -> new BlockItem(DRYING_RACK.get(), new Item.Properties().tab(com.example.drugsmod.core.init.CreativeModeTabInit.DRUGS_TAB)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
