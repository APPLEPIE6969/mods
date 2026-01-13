package com.example.drugsmod.core.blockentity;

import com.example.drugsmod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

public class ExtractionTableBlockEntity extends BlockEntity {
    private final ItemStackHandler itemHandler = new ItemStackHandler(9) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    public ExtractionTableBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.EXTRACTION_TABLE.get(), pos, state);
    }

    public ItemStackHandler getItemHandler() {
        return itemHandler;
    }

    public void craft() {
        // Check for DMT extraction
        if (canCraftDMT()) {
            craftDMT();
        }
        // Check for mescaline extraction
        else if (canCraftMescaline()) {
            craftMescaline();
        }
        // Check for kratom extraction
        else if (canCraftKratomExtract()) {
            craftKratomExtract();
        }
    }

    private boolean canCraftDMT() {
        boolean hasAyahuascaVine = false;
        boolean hasChacrunaLeaf = false;
        boolean hasLime = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.AYAHUASCA_VINE.get()) hasAyahuascaVine = true;
            if (stack.getItem() == ItemInit.CHACRUNA_LEAF.get()) hasChacrunaLeaf = true;
            if (stack.getItem() == net.minecraft.world.item.Items.LIME) hasLime = true;
        }

        return hasAyahuascaVine && hasChacrunaLeaf && hasLime;
    }

    private void craftDMT() {
        consumeIngredients(ItemInit.AYAHUASCA_VINE.get(), ItemInit.CHACRUNA_LEAF.get(), net.minecraft.world.item.Items.LIME);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.DMT.get(), 2));
                break;
            }
        }
    }

    private boolean canCraftMescaline() {
        boolean hasPeyoteCactus = false;
        boolean hasWater = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.PEYOTE_CACTUS.get()) hasPeyoteCactus = true;
            if (stack.getItem() == net.minecraft.world.item.Items.WATER_BUCKET) hasWater = true;
        }

        return hasPeyoteCactus && hasWater;
    }

    private void craftMescaline() {
        consumeIngredients(ItemInit.PEYOTE_CACTUS.get(), net.minecraft.world.item.Items.WATER_BUCKET);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.MESCALINE.get(), 3));
                break;
            }
        }
    }

    private boolean canCraftKratomExtract() {
        boolean hasKratomLeaf = false;
        boolean hasAlcohol = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.KRATOM_LEAF.get()) hasKratomLeaf = true;
            if (stack.getItem() == net.minecraft.world.item.Items.POTION) hasAlcohol = true;
        }

        return hasKratomLeaf && hasAlcohol;
    }

    private void craftKratomExtract() {
        consumeIngredients(ItemInit.KRATOM_LEAF.get(), net.minecraft.world.item.Items.POTION);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.KRATOM_EXTRACT.get(), 2));
                break;
            }
        }
    }

    private void consumeIngredients(net.minecraft.world.item.Item... ingredients) {
        for (net.minecraft.world.item.Item ingredient : ingredients) {
            for (int i = 0; i < itemHandler.getSlots(); i++) {
                ItemStack stack = itemHandler.getStackInSlot(i);
                if (stack.getItem() == ingredient) {
                    stack.shrink(1);
                    if (stack.getCount() <= 0) {
                        itemHandler.setStackInSlot(i, ItemStack.EMPTY);
                    }
                    break;
                }
            }
        }
    }
}
