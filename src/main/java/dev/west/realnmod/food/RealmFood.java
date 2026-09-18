package dev.west.realnmod.food;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class RealmFood {
    public static final FoodProperties DARK_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.26f).build();
    public static final FoodProperties SILVER_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.1f).build();
    public static final FoodProperties MUSHROOM = new FoodProperties.Builder().nutrition(4).saturationModifier(0.1f).build();

    public static final Consumable DARK_APPLE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,300), 0.10F)).build();
    public static final Consumable SILVER_APPLE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,300), 0.10F)).build();
    public static final Consumable MUSHROOM_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,300), 0.10F)).build();
}
