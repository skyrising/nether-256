package de.skyrising.nether256.mixin;

import net.minecraft.world.gen.feature.ConfiguredFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(ConfiguredFeatures.class)
public class ConfiguredFeaturesMixin {
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 128), slice = @Slice(to = @At(value = "CONSTANT", args = "stringValue=ore_magma")))
    private static int netherHeight(int height) {
        return 256;
    }
}
