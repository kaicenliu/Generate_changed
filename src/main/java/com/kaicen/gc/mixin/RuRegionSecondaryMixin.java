package com.kaicen.gc.mixin;

import io.github.uhq_games.regions_unexplored.world.level.region.RuRegionSecondary;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(RuRegionSecondary.class)
public class RuRegionSecondaryMixin {
    @Inject(method = "addBiomes", at = @At("HEAD"), cancellable = true)
    private void injectAddBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, CallbackInfo ci) {
        // 取消原方法的执行，直接返回
        ci.cancel();
    }
}
