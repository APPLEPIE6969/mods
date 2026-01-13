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

public class SynthesisTableBlock extends Block {
    private static final Component CONTAINER_TITLE = Component.translatable("container.drugsmod.synthesis_table");

    public SynthesisTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((containerId, inventory, player) -> 
            new SynthesisTableMenu(containerId, inventory, 
                (SynthesisTableBlockEntity) level.getBlockEntity(pos)), CONTAINER_TITLE);
    }

    public static BlockEntityType<SynthesisTableBlockEntity> BLOCK_ENTITY_TYPE = 
        Builder.of(SynthesisTableBlockEntity::new, 
            BlockInit.SYNTHESIS_TABLE.get()).build(null);
}
