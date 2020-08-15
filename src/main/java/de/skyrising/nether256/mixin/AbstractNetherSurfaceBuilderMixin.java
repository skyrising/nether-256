package de.skyrising.nether256.mixin;

import net.minecraft.world.gen.surfacebuilder.AbstractNetherSurfaceBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AbstractNetherSurfaceBuilder.class)
public class AbstractNetherSurfaceBuilderMixin {
    @ModifyConstant(method = "generate", constant = {@Constant(intValue = 127), @Constant(intValue = 128)})
    private int netherHeight(int height) {
        return height + 128;
    }
}
