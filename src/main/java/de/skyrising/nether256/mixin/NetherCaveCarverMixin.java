package de.skyrising.nether256.mixin;

import net.minecraft.world.gen.carver.NetherCaveCarver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(NetherCaveCarver.class)
public class NetherCaveCarverMixin {
    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 128))
    private static int netherHeight(int height) {
        return 256;
    }
}
