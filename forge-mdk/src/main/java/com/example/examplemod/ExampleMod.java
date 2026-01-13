package com.example.drugsmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("drugsmod")
public class ExampleMod {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleMod.class);
    
    // Create a Deferred Register to hold Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "drugsmod");

    public ExampleMod() {
        // Get the mod event bus
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // Register our items
        ITEMS.register(modEventBus);
        LOGGER.info("Drugs Mod loaded successfully!");
    }
}
