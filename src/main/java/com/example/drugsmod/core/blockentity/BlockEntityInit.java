package com.example.drugsmod.core.blockentity;

import com.example.drugsmod.DrugsMod;
import com.example.drugsmod.core.blocks.custom.ChemistryLabTableBlock;
import com.example.drugsmod.core.blocks.custom.DrugProcessingTableBlock;
import com.example.drugsmod.core.blocks.custom.ExtractionTableBlock;
import com.example.drugsmod.core.blocks.custom.SynthesisTableBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DrugsMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<ChemistryLabTableBlockEntity>> CHEMISTRY_LAB_TABLE =
            BLOCK_ENTITIES.register("chemistry_lab_table", () -> BlockEntityType.Builder.of(
                    ChemistryLabTableBlockEntity::new, BlockInit.CHEMISTRY_LAB_TABLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<DrugProcessingTableBlockEntity>> DRUG_PROCESSING_TABLE =
            BLOCK_ENTITIES.register("drug_processing_table", () -> BlockEntityType.Builder.of(
                    DrugProcessingTableBlockEntity::new, BlockInit.DRUG_PROCESSING_TABLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<ExtractionTableBlockEntity>> EXTRACTION_TABLE =
            BLOCK_ENTITIES.register("extraction_table", () -> BlockEntityType.Builder.of(
                    ExtractionTableBlockEntity::new, BlockInit.EXTRACTION_TABLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<SynthesisTableBlockEntity>> SYNTHESIS_TABLE =
            BLOCK_ENTITIES.register("synthesis_table", () -> BlockEntityType.Builder.of(
                    SynthesisTableBlockEntity::new, BlockInit.SYNTHESIS_TABLE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
