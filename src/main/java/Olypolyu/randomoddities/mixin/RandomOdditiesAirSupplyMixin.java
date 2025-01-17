package Olypolyu.randomoddities.mixin;

import net.minecraft.core.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = Entity.class, remap = false)
public interface RandomOdditiesAirSupplyMixin {
    @Accessor("airMaxSupply")
    int getMaxAir();
}
