package com.example.drugsmod.core.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;

public class ExtractionTableBlock extends Block {
    private static final Component CONTAINER_TITLE = Component.translatable("container.drugsmod.extraction_table");

    public ExtractionTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((containerId, inventory, player) -> 
            new ExtractionTableMenu(containerId, inventory, 
                (ExtractionTableBlockEntity) level.getBlockEntity(pos)), CONTAINER_TITLE);
    }

    public static BlockEntityType<ExtractionTableBlockEntity> BLOCK_ENTITY_TYPE = 
        Builder.of(ExtractionTableBlockEntity::new, 
            BlockInit.EXTRACTION_TABLE.get()).build(null);
}
