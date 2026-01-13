package com.example.drugsmod.core.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class HeroinHighEffect extends MobEffect {
    public HeroinHighEffect(MobEffectCategory category, int color) {
        super(category, color);
        this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-4238-4DB8-935B-03B6D42C7C6F", 
            -0.3D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "91AEAA56-4238-4DB8-935B-03B6D42C7C70", 
            -0.4D, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        // Strong pain relief
        entity.setHealth(Math.min(entity.getHealth() + 2.0f * (amplifier + 1), entity.getMaxHealth()));
        
        // Respiratory depression risk
        if (amplifier > 1 && entity.getRandom().nextFloat() < 0.1f * amplifier) {
            entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                net.minecraft.world.effect.MobEffects.SLOWNESS, 100, amplifier));
        }
        
        // Overdose risk at high doses
        if (amplifier > 2 && entity.getRandom().nextFloat() < 0.05f * (amplifier - 1)) {
            entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                ModEffects.OVERDOSE.get(), 600, 0));
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 30 == 0;
    }
}
