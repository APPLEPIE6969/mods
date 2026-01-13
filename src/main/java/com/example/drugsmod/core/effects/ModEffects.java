package com.example.drugsmod.core.effects;

import com.example.drugsmod.DrugsMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = 
        DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DrugsMod.MOD_ID);

    // Stimulant effects
    public static final RegistryObject<MobEffect> AMPHETAMINE_HIGH = EFFECTS.register("amphetamine_high",
        () -> new AmphetamineHighEffect(MobEffectCategory.BENEFICIAL, 0xFFD700));
    
    public static final RegistryObject<MobEffect> COCAINE_HIGH = EFFECTS.register("cocaine_high",
        () -> new CocaineHighEffect(MobEffectCategory.BENEFICIAL, 0xFFFFFF));
    
    public static final RegistryObject<MobEffect> CRACK_HIGH = EFFECTS.register("crack_high",
        () -> new CrackHighEffect(MobEffectCategory.BENEFICIAL, 0xFF6347));
    
    public static final RegistryObject<MobEffect> METH_HIGH = EFFECTS.register("meth_high",
        () -> new MethHighEffect(MobEffectCategory.BENEFICIAL, 0x00FFFF));
    
    public static final RegistryObject<MobEffect> ECSTASY_HIGH = EFFECTS.register("ecstasy_high",
        () -> new EcstasyHighEffect(MobEffectCategory.BENEFICIAL, 0xFF1493));
    
    // Depressant effects
    public static final RegistryObject<MobEffect> BENZO_SEDATION = EFFECTS.register("benzo_sedation",
        () -> new BenzoSedationEffect(MobEffectCategory.BENEFICIAL, 0x4169E1));
    
    public static final RegistryObject<MobEffect> HEROIN_HIGH = EFFECTS.register("heroin_high",
        () -> new HeroinHighEffect(MobEffectCategory.BENEFICIAL, 0x8B4513));
    
    public static final RegistryObject<MobEffect> GHB_HIGH = EFFECTS.register("ghb_high",
        () -> new GHBHighEffect(MobEffectCategory.BENEFICIAL, 0x32CD32));
    
    // Psychedelic effects
    public static final RegistryObject<MobEffect> CANNABIS_HIGH = EFFECTS.register("cannabis_high",
        () -> new CannabisHighEffect(MobEffectCategory.BENEFICIAL, 0x00FF00));
    
    public static final RegistryObject<MobEffect> LSD_TRIP = EFFECTS.register("lsd_trip",
        () -> new LSDTripEffect(MobEffectCategory.BENEFICIAL, 0x9400D3));
    
    public static final RegistryObject<MobEffect> MUSHROOM_TRIP = EFFECTS.register("mushroom_trip",
        () -> new MushroomTripEffect(MobEffectCategory.BENEFICIAL, 0xFF8C00));
    
    public static final RegistryObject<MobEffect> KETAMINE_HIGH = EFFECTS.register("ketamine_high",
        () -> new KetamineHighEffect(MobEffectCategory.BENEFICIAL, 0x00CED1));
    
    // Dissociative effects
    public static final RegistryObject<MobEffect> K_HOLE = EFFECTS.register("k_hole",
        () -> new KHoleEffect(MobEffectCategory.HARMFUL, 0x000080));
    
    // Solvent effects
    public static final RegistryObject<MobEffect> SOLVENT_HIGH = EFFECTS.register("solvent_high",
        () -> new SolventHighEffect(MobEffectCategory.HARMFUL, 0x808080));
    
    // Negative effects
    public static final RegistryObject<MobEffect> WITHDRAWAL = EFFECTS.register("withdrawal",
        () -> new WithdrawalEffect(MobEffectCategory.HARMFUL, 0x800000));
    
    public static final RegistryObject<MobEffect> OVERDOSE = EFFECTS.register("overdose",
        () -> new OverdoseEffect(MobEffectCategory.HARMFUL, 0x000000));
    
    public static final RegistryObject<MobEffect> SEROTONIN_SYNDROME = EFFECTS.register("serotonin_syndrome",
        () -> new SerotoninSyndromeEffect(MobEffectCategory.HARMFUL, 0xFF0000));
    
    public static final RegistryObject<MobEffect> ANXIETY = EFFECTS.register("anxiety",
        () -> new AnxietyEffect(MobEffectCategory.HARMFUL, 0xFFD700));
    
    public static final RegistryObject<MobEffect> PARANOIA = EFFECTS.register("paranoia",
        () -> new ParanoiaEffect(MobEffectCategory.HARMFUL, 0x8B0000));
    
    public static final RegistryObject<MobEffect> PSYCHOSIS = EFFECTS.register("psychosis",
        () -> new PsychosisEffect(MobEffectCategory.HARMFUL, 0x4B0082));
    
    public static final RegistryObject<MobEffect> NALOXONE_EFFECT = EFFECTS.register("naloxone_effect",
        () -> new NaloxoneEffect(MobEffectCategory.BENEFICIAL, 0xFFFFFF));

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }
}
