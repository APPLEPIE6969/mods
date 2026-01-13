package com.example.drugsmod.core.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class AmphetamineHighEffect extends MobEffect {
    public AmphetamineHighEffect(MobEffectCategory category, int color) {
        super(category, color);
        this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", 
            0.15D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(Attributes.ATTACK_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160891", 
            0.2D, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.getRandom().nextFloat() < 0.1f * (amplifier + 1)) {
            entity.setHealth(Math.min(entity.getHealth() + 1.0f, entity.getMaxHealth()));
        }
        
        // Anxiety side effect at higher doses
        if (amplifier > 1 && entity.getRandom().nextFloat() < 0.05f * amplifier) {
            entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                ModEffects.ANXIETY.get(), 200, amplifier - 1));
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 20 == 0;
    }
}
