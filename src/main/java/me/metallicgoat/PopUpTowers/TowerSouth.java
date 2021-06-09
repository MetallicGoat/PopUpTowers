package me.metallicgoat.PopUpTowers;

import de.marcely.bedwars.api.game.specialitem.SpecialItemUseSession;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class TowerSouth {
    public TowerSouth(Location loc, Block chest, DyeColor color, Player p, SpecialItemUseSession session) {
        Main plugin = Main.getInstance();

        new BlockManager(chest, 1, 0, 2, color, p, false, "NORTH");
        new BlockManager(chest, 2, 0, 1, color, p, false, "NORTH");
        new BlockManager(chest, 2, 0, 0, color, p, false, "NORTH");
        new BlockManager(chest, 1, 0, -1, color, p, false, "NORTH");
        new BlockManager(chest, 0, 0, -1, color, p, false, "NORTH");
        new BlockManager(chest, -1, 0, -1, color, p, false, "NORTH");
        new BlockManager(chest, -2, 0, 0, color, p, false, "NORTH");
        new BlockManager(chest, -2, 0, 1, color, p, false, "NORTH");
        new BlockManager(chest, -1, 0, 2, color, p, false, "NORTH");
        new BlockManager(chest, 0, 0, 0, color, p, true, "NORTH");
        if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
            loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
        } else {
            loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
        }

        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            new BlockManager(chest, 1, 1, 2, color, p, false, "NORTH");
            new BlockManager(chest, 2, 1, 1, color, p, false, "NORTH");
            new BlockManager(chest, 2, 1, 0, color, p, false, "NORTH");
            new BlockManager(chest, 1, 1, -1, color, p, false, "NORTH");
            new BlockManager(chest, 0, 1, -1, color, p, false, "NORTH");
            new BlockManager(chest, -1, 1, -1, color, p, false, "NORTH");
            new BlockManager(chest, -2, 1, 0, color, p, false, "NORTH");
            new BlockManager(chest, -2, 1, 1, color, p, false, "NORTH");
            new BlockManager(chest, -1, 1, 2, color, p, false, "NORTH");
            new BlockManager(chest, 0, 1, 0, color, p, true, "NORTH");
            if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
            } else {
                loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
            }

            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                new BlockManager(chest, 1, 2, 2, color, p, false, "NORTH");
                new BlockManager(chest, 2, 2, 1, color, p, false, "NORTH");
                new BlockManager(chest, 2, 2, 0, color, p, false, "NORTH");
                new BlockManager(chest, 1, 2, -1, color, p, false, "NORTH");
                new BlockManager(chest, 0, 2, -1, color, p, false, "NORTH");
                new BlockManager(chest, -1, 2, -1, color, p, false, "NORTH");
                new BlockManager(chest, -2, 2, 0, color, p, false, "NORTH");
                new BlockManager(chest, -2, 2, 1, color, p, false, "NORTH");
                new BlockManager(chest, -1, 2, 2, color, p, false, "NORTH");
                new BlockManager(chest, 0, 2, 0, color, p, true, "NORTH");
                if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                    loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                } else {
                    loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                }

                Bukkit.getScheduler().runTaskLater(plugin, () -> {
                    new BlockManager(chest, 0, 3, 2, color, p, false, "NORTH");
                    new BlockManager(chest, 1, 3, 2, color, p, false, "NORTH");
                    new BlockManager(chest, 2, 3, 1, color, p, false, "NORTH");
                    new BlockManager(chest, 2, 3, 0, color, p, false, "NORTH");
                    new BlockManager(chest, 1, 3, -1, color, p, false, "NORTH");
                    new BlockManager(chest, 0, 3, -1, color, p, false, "NORTH");
                    new BlockManager(chest, -1, 3, -1, color, p, false, "NORTH");
                    new BlockManager(chest, -2, 3, 0, color, p, false, "NORTH");
                    new BlockManager(chest, -2, 3, 1, color, p, false, "NORTH");
                    new BlockManager(chest, -1, 3, 2, color, p, false, "NORTH");
                    new BlockManager(chest, 0, 3, 0, color, p, true, "NORTH");
                    if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                        loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                    } else {
                        loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                    }

                    Bukkit.getScheduler().runTaskLater(plugin, () -> {
                        new BlockManager(chest, 2, 4, -1, color, p, false, "NORTH");
                        new BlockManager(chest, 2, 4, 0, color, p, false, "NORTH");
                        new BlockManager(chest, 2, 4, 1, color, p, false, "NORTH");
                        new BlockManager(chest, 2, 4, 2, color, p, false, "NORTH");
                        new BlockManager(chest, 1, 4, -1, color, p, false, "NORTH");
                        new BlockManager(chest, 1, 4, 0, color, p, false, "NORTH");
                        new BlockManager(chest, 1, 4, 1, color, p, false, "NORTH");
                        new BlockManager(chest, 1, 4, 2, color, p, false, "NORTH");
                        new BlockManager(chest, 0, 4, -1, color, p, false, "NORTH");
                        new BlockManager(chest, 0, 4, 1, color, p, false, "NORTH");
                        new BlockManager(chest, 0, 4, 2, color, p, false, "NORTH");
                        new BlockManager(chest, -1, 4, -1, color, p, false, "NORTH");
                        new BlockManager(chest, -1, 4, 0, color, p, false, "NORTH");
                        new BlockManager(chest, -1, 4, 1, color, p, false, "NORTH");
                        new BlockManager(chest, -1, 4, 2, color, p, false, "NORTH");
                        new BlockManager(chest, -2, 4, -1, color, p, false, "NORTH");
                        new BlockManager(chest, -2, 4, 0, color, p, false, "NORTH");
                        new BlockManager(chest, -2, 4, 1, color, p, false, "NORTH");
                        new BlockManager(chest, -2, 4, 2, color, p, false, "NORTH");
                        new BlockManager(chest, 0, 4, 0, color, p, true, "NORTH");
                        if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                            loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                        } else {
                            loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                        }

                        Bukkit.getScheduler().runTaskLater(plugin, () -> {
                            new BlockManager(chest, 3, 4, 2, color, p, false, "NORTH");
                            new BlockManager(chest, 3, 5, 2, color, p, false, "NORTH");
                            new BlockManager(chest, 3, 6, 2, color, p, false, "NORTH");
                            new BlockManager(chest, 3, 5, 1, color, p, false, "NORTH");
                            new BlockManager(chest, 3, 5, 0, color, p, false, "NORTH");
                            new BlockManager(chest, 3, 4, -1, color, p, false, "NORTH");
                            new BlockManager(chest, 3, 5, -1, color, p, false, "NORTH");
                            new BlockManager(chest, 3, 6, -1, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 4, 2, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 5, 2, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 6, 2, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 5, 1, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 5, 0, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 4, -1, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 5, -1, color, p, false, "NORTH");
                            new BlockManager(chest, -3, 6, -1, color, p, false, "NORTH");
                            new BlockManager(chest, 2, 4, -2, color, p, false, "NORTH");
                            new BlockManager(chest, 2, 5, -2, color, p, false, "NORTH");
                            new BlockManager(chest, 2, 6, -2, color, p, false, "NORTH");
                            new BlockManager(chest, 1, 5, -2, color, p, false, "NORTH");
                            new BlockManager(chest, 0, 4, -2, color, p, false, "NORTH");
                            new BlockManager(chest, 0, 5, -2, color, p, false, "NORTH");
                            new BlockManager(chest, 0, 6, -2, color, p, false, "NORTH");
                            new BlockManager(chest, -1, 5, -2, color, p, false, "NORTH");
                            new BlockManager(chest, -2, 4, -2, color, p, false, "NORTH");
                            new BlockManager(chest, -2, 5, -2, color, p, false, "NORTH");
                            new BlockManager(chest, -2, 6, -2, color, p, false, "NORTH");
                            new BlockManager(chest, 2, 4, 3, color, p, false, "NORTH");
                            new BlockManager(chest, 2, 5, 3, color, p, false, "NORTH");
                            new BlockManager(chest, 2, 6, 3, color, p, false, "NORTH");
                            new BlockManager(chest, 1, 5, 3, color, p, false, "NORTH");
                            new BlockManager(chest, 0, 4, 3, color, p, false, "NORTH");
                            new BlockManager(chest, 0, 5, 3, color, p, false, "NORTH");
                            new BlockManager(chest, 0, 6, 3, color, p, false, "NORTH");
                            new BlockManager(chest, -1, 5, 3, color, p, false, "NORTH");
                            new BlockManager(chest, -2, 4, 3, color, p, false, "NORTH");
                            new BlockManager(chest, -2, 5, 3, color, p, false, "NORTH");
                            new BlockManager(chest, -2, 6, 3, color, p, false, "NORTH");
                            if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                                loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                            } else {
                                loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                            }
                            session.stop();

                        }, 3L);
                    }, 3L);
                }, 3L);
            }, 3L);
        }, 3L);
    }
}
