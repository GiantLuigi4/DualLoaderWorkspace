package com.example.dualloadermod.forge;

import com.example.dualloadermod.common.EnvironmentInfo;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("dualloadermod")
public class DualLoaderMod {
	public DualLoaderMod() {
		//todo: figure out how to get forge workspace to work in dev envro
		new EnvironmentInfo(true, FMLEnvironment.production, Minecraft.getInstance().getMinecraftGame().getVersion().getName());
		System.out.println(EnvironmentInfo.getInfo());
	}
}
