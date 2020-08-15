package de.skyrising.nether256.mixin;

import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(DimensionType.class)
public class DimensionTypeMixin {
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 128))
    private static int netherHeight(int height) {
        return 256;
    }
}
