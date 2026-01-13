package com.example.drugsmod.core.blockentity;

import com.example.drugsmod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

public class ChemistryLabTableBlockEntity extends BlockEntity {
    private final ItemStackHandler itemHandler = new ItemStackHandler(9) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    public ChemistryLabTableBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.CHEMISTRY_LAB_TABLE.get(), pos, state);
    }

    public ItemStackHandler getItemHandler() {
        return itemHandler;
    }

    public void craft() {
        // Check for meth synthesis recipe
        if (canCraftMeth()) {
            craftMeth();
        }
        // Check for other chemical synthesis recipes
        else if (canCraftLSD()) {
            craftLSD();
        }
    }

    private boolean canCraftMeth() {
        boolean hasPseudoephedrine = false;
        boolean hasRedPhosphorus = false;
        boolean hasIodine = false;
        boolean hasAnhydrousAmmonia = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.PSEUDOEPHEDRINE.get()) hasPseudoephedrine = true;
            if (stack.getItem() == ItemInit.RED_PHOSPHORUS.get()) hasRedPhosphorus = true;
            if (stack.getItem() == ItemInit.IODINE.get()) hasIodine = true;
            if (stack.getItem() == ItemInit.ANHYDROUS_AMMONIA.get()) hasAnhydrousAmmonia = true;
        }

        return hasPseudoephedrine && hasRedPhosphorus && hasIodine && hasAnhydrousAmmonia;
    }

    private void craftMeth() {
        consumeIngredients(ItemInit.PSEUDOEPHEDRINE.get(), ItemInit.RED_PHOSPHORUS.get(), 
                          ItemInit.IODINE.get(), ItemInit.ANHYDROUS_AMMONIA.get());
        
        // Add meth to output
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.METH.get(), 3));
                break;
            }
        }
    }

    private boolean canCraftLSD() {
        boolean hasMorningGlory = false;
        boolean hasLithium = false;
        boolean hasSulfuricAcid = false;

        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.getItem() == ItemInit.MORNING_GLORY_SEEDS.get()) hasMorningGlory = true;
            if (stack.getItem() == ItemInit.LITHIUM.get()) hasLithium = true;
            if (stack.getItem() == ItemInit.SULFURIC_ACID.get()) hasSulfuricAcid = true;
        }

        return hasMorningGlory && hasLithium && hasSulfuricAcid;
    }

    private void craftLSD() {
        consumeIngredients(ItemInit.MORNING_GLORY_SEEDS.get(), ItemInit.LITHIUM.get(), ItemInit.SULFURIC_ACID.get());
        
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            ItemStack stack = itemHandler.getStackInSlot(i);
            if (stack.isEmpty()) {
                itemHandler.setStackInSlot(i, new ItemStack(ItemInit.LSD.get(), 2));
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
