package com.example.drugsmod;

import com.example.drugsmod.core.init.ItemInit;
import com.example.drugsmod.core.blocks.BlockInit;
import com.example.drugsmod.core.blockentity.BlockEntityInit;
import com.example.drugsmod.core.effects.ModEffects;
import com.example.drugsmod.world.gen.ModWorldGen;
import com.example.drugsmod.loot.ModLootTables;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DrugsMod.MOD_ID)
public class DrugsMod {
    public static final String MOD_ID = "drugsmod";

    public DrugsMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ItemInit.ITEMS.register(eventBus);
        BlockInit.register(eventBus);
        BlockEntityInit.register(eventBus);
        ModEffects.register(eventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ModWorldGen());
        MinecraftForge.EVENT_BUS.register(new ModLootTables());
    }
}
