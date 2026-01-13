package com.example.drugsmod;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("drugsmod")
public class ExampleMod {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleMod.class);

    public ExampleMod() {
        LOGGER.info("Drugs Mod loaded successfully!");
    }
}
