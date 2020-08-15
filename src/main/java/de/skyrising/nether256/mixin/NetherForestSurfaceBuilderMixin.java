package de.skyrising.nether256.mixin;

import net.minecraft.world.gen.surfacebuilder.NetherForestSurfaceBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(NetherForestSurfaceBuilder.class)
public class NetherForestSurfaceBuilderMixin {
    @ModifyConstant(method = "generate", constant = @Constant(intValue = 127))
    private int netherHeight(int height) {
        return height + 128;
    }
}
