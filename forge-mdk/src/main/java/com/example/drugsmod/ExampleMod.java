package com.example.drugsmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("drugsmod")
@Mod.EventBusSubscriber(modid = "drugsmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExampleMod {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleMod.class);
    
    // Create a Deferred Register to hold Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "drugsmod");

    // Register items that have textures and models available
    public static final RegistryObject<Item> WEED = ITEMS.register("weed", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCAINE = ITEMS.register("cocaine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEROIN = ITEMS.register("heroin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METH = ITEMS.register("meth", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LSD = ITEMS.register("lsd", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECSTASY = ITEMS.register("ecstasy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> XANAX = ITEMS.register("xanax", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMPHETAMINE = ITEMS.register("amphetamine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRACK = ITEMS.register("crack", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FENTANYL = ITEMS.register("fentanyl", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JOINT = ITEMS.register("joint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIPE = ITEMS.register("pipe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KETAMINE = ITEMS.register("ketamine", () -> new Item(new Item.Properties()));

    public ExampleMod() {
        LOGGER.info("Drugs Mod loaded successfully!");
        LOGGER.info("Registered {} drug items", 13);
    }
}
