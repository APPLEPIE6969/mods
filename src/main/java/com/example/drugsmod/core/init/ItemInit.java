package com.example.drugsmod.core.init;

import com.example.drugsmod.DrugsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, DrugsMod.MOD_ID);

    // Drug items
    public static final RegistryObject<Item> WEED = ITEMS.register("weed", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> COCAINE = ITEMS.register("cocaine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> HEROIN = ITEMS.register("heroin", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> METH = ITEMS.register("meth", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> LSD = ITEMS.register("lsd", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> MUSHROOM = ITEMS.register("mushroom", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Smoking items
    public static final RegistryObject<Item> JOINT = ITEMS.register("joint", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> BLUNT = ITEMS.register("blunt", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> PIPE = ITEMS.register("pipe", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    public static final RegistryObject<Item> BONG = ITEMS.register("bong", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    // Rolling materials
    public static final RegistryObject<Item> ROLLING_PAPER = ITEMS.register("rolling_paper", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> TOBACCO = ITEMS.register("tobacco", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Amphetamines
    public static final RegistryObject<Item> AMPHETAMINE = ITEMS.register("amphetamine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> SPEED = ITEMS.register("speed", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Benzodiazepines
    public static final RegistryObject<Item> XANAX = ITEMS.register("xanax", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> DIAZEPAM = ITEMS.register("diazepam", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> NITRAZEPAM = ITEMS.register("nitrazepam", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> CLONAZEPAM = ITEMS.register("clonazepam", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> TEMAZEPAM = ITEMS.register("temazepam", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Cocaine variants
    public static final RegistryObject<Item> CRACK = ITEMS.register("crack", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> COCA_ETHYLENE = ITEMS.register("coca_ethylene", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Ecstasy/MDMA
    public static final RegistryObject<Item> ECSTASY = ITEMS.register("ecstasy", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> MDMA = ITEMS.register("mdma", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> MOLLY = ITEMS.register("molly", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // GHB variants
    public static final RegistryObject<Item> GHB = ITEMS.register("ghb", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> GBL = ITEMS.register("gbl", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> BD = ITEMS.register("bd", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Opiates
    public static final RegistryObject<Item> MORPHINE = ITEMS.register("morphine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> CODEINE = ITEMS.register("codeine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> FENTANYL = ITEMS.register("fentanyl", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> OXYCODONE = ITEMS.register("oxycodone", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> METHADONE = ITEMS.register("methadone", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> BUPRENORPHINE = ITEMS.register("buprenorphine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> PETHIDINE = ITEMS.register("pethidine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Ketamine
    public static final RegistryObject<Item> KETAMINE = ITEMS.register("ketamine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> SPECIAL_K = ITEMS.register("special_k", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Magic mushrooms
    public static final RegistryObject<Item> LIBERTY_CAP = ITEMS.register("liberty_cap", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> WAVY_CAP = ITEMS.register("wavy_cap", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> CUBES = ITEMS.register("cubes", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> TRUFFLES = ITEMS.register("truffles", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Fly agaric (different from psilocybin)
    public static final RegistryObject<Item> FLY_AGARIC = ITEMS.register("fly_agaric", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Solvents
    public static final RegistryObject<Item> GLUE = ITEMS.register("glue", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> AEROSOL = ITEMS.register("aerosol", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> NAIL_POLISH_REMOVER = ITEMS.register("nail_polish_remover", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> NITROUS_OXIDE = ITEMS.register("nitrous_oxide", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> PETROL = ITEMS.register("petrol", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> BUTANE = ITEMS.register("butane", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Synthetic opioids - Nitazenes
    public static final RegistryObject<Item> ISOTONITAZENE = ITEMS.register("isotonitazene", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> METONITAZENE = ITEMS.register("metonitazene", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> ETONITAZENE = ITEMS.register("etonitazene", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> PROTONITAZENE = ITEMS.register("protonitazene", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Overdose treatment
    public static final RegistryObject<Item> NALOXONE = ITEMS.register("naloxone", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    // Dangerous combinations
    public static final RegistryObject<Item> SPEEDBALL = ITEMS.register("speedball", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> COKE_AND_ALCOHOL = ITEMS.register("coke_and_alcohol", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> SEROTONIN_SYNDROME = ITEMS.register("serotonin_syndrome", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Chemical ingredients
    public static final RegistryObject<Item> ACETONE = ITEMS.register("acetone", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> SULFURIC_ACID = ITEMS.register("sulfuric_acid", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> HYDROCHLORIC_ACID = ITEMS.register("hydrochloric_acid", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> SODIUM_HYDROXIDE = ITEMS.register("sodium_hydroxide", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> PSEUDOEPHEDRINE = ITEMS.register("pseudoephedrine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> COCA_LEAF = ITEMS.register("coca_leaf", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> OPIUM_POPPY = ITEMS.register("opium_poppy", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> KAVA_ROOT = ITEMS.register("kava_root", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> EPHEDRA = ITEMS.register("ephedra", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> MORNING_GLORY_SEEDS = ITEMS.register("morning_glory_seeds", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> HAWAIIAN_BABY_WOODROSE = ITEMS.register("hawaiian_baby_woodrose", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> PEYOTE_CACTUS = ITEMS.register("peyote_cactus", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> SALVIA_DIVINORUM = ITEMS.register("salvia_divinorum", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> AYAHUASCA_VINE = ITEMS.register("ayahuasca_vine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> CHACRUNA_LEAF = ITEMS.register("chacruna_leaf", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> KRATOM_LEAF = ITEMS.register("kratom_leaf", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> BETEL_NUT = ITEMS.register("betel_nut", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> KOLA_NUT = ITEMS.register("kola_nut", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> GUARANA_SEED = ITEMS.register("guarana_seed", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> YERBA_MATE = ITEMS.register("yerba_mate", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    // Lab equipment
    public static final RegistryObject<Item> TEST_TUBE = ITEMS.register("test_tube", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    public static final RegistryObject<Item> BEAKER = ITEMS.register("beaker", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    public static final RegistryObject<Item> FLASK = ITEMS.register("flask", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    public static final RegistryObject<Item> BUNSEN_BURNER = ITEMS.register("bunsen_burner", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    public static final RegistryObject<Item> DISTILLATION_COIL = ITEMS.register("distillation_coil", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB).stacksTo(1)));
    
    public static final RegistryObject<Item> FILTER_PAPER = ITEMS.register("filter_paper", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> PHENYLACETIC_ACID = ITEMS.register("phenylacetic_acid", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> ANHYDROUS_AMMONIA = ITEMS.register("anhydrous_ammonia", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> RED_PHOSPHORUS = ITEMS.register("red_phosphorus", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> IODINE = ITEMS.register("iodine", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
    
    public static final RegistryObject<Item> MANGANESE_DIOXIDE = ITEMS.register("manganese_dioxide", 
        () -> new Item(new Item.Properties().tab(CreativeModeTabInit.DRUGS_TAB)));
}
