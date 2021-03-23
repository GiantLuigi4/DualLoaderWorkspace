package com.example.dualloadermod.common;

import java.util.Objects;

public class EnvironmentInfo {
	protected static EnvironmentInfo info = null;
	
	public final boolean isForge;
	public final boolean isProduction;
	public final String gameVersion;
	
	public static EnvironmentInfo getInfo() {
		return info;
	}
	
	public EnvironmentInfo(boolean isForge, boolean isProduction, String gameVersion) {
		this.isForge = isForge;
		this.isProduction = isProduction;
		this.gameVersion = gameVersion;
		if (info == null) {
			info = this;
		} else {
			throw new RuntimeException(new IllegalAccessException(""));
		}
	}
	
	@Override
	public String toString() {
		return "{\n" +
				"  \"Loader\": \"" + (isForge ? "Forge" : "Fabric") + "\",\n" +
				"  \"isProduction\": " + isProduction + ",\n" +
				"  \"gameVersion\": \"" + gameVersion + "\"\n" +
				"}";
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EnvironmentInfo that = (EnvironmentInfo) o;
		return isForge == that.isForge &&
				isProduction == that.isProduction &&
				Objects.equals(gameVersion, that.gameVersion);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(isForge, isProduction, gameVersion);
	}
}
