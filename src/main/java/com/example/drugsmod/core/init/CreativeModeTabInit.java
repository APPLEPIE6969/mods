package com.example.drugsmod.core.init;

import com.example.drugsmod.DrugsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DrugsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeModeTabInit {
    public static final CreativeModeTab DRUGS_TAB = new CreativeModeTab("drugs_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.WEED.get());
        }
    };

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == DRUGS_TAB) {
            // Basic drugs
            event.accept(ItemInit.WEED);
            event.accept(ItemInit.COCAINE);
            event.accept(ItemInit.HEROIN);
            event.accept(ItemInit.METH);
            event.accept(ItemInit.LSD);
            event.accept(ItemInit.MUSHROOM);
            
            // Amphetamines
            event.accept(ItemInit.AMPHETAMINE);
            event.accept(ItemInit.SPEED);
            
            // Benzodiazepines
            event.accept(ItemInit.XANAX);
            event.accept(ItemInit.DIAZEPAM);
            event.accept(ItemInit.NITRAZEPAM);
            event.accept(ItemInit.CLONAZEPAM);
            event.accept(ItemInit.TEMAZEPAM);
            
            // Cocaine variants
            event.accept(ItemInit.CRACK);
            event.accept(ItemInit.COCA_ETHYLENE);
            
            // Ecstasy/MDMA
            event.accept(ItemInit.ECSTASY);
            event.accept(ItemInit.MDMA);
            event.accept(ItemInit.MOLLY);
            
            // GHB variants
            event.accept(ItemInit.GHB);
            event.accept(ItemInit.GBL);
            event.accept(ItemInit.BD);
            
            // Opiates
            event.accept(ItemInit.MORPHINE);
            event.accept(ItemInit.CODEINE);
            event.accept(ItemInit.FENTANYL);
            event.accept(ItemInit.OXYCODONE);
            event.accept(ItemInit.METHADONE);
            event.accept(ItemInit.BUPRENORPHINE);
            event.accept(ItemInit.PETHIDINE);
            
            // Ketamine
            event.accept(ItemInit.KETAMINE);
            event.accept(ItemInit.SPECIAL_K);
            
            // Magic mushrooms
            event.accept(ItemInit.LIBERTY_CAP);
            event.accept(ItemInit.WAVY_CAP);
            event.accept(ItemInit.CUBES);
            event.accept(ItemInit.TRUFFLES);
            event.accept(ItemInit.FLY_AGARIC);
            
            // Solvents
            event.accept(ItemInit.GLUE);
            event.accept(ItemInit.AEROSOL);
            event.accept(ItemInit.NAIL_POLISH_REMOVER);
            event.accept(ItemInit.NITROUS_OXIDE);
            event.accept(ItemInit.PETROL);
            event.accept(ItemInit.BUTANE);
            
            // Synthetic opioids - Nitazenes
            event.accept(ItemInit.ISOTONITAZENE);
            event.accept(ItemInit.METONITAZENE);
            event.accept(ItemInit.ETONITAZENE);
            event.accept(ItemInit.PROTONITAZENE);
            
            // Smoking items
            event.accept(ItemInit.JOINT);
            event.accept(ItemInit.BLUNT);
            event.accept(ItemInit.PIPE);
            event.accept(ItemInit.BONG);
            event.accept(ItemInit.SYRINGE);
            
            // Rolling materials
            event.accept(ItemInit.ROLLING_PAPER);
            event.accept(ItemInit.TOBACCO);
            
            // Natural ingredients
            event.accept(ItemInit.COCA_LEAF);
            event.accept(ItemInit.OPIUM_POPPY);
            event.accept(ItemInit.KAVA_ROOT);
            event.accept(ItemInit.EPHEDRA);
            event.accept(ItemInit.MORNING_GLORY_SEEDS);
            event.accept(ItemInit.HAWAIIAN_BABY_WOODROSE);
            event.accept(ItemInit.PEYOTE_CACTUS);
            event.accept(ItemInit.SALVIA_DIVINORUM);
            event.accept(ItemInit.AYAHUASCA_VINE);
            event.accept(ItemInit.CHACRUNA_LEAF);
            event.accept(ItemInit.KRATOM_LEAF);
            event.accept(ItemInit.BETEL_NUT);
            event.accept(ItemInit.KOLA_NUT);
            event.accept(ItemInit.GUARANA_SEED);
            event.accept(ItemInit.YERBA_MATE);
            
            // Chemical ingredients
            event.accept(ItemInit.ACETONE);
            event.accept(ItemInit.SULFURIC_ACID);
            event.accept(ItemInit.HYDROCHLORIC_ACID);
            event.accept(ItemInit.SODIUM_HYDROXIDE);
            event.accept(ItemInit.LITHIUM);
            event.accept(ItemInit.PSEUDOEPHEDRINE);
            event.accept(ItemInit.PHENYLACETIC_ACID);
            event.accept(ItemInit.ANHYDROUS_AMMONIA);
            event.accept(ItemInit.RED_PHOSPHORUS);
            event.accept(ItemInit.IODINE);
            event.accept(ItemInit.MANGANESE_DIOXIDE);
            
            // Lab equipment
            event.accept(ItemInit.TEST_TUBE);
            event.accept(ItemInit.BEAKER);
            event.accept(ItemInit.FLASK);
            event.accept(ItemInit.BUNSEN_BURNER);
            event.accept(ItemInit.DISTILLATION_COIL);
            event.accept(ItemInit.FILTER_PAPER);
            
            // Crafting tables
            event.accept(BlockInit.CHEMISTRY_LAB_TABLE_ITEM);
            event.accept(BlockInit.DRUG_PROCESSING_TABLE_ITEM);
            event.accept(BlockInit.EXTRACTION_TABLE_ITEM);
            event.accept(BlockInit.SYNTHESIS_TABLE_ITEM);
            event.accept(BlockInit.DISTILLATION_RIG_ITEM);
            event.accept(BlockInit.REACTION_VESSEL_ITEM);
            event.accept(BlockInit.CRYSTALLIZATION_CHAMBER_ITEM);
            event.accept(BlockInit.DRYING_RACK_ITEM);
            
            // Dangerous combinations
            event.accept(ItemInit.SPEEDBALL);
            event.accept(ItemInit.COKE_AND_ALCOHOL);
            event.accept(ItemInit.SEROTONIN_SYNDROME);
            
            // Treatment
            event.accept(ItemInit.NALOXONE);
        }
    }
}
