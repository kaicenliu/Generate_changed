package com.kaicen.gc.dimension;


import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class DimensionRegistry {

    public static ResourceLocation resourceLocation = new ResourceLocation("oxygen_not_include","ru");
    public static ResourceKey<DimensionType> RU ;
    public static ResourceKey<Level> RU_LEVEL;
    public static void init(){
        RU = ResourceKey.create(Registries.DIMENSION_TYPE,resourceLocation);
        RU_LEVEL = ResourceKey.create(Registries.DIMENSION,resourceLocation);
    }

} 