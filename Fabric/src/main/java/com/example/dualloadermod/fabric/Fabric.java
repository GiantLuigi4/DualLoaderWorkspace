package com.example.dualloadermod.fabric;

import com.example.dualloadermod.common.EnvironmentInfo;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

public class Fabric implements ModInitializer {
	@Override
	public void onInitialize() {
		new EnvironmentInfo(false, false /*todo: learn how to detect if the game is in production on fabric*/, MinecraftClient.getInstance().getGame().getVersion().getName());
		System.out.println(EnvironmentInfo.getInfo());
	}
}
