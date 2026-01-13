package com.example.drugsmod.core.blockentity;

import com.example.drugsmod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

public class DrugProcessingTableBlockEntity extends BlockEntity {
    private final ItemStackHandler itemHandler = new ItemStackHandler(9) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    public DrugProcessingTableBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.DRUG_PROCESSING_TABLE.get(), pos, state);
    }

    public ItemStackHandler getItemHandler() {
        return itemHandler;
    }

    public void craft() {
        // Check for cocaine processing
        if (canCraftCocaine()) {
            craftCocaine();
        }
        // Check for heroin processing
        else if (canCraftHeroin()) {
            craftHeroin();
        }
        // Check for crack making
        else if (canCraftCrack()) {
            craftCrack();
        }
    }

    private boolean canCraftCocaine() {
        boolean hasCocaLeaf = false;
        boolean hasSulfuricAcid = false;
        boolean hasKerosene = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.COCA_LEAF.get()) hasCocaLeaf = true;
            if (stack.getItem() == ItemInit.SULFURIC_ACID.get()) hasSulfuricAcid = true;
            if (stack.getItem() == net.minecraft.world.item.Items.KEROSENE) hasKerosene = true;
        }

        return hasCocaLeaf && hasSulfuricAcid && hasKerosene;
    }

    private void craftCocaine() {
        consumeIngredients(ItemInit.COCA_LEAF.get(), ItemInit.SULFURIC_ACID.get(), net.minecraft.world.item.Items.KEROSENE);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.COCAINE.get(), 4));
                break;
            }
        }
    }

    private boolean canCraftHeroin() {
        boolean hasOpiumPoppy = false;
        boolean hasAceticAnhydride = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.OPIUM_POPPY.get()) hasOpiumPoppy = true;
            if (stack.getItem() == net.minecraft.world.item.Items.ACACIA_LOG) hasAceticAnhydride = true; // Placeholder
        }

        return hasOpiumPoppy && hasAceticAnhydride;
    }

    private void craftHeroin() {
        consumeIngredients(ItemInit.OPIUM_POPPY.get(), net.minecraft.world.item.Items.ACACIA_LOG);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.HEROIN.get(), 3));
                break;
            }
        }
    }

    private boolean canCraftCrack() {
        boolean hasCocaine = false;
        boolean hasBakingSoda = false;
        boolean hasWater = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.COCAINE.get()) hasCocaine = true;
            if (stack.getItem() == net.minecraft.world.item.Items.SUGAR) hasBakingSoda = true; // Placeholder
            if (stack.getItem() == net.minecraft.world.item.Items.WATER_BUCKET) hasWater = true;
        }

        return hasCocaine && hasBakingSoda && hasWater;
    }

    private void craftCrack() {
        consumeIngredients(ItemInit.COCAINE.get(), net.minecraft.world.item.Items.SUGAR, net.minecraft.world.item.Items.WATER_BUCKET);
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.CRACK.get(), 2));
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
