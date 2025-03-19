package com.kaicen.gc;


import io.github.uhq_games.regions_unexplored.world.level.region.RuRegionPrimary;
import io.github.uhq_games.regions_unexplored.world.level.region.RuRegionSecondary;
import net.fabricmc.api.ModInitializer;
import com.kaicen.gc.dimension.DimensionRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class Generate_changed implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "generate_changed";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// 注册维度
		DimensionRegistry.init();

		LOGGER.info("Hello Fabric world!");
	}

	@Override
	public void onTerraBlenderInitialized() {
		Regions.remove(RegionType.OVERWORLD, RuRegionPrimary.LOCATION);
		Regions.remove(RegionType.OVERWORLD, RuRegionSecondary.LOCATION);
	}
}