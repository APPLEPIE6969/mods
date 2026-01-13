package com.example.drugsmod.core.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class OverdoseEffect extends MobEffect {
    public OverdoseEffect(MobEffectCategory category, int color) {
        super(category, color);
        this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "6E1B5C4A-2F8E-4D9A-8B3C-7D9F0E1A2B3C", 
            -0.8D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "6E1B5C4A-2F8E-4D9A-8B3C-7D9F0E1A2B3D", 
            -0.9D, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        // Rapid health loss
        entity.hurt(entity.damageSources().magic(), 2.0f * (amplifier + 1));
        
        // Nausea and confusion
        entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
            net.minecraft.world.effect.MobEffects.CONFUSION, 200, amplifier));
        
        entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
            net.minecraft.world.effect.MobEffects.WEAKNESS, 200, amplifier));
        
        // High risk of death
        if (entity.getRandom().nextFloat() < 0.1f * (amplifier + 1)) {
            entity.hurt(entity.damageSources().genericKill(), 10.0f);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 20 == 0;
    }
}
