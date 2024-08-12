package dev.compasses.mod_issues;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModIssues implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Mod Issues");

	@Override
	public void onInitialize() {
		ModContainer mod = FabricLoader.getInstance().getModContainer("mod-issues").orElseThrow();
		LOGGER.info("Hello Fabric world from {}! Stay fresh!", mod.getMetadata().getName());
	}
}
