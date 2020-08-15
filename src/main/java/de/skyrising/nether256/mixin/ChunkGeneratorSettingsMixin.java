package de.skyrising.nether256.mixin;

import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChunkGeneratorSettings.class)
public class ChunkGeneratorSettingsMixin {
    @ModifyConstant(method = "createUndergroundSettings", constant = @Constant(intValue = 128))
    private static int netherHeight(int height) {
        return 256;
    }
}
