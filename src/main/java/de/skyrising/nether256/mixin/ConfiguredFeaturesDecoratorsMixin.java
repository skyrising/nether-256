package de.skyrising.nether256.mixin;

import net.minecraft.world.gen.feature.ConfiguredFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ConfiguredFeatures.Decorators.class)
public class ConfiguredFeaturesDecoratorsMixin {
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 128))
    private static int netherHeight(int height) {
        return 256;
    }
}
