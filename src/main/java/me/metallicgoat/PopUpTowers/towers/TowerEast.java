package me.metallicgoat.PopUpTowers.towers;

import de.marcely.bedwars.api.game.specialitem.SpecialItemUseSession;
import me.metallicgoat.PopUpTowers.BlockManager;
import me.metallicgoat.PopUpTowers.Main;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class TowerEast {
    public TowerEast(Location loc, Block clicked, DyeColor color, Player p, SpecialItemUseSession session) {
        Main plugin = Main.getInstance();

        final long a = getSpeed();

        new BlockManager(clicked, 2, 0, -1, color, p, false, "WEST");
        new BlockManager(clicked, 1, 0, -2, color, p, false, "WEST");
        new BlockManager(clicked, 0, 0, -2, color, p, false, "WEST");
        new BlockManager(clicked, -1, 0, -1, color, p, false, "WEST");
        new BlockManager(clicked, -1, 0, 0, color, p, false, "WEST");
        new BlockManager(clicked, -1, 0, 1, color, p, false, "WEST");
        new BlockManager(clicked, 0, 0, 2, color, p, false, "WEST");
        new BlockManager(clicked, 1, 0, 2, color, p, false, "WEST");
        new BlockManager(clicked, 2, 0, 1, color, p, false, "WEST");
        new BlockManager(clicked, 0, 0, 0, color, p, true, "WEST");
        if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
            loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
        } else {
            loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
        }

        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            new BlockManager(clicked, 2, 1, -1, color, p, false, "WEST");
            new BlockManager(clicked, 1, 1, -2, color, p, false, "WEST");
            new BlockManager(clicked, 0, 1, -2, color, p, false, "WEST");
            new BlockManager(clicked, -1, 1, -1, color, p, false, "WEST");
            new BlockManager(clicked, -1, 1, 0, color, p, false, "WEST");
            new BlockManager(clicked, -1, 1, 1, color, p, false, "WEST");
            new BlockManager(clicked, 0, 1, 2, color, p, false, "WEST");
            new BlockManager(clicked, 1, 1, 2, color, p, false, "WEST");
            new BlockManager(clicked, 2, 1, 1, color, p, false, "WEST");
            new BlockManager(clicked, 0, 1, 0, color, p, true, "WEST");
            if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
            } else {
                loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
            }

            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                new BlockManager(clicked, 2, 2, -1, color, p, false, "WEST");
                new BlockManager(clicked, 1, 2, -2, color, p, false, "WEST");
                new BlockManager(clicked, 0, 2, -2, color, p, false, "WEST");
                new BlockManager(clicked, -1, 2, -1, color, p, false, "WEST");
                new BlockManager(clicked, -1, 2, 0, color, p, false, "WEST");
                new BlockManager(clicked, -1, 2, 1, color, p, false, "WEST");
                new BlockManager(clicked, 0, 2, 2, color, p, false, "WEST");
                new BlockManager(clicked, 1, 2, 2, color, p, false, "WEST");
                new BlockManager(clicked, 2, 2, 1, color, p, false, "WEST");
                new BlockManager(clicked, 0, 2, 0, color, p, true, "WEST");
                if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                    loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                } else {
                    loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                }

                Bukkit.getScheduler().runTaskLater(plugin, () -> {
                    new BlockManager(clicked, 2, 3, 0, color, p, false, "WEST");
                    new BlockManager(clicked, 2, 3, -1, color, p, false, "WEST");
                    new BlockManager(clicked, 1, 3, -2, color, p, false, "WEST");
                    new BlockManager(clicked, 0, 3, -2, color, p, false, "WEST");
                    new BlockManager(clicked, -1, 3, -1, color, p, false, "WEST");
                    new BlockManager(clicked, -1, 3, 0, color, p, false, "WEST");
                    new BlockManager(clicked, -1, 3, 1, color, p, false, "WEST");
                    new BlockManager(clicked, 0, 3, 2, color, p, false, "WEST");
                    new BlockManager(clicked, 1, 3, 2, color, p, false, "WEST");
                    new BlockManager(clicked, 2, 3, 1, color, p, false, "WEST");
                    new BlockManager(clicked, 0, 3, 0, color, p, true, "WEST");
                    if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                        loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                    } else {
                        loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                    }

                    Bukkit.getScheduler().runTaskLater(plugin, () -> {
                        new BlockManager(clicked, -1, 4, -2, color, p, false, "WEST");
                        new BlockManager(clicked, 0, 4, -2, color, p, false, "WEST");
                        new BlockManager(clicked, 1, 4, -2, color, p, false, "WEST");
                        new BlockManager(clicked, 2, 4, -2, color, p, false, "WEST");
                        new BlockManager(clicked, -1, 4, -1, color, p, false, "WEST");
                        new BlockManager(clicked, 0, 4, -1, color, p, false, "WEST");
                        new BlockManager(clicked, 1, 4, -1, color, p, false, "WEST");
                        new BlockManager(clicked, 2, 4, -1, color, p, false, "WEST");
                        new BlockManager(clicked, -1, 4, 0, color, p, false, "WEST");
                        new BlockManager(clicked, 1, 4, 0, color, p, false, "WEST");
                        new BlockManager(clicked, 2, 4, 0, color, p, false, "WEST");
                        new BlockManager(clicked, -1, 4, 1, color, p, false, "WEST");
                        new BlockManager(clicked, 0, 4, 1, color, p, false, "WEST");
                        new BlockManager(clicked, 1, 4, 1, color, p, false, "WEST");
                        new BlockManager(clicked, 2, 4, 1, color, p, false, "WEST");
                        new BlockManager(clicked, -1, 4, 2, color, p, false, "WEST");
                        new BlockManager(clicked, 0, 4, 2, color, p, false, "WEST");
                        new BlockManager(clicked, 1, 4, 2, color, p, false, "WEST");
                        new BlockManager(clicked, 2, 4, 2, color, p, false, "WEST");
                        new BlockManager(clicked, 0, 4, 0, color, p, true, "WEST");
                        if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                            loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                        } else {
                            loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                        }

                        Bukkit.getScheduler().runTaskLater(plugin, () -> {
                            new BlockManager(clicked, 2, 4, -3, color, p, false, "WEST");
                            new BlockManager(clicked, 2, 5, -3, color, p, false, "WEST");
                            new BlockManager(clicked, 2, 6, -3, color, p, false, "WEST");
                            new BlockManager(clicked, 1, 5, -3, color, p, false, "WEST");
                            new BlockManager(clicked, 0, 5, -3, color, p, false, "WEST");
                            new BlockManager(clicked, -1, 4, -3, color, p, false, "WEST");
                            new BlockManager(clicked, -1, 5, -3, color, p, false, "WEST");
                            new BlockManager(clicked, -1, 6, -3, color, p, false, "WEST");
                            new BlockManager(clicked, 2, 4, 3, color, p, false, "WEST");
                            new BlockManager(clicked, 2, 5, 3, color, p, false, "WEST");
                            new BlockManager(clicked, 2, 6, 3, color, p, false, "WEST");
                            new BlockManager(clicked, 1, 5, 3, color, p, false, "WEST");
                            new BlockManager(clicked, 0, 5, 3, color, p, false, "WEST");
                            new BlockManager(clicked, -1, 4, 3, color, p, false, "WEST");
                            new BlockManager(clicked, -1, 5, 3, color, p, false, "WEST");
                            new BlockManager(clicked, -1, 6, 3, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 4, -2, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 5, -2, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 6, -2, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 5, -1, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 4, 0, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 5, 0, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 6, 0, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 5, 1, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 4, 2, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 5, 2, color, p, false, "WEST");
                            new BlockManager(clicked, -2, 6, 2, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 4, -2, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 5, -2, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 6, -2, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 5, -1, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 4, 0, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 5, 0, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 6, 0, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 5, 1, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 4, 2, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 5, 2, color, p, false, "WEST");
                            new BlockManager(clicked, 3, 6, 2, color, p, false, "WEST");
                            if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                                loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                            } else {
                                loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                            }
                            session.stop();

                        }, a);
                    }, a);
                }, a);
            }, a);
        }, a);
    }
    private long getSpeed(){
        return Main.getConfigManager().getAnimationSpeed();
    }
}
