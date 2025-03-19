package com.kaicen.gc.mixin;

import io.github.uhq_games.regions_unexplored.world.level.region.RuRegionPrimary;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import terrablender.api.RegionType;
import org.apache.commons.lang3.tuple.Pair;

import java.util.function.Consumer;

@Mixin(RuRegionPrimary.class)
public class RuRegionPrimaryMixin {

    /*@ModifyArg(
            method = "<init>",
            at = @At(value = "INVOKE", target = "Lterrablender/api/Region;<init>(Lnet/minecraft/resources/ResourceLocation;Lterrablender/api/RegionType;I)V"),
            index = 1
    )
    private static RegionType modifyRegionType(RegionType original) {
        // 返回您想要的新维度类型
        return RegionType.valueOf("Oxygen_not_include:ru");
    }*/
    
    // 注入addBiomes方法，使其直接返回而不执行原有代码
    @Inject(method = "addBiomes", at = @At("HEAD"), cancellable = true)
    private void injectAddBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, CallbackInfo ci) {
        // 取消原方法的执行，直接返回
        ci.cancel();
    }
}


