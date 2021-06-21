package me.metallicgoat.PopUpTowers.config;

import me.metallicgoat.PopUpTowers.Main;

public class ConfigManager implements Config {

    Main plugin = Main.getInstance();

    @Override
    public long getAnimationSpeed() {
        return plugin.getConfig().getLong("Animation-Speed");
    }

    @Override
    public int getTeamSpawnRadius() {
        return plugin.getConfig().getInt("Anti-Place-TeamSpawn-Radius");
    }

    @Override
    public int getItemSpawnerRadius() {
        return plugin.getConfig().getInt("Anti-Place-ItemSpawner-Radius");
    }

    @Override
    public String getAntiPlaceMessage() {
        return plugin.getConfig().getString("Anti-Place-Message");
    }
}
