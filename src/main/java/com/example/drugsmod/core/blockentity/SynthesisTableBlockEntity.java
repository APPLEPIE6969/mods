package com.example.drugsmod.core.blockentity;

import com.example.drugsmod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

public class SynthesisTableBlockEntity extends BlockEntity {
    private final ItemStackHandler itemHandler = new ItemStackHandler(9) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    public SynthesisTableBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.SYNTHESIS_TABLE.get(), pos, state);
    }

    public ItemStackHandler getItemHandler() {
        return itemHandler;
    }

    public void craft() {
        // Check for ecstasy synthesis
        if (canCraftEcstasy()) {
            craftEcstasy();
        }
        // Check for fentanyl synthesis
        else if (canCraftFentanyl()) {
            craftFentanyl();
        }
        // Check for GHB synthesis
        else if (canCraftGHB()) {
            craftGHB();
        }
    }

    private boolean canCraftEcstasy() {
        boolean hasSassafras = false;
        boolean hasMethylamine = false;
        boolean hasFormicAcid = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == net.minecraft.world.item.Items.OAK_LOG) hasSassafras = true; // Placeholder
            if (stack.getItem() == net.minecraft.world.item.Items.GUNPOWDER) hasMethylamine = true; // Placeholder
            if (stack.getItem() == net.minecraft.world.item.Items.SPIDER_EYE) hasFormicAcid = true; // Placeholder
        }

        return hasSassafras && hasMethylamine && hasFormicAcid;
    }

    private void craftEcstasy() {
        consumeIngredients(net.minecraft.world.item.Items.OAK_LOG, net.minecraft.world.item.Items.GUNPOWDER, net.minecraft.world.item.Items.SPIDER_EYE);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.ECSTASY.get(), 4));
                break;
            }
        }
    }

    private boolean canCraftFentanyl() {
        boolean hasPhenylaceticAcid = false;
        boolean hasAniline = false;
        boolean hasAceticAnhydride = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.PHENYLACETIC_ACID.get()) hasPhenylaceticAcid = true;
            if (stack.getItem() == net.minecraft.world.item.Items.BLACK_DYE) hasAniline = true; // Placeholder
            if (stack.getItem() == net.minecraft.world.item.Items.ACACIA_LOG) hasAceticAnhydride = true; // Placeholder
        }

        return hasPhenylaceticAcid && hasAniline && hasAceticAnhydride;
    }

    private void craftFentanyl() {
        consumeIngredients(ItemInit.PHENYLACETIC_ACID.get(), net.minecraft.world.item.Items.BLACK_DYE, net.minecraft.world.item.Items.ACACIA_LOG);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.FENTANYL.get(), 6));
                break;
            }
        }
    }

    private boolean canCraftGHB() {
        boolean hasGammaButyrolactone = false;
        boolean hasSodiumHydroxide = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.GBL.get()) hasGammaButyrolactone = true;
            if (stack.getItem() == ItemInit.SODIUM_HYDROXIDE.get()) hasSodiumHydroxide = true;
        }

        return hasGammaButyrolactone && hasSodiumHydroxide;
    }

    private void craftGHB() {
        consumeIngredients(ItemInit.GBL.get(), ItemInit.SODIUM_HYDROXIDE.get());
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.GHB.get(), 3));
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
