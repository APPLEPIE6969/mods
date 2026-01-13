package com.example.drugsmod.core.effects;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class DrugCombinationSystem {
    private static final Map<String, CombinationEffect> COMBINATIONS = new HashMap<>();
    
    static {
        // Stimulant + Stimulant = Serotonin Syndrome
        COMBINATIONS.put("cocaine+mdma", new CombinationEffect(
            ModEffects.SEROTONIN_SYNDROME.get(), 600, 2, "Deadly stimulant combination"));
        COMBINATIONS.put("meth+ecstasy", new CombinationEffect(
            ModEffects.SEROTONIN_SYNDROME.get(), 800, 3, "Extreme serotonin syndrome"));
        COMBINATIONS.put("amphetamine+mdma", new CombinationEffect(
            ModEffects.SEROTONIN_SYNDROME.get(), 500, 2, "Serotonin syndrome"));
        
        // Cocaine + Alcohol = Cocaethylene
        COMBINATIONS.put("cocaine+alcohol", new CombinationEffect(
            ModEffects.OVERDOSE.get(), 400, 1, "Cocaethylene formation"));
        
        // Depressant + Depressant = Overdose
        COMBINATIONS.put("heroin+alcohol", new CombinationEffect(
            ModEffects.OVERDOSE.get(), 600, 2, "Respiratory depression"));
        COMBINATIONS.put("ghb+alcohol", new CombinationEffect(
            ModEffects.OVERDOSE.get(), 800, 3, "Complete respiratory failure"));
        COMBINATIONS.put("benzo+heroin", new CombinationEffect(
            ModEffects.OVERDOSE.get(), 700, 2, "Enhanced sedation"));
        
        // Stimulant + Depressant = Heart stress
        COMBINATIONS.put("cocaine+heroin", new CombinationEffect(
            ModEffects.OVERDOSE.get(), 500, 2, "Speedball - heart failure"));
        COMBINATIONS.put("meth+alcohol", new CombinationEffect(
            ModEffects.OVERDOSE.get(), 400, 1, "Heart strain"));
        
        // Multiple substances = Enhanced psychosis
        COMBINATIONS.put("cocaine+mdma+lsd", new CombinationEffect(
            ModEffects.PSYCHOSIS.get(), 1000, 2, "Multi-drug psychosis"));
        COMBINATIONS.put("meth+amphetamine+crack", new CombinationEffect(
            ModEffects.PSYCHOSIS.get(), 800, 3, "Stimulant psychosis"));
        
        // Ketamine combinations
        COMBINATIONS.put("ketamine+alcohol", new CombinationEffect(
            ModEffects.OVERDOSE.get(), 600, 2, "K-hole + depression"));
        COMBINATIONS.put("ketamine+heroin", new CombinationEffect(
            ModEffects.K_HOLE.get(), 900, 2, "Deep dissociation"));
    }
    
    public static void checkCombinations(LivingEntity entity, ItemStack newDrug) {
        if (!(entity instanceof Player)) return;
        
        Player player = (Player) player;
        String newDrugType = getDrugType(newDrug);
        
        // Check existing effects for dangerous combinations
        for (MobEffectInstance existingEffect : player.getActiveEffects()) {
            String existingDrugType = getDrugTypeFromEffect(existingEffect.getEffect());
            
            if (existingDrugType != null && newDrugType != null) {
                String combinationKey = existingDrugType + "+" + newDrugType;
                String reverseKey = newDrugType + "+" + existingDrugType;
                
                if (COMBINATIONS.containsKey(combinationKey)) {
                    applyCombinationEffect(player, COMBINATIONS.get(combinationKey));
                } else if (COMBINATIONS.containsKey(reverseKey)) {
                    applyCombinationEffect(player, COMBINATIONS.get(reverseKey));
                }
            }
        }
    }
    
    private static void applyCombinationEffect(Player player, CombinationEffect effect) {
        player.addEffect(new MobEffectInstance(effect.effect, effect.duration, effect.amplifier));
        
        // Send warning message
        player.sendSystemMessage(net.minecraft.network.chat.Component.literal(
            "§c§lDANGEROUS COMBINATION: " + effect.description));
    }
    
    private static String getDrugType(ItemStack stack) {
        // This would need to be implemented based on your item registry
        // For now, return null
        return null;
    }
    
    private static String getDrugTypeFromEffect(net.minecraft.world.effect.MobEffect effect) {
        // Map effects back to drug types
        if (effect == ModEffects.COCAINE_HIGH.get()) return "cocaine";
        if (effect == ModEffects.HEROIN_HIGH.get()) return "heroin";
        if (effect == ModEffects.METH_HIGH.get()) return "meth";
        if (effect == ModEffects.ECSTASY_HIGH.get()) return "mdma";
        if (effect == ModEffects.AMPHETAMINE_HIGH.get()) return "amphetamine";
        if (effect == ModEffects.GHB_HIGH.get()) return "ghb";
        if (effect == ModEffects.BENZO_SEDATION.get()) return "benzo";
        if (effect == ModEffects.KETAMINE_HIGH.get()) return "ketamine";
        if (effect == ModEffects.CANNABIS_HIGH.get()) return "cannabis";
        if (effect == ModEffects.LSD_TRIP.get()) return "lsd";
        
        return null;
    }
    
    private static class CombinationEffect {
        final net.minecraft.world.effect.MobEffect effect;
        final int duration;
        final int amplifier;
        final String description;
        
        CombinationEffect(net.minecraft.world.effect.MobEffect effect, int duration, int amplifier, String description) {
            this.effect = effect;
            this.duration = duration;
            this.amplifier = amplifier;
            this.description = description;
        }
    }
}
