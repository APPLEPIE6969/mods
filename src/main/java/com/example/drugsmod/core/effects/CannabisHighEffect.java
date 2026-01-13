package com.example.drugsmod.core.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;

public class CannabisHighEffect extends MobEffect {
    public CannabisHighEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            FoodData foodData = player.getFoodData();
            
            // Munchies effect - increased hunger
            if (entity.getRandom().nextFloat() < 0.3f * (amplifier + 1)) {
                foodData.setFoodLevel(Math.max(0, foodData.getFoodLevel() - 1));
            }
            
            // Relaxation - slow falling effect
            if (entity.getRandom().nextFloat() < 0.1f) {
                entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.SLOW_FALLING, 100, 0));
            }
            
            // Anxiety at higher doses
            if (amplifier > 2 && entity.getRandom().nextFloat() < 0.05f * (amplifier - 1)) {
                entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    ModEffects.ANXIETY.get(), 300, 0));
            }
            
            // Paranoia at very high doses
            if (amplifier > 3 && entity.getRandom().nextFloat() < 0.02f * (amplifier - 2)) {
                entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    ModEffects.PARANOIA.get(), 400, 0));
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 40 == 0;
    }
}
