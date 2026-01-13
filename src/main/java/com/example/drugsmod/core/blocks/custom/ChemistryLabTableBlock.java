package com.example.drugsmod.core.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;
import net.minecraft.world.level.material.Material;

public class ChemistryLabTableBlock extends Block {
    private static final Component CONTAINER_TITLE = Component.translatable("container.drugsmod.chemistry_lab_table");

    public ChemistryLabTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((containerId, inventory, player) -> 
            new ChemistryLabTableMenu(containerId, inventory, 
                (ChemistryLabTableBlockEntity) level.getBlockEntity(pos)), CONTAINER_TITLE);
    }

    public static BlockEntityType<ChemistryLabTableBlockEntity> BLOCK_ENTITY_TYPE = 
        Builder.of(ChemistryLabTableBlockEntity::new, 
            BlockInit.CHEMISTRY_LAB_TABLE.get()).build(null);
}
