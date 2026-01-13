package com.example.drugsmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(DrugsMod.MOD_ID)
public class DrugsMod {
    public static final String MOD_ID = "drugsmod";
    private static final Logger LOGGER = LoggerFactory.getLogger(DrugsMod.class);

    public DrugsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        LOGGER.info("Drugs Mod loaded successfully!");
    }
}
