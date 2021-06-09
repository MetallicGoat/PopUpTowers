package me.metallicgoat.PopUpTowers;

import de.marcely.bedwars.api.game.specialitem.SpecialItemUseSession;
import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TowerMain {
    public TowerMain(Location loc, Block chest, DyeColor color, Player p, boolean up, SpecialItemUseSession session) {
        Main plugin = Main.getInstance();
        ItemStack itemInHand = p.getInventory().getItemInHand();
        if (itemInHand.getAmount() > 1) {
            itemInHand.setAmount(itemInHand.getAmount() - 1);
        } else {
            p.getInventory().setItemInHand((ItemStack)null);
        }

        /*new PlaceBlock(chest, -1, 1, 2, color, p, false, 0, up);
        new PlaceBlock(chest, 0, 1, 2, color, p, false, 0, up);
        new PlaceBlock(chest, 1, 1, 2, color, p, false, 0, up);
        new PlaceBlock(chest, 2, 1, 1, color, p, false, 0, up);
        new PlaceBlock(chest, 2, 1, 0, color, p, false, 0, up);
        new PlaceBlock(chest, 2, 1, -1, color, p, false, 0, up);
        new PlaceBlock(chest, 1, 1, -2, color, p, false, 0, up);
        new PlaceBlock(chest, 0, 1, -2, color, p, false, 0, up);
        new PlaceBlock(chest, -1, 1, -2, color, p, false, 0, up);
        new PlaceBlock(chest, -2, 1, -1, color, p, false, 0, up);
        new PlaceBlock(chest, -2, 1, -0, color, p, false, 0, up);
        new PlaceBlock(chest, -2, 1, 1, color, p, false, 0, up);
        if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
            loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
        } else {
            loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
        }

        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            new PlaceBlock(chest, -1, 2, 2, color, p, false, 0, up);
            new PlaceBlock(chest, 0, 2, 2, color, p, false, 0, up);
            new PlaceBlock(chest, 1, 2, 2, color, p, false, 0, up);
            new PlaceBlock(chest, 2, 2, 1, color, p, false, 0, up);
            new PlaceBlock(chest, 2, 2, 0, color, p, false, 0, up);
            new PlaceBlock(chest, 2, 2, -1, color, p, false, 0, up);
            new PlaceBlock(chest, 1, 2, -2, color, p, false, 0, up);
            new PlaceBlock(chest, 0, 2, -2, color, p, false, 0, up);
            new PlaceBlock(chest, -1, 2, -2, color, p, false, 0, up);
            new PlaceBlock(chest, -2, 2, -1, color, p, false, 0, up);
            new PlaceBlock(chest, -2, 2, -0, color, p, false, 0, up);
            new PlaceBlock(chest, -2, 2, 1, color, p, false, 0, up);
            if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
            } else {
                loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
            }

            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                new PlaceBlock(chest, -1, 3, 2, color, p, false, 0, up);
                new PlaceBlock(chest, 0, 3, 2, color, p, false, 0, up);
                new PlaceBlock(chest, 1, 3, 2, color, p, false, 0, up);
                new PlaceBlock(chest, 2, 3, 1, color, p, false, 0, up);
                new PlaceBlock(chest, 2, 3, 0, color, p, false, 0, up);
                new PlaceBlock(chest, 2, 3, -1, color, p, false, 0, up);
                new PlaceBlock(chest, 1, 3, -2, color, p, false, 0, up);
                new PlaceBlock(chest, 0, 3, -2, color, p, false, 0, up);
                new PlaceBlock(chest, -1, 3, -2, color, p, false, 0, up);
                new PlaceBlock(chest, -2, 3, -1, color, p, false, 0, up);
                new PlaceBlock(chest, -2, 3, -0, color, p, false,0, up);
                new PlaceBlock(chest, -2, 3, 1, color, p, false, 0, up);
                if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                    loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                } else {
                    loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                }

                Bukkit.getScheduler().runTaskLater(plugin, () -> {
                    new PlaceBlock(chest, -1, 4, 2, color, p, false, 0, up);
                    new PlaceBlock(chest, 0, 4, 2, color, p, false, 0, up);
                    new PlaceBlock(chest, 1, 4, 2, color, p, false, 0, up);
                    new PlaceBlock(chest, 2, 4, 1, color, p, false, 0, up);
                    new PlaceBlock(chest, 2, 4, 0, color, p, false, 0, up);
                    new PlaceBlock(chest, 2, 4, -1, color, p, false, 0, up);
                    new PlaceBlock(chest, 1, 4, -2, color, p, false, 0, up);
                    new PlaceBlock(chest, 0, 4, -2, color, p, false, 0, up);
                    new PlaceBlock(chest, -1, 4, -2, color, p, false, 0, up);
                    new PlaceBlock(chest, -2, 4, -1, color, p, false, 0, up);
                    new PlaceBlock(chest, -2, 4, -0, color, p, false, 0, up);
                    new PlaceBlock(chest, -2, 4, 1, color, p, false, 0, up);
                    if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                        loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                    } else {
                        loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                    }

                    Bukkit.getScheduler().runTaskLater(plugin, () -> {
                        new PlaceBlock(chest, -1, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, 0, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, 1, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, 1, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, 0, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, -1, color, p, false, 0, up);
                        new PlaceBlock(chest, 1, 5, -2, color, p, false, 0, up);
                        new PlaceBlock(chest, 0, 5, -2, color, p, false, 0, up);
                        new PlaceBlock(chest, -1, 5, -2, color, p, false, 0, up);
                        new PlaceBlock(chest, -2, 5, -1, color, p, false, 0, up);
                        new PlaceBlock(chest, -2, 5, -0, color, p, false, 0, up);
                        new PlaceBlock(chest, -2, 5, 1, color, p, false, 0, up);


                        new PlaceBlock(chest, 1, 5, 0, color, p, false, 0, up);
                        new PlaceBlock(chest, 1, 5, -1, color, p, false, 0, up);
                        new PlaceBlock(chest, 0, 5, -1, color, p, false, 0, up);
                        new PlaceBlock(chest, -1, 5, -1, color, p, false, 0, up);
                        new PlaceBlock(chest, -1, 5, 0, color, p, false, 0, up);
                        new PlaceBlock(chest, -1, 5, 1, color, p, false, 0, up);
                        new PlaceBlock(chest, 0, 5, 1, color, p, false, 0, up);
                        new PlaceBlock(chest, 1, 5, 1, color, p, false, 0, up);


                        new PlaceBlock(chest, 0, 5, 3, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, 3, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, 3, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, 0, 5, 3, color, p, false, 0, up);
                        new PlaceBlock(chest, 3, 5, -2, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, -2, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, -3, color, p, false, 0, up);
                        new PlaceBlock(chest, 0, 5, -3, color, p, false, 0, up);
                        new PlaceBlock(chest, -2, 5, -3, color, p, false, 0, up);
                        new PlaceBlock(chest, -2, 5, -2, color, p, false, 0, up);
                        new PlaceBlock(chest, -3, 5, -2, color, p, false, 0, up);
                        new PlaceBlock(chest, -3, 5, 0, color, p, false, 0, up);
                        new PlaceBlock(chest, -3, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, -2, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, -2, 5, 3, color, p, false, 0, up);
                        new PlaceBlock(chest, 0, 5, 3, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, 3, color, p, false, 0, up);
                        new PlaceBlock(chest, 2, 5, 2, color, p, false, 0, up);
                        new PlaceBlock(chest, 3, 5, 2, color, p, false, 0, up);

                        if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                            loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                        } else {
                            loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                        }

                        Bukkit.getScheduler().runTaskLater(plugin, () -> {
                            new PlaceBlock(chest, 0, 6, 3, color, p, false, 0, up);
                            new PlaceBlock(chest, 1, 6, 3, color, p, false, 0, up);
                            new PlaceBlock(chest, 2, 6, 3, color, p, false, 0, up);
                            new PlaceBlock(chest, 3, 6, 2, color, p, false, 0, up);
                            new PlaceBlock(chest, 3, 6, 1, color, p, false, 0, up);
                            new PlaceBlock(chest, 3, 6, 0, color, p, false, 0, up);
                            new PlaceBlock(chest, 3, 6, -1, color, p, false, 0, up);
                            new PlaceBlock(chest, 3, 6, -2, color, p, false, 0, up);
                            new PlaceBlock(chest, 2, 6, -3, color, p, false, 0, up);
                            new PlaceBlock(chest, 1, 6, -3, color, p, false, 0, up);
                            new PlaceBlock(chest, 0, 6, -3, color, p, false, 0, up);
                            new PlaceBlock(chest, -1, 6, -3, color, p, false, 0, up);
                            new PlaceBlock(chest, -2, 6, -3, color, p, false, 0, up);
                            new PlaceBlock(chest, -3, 6, -2, color, p, false, 0, up);
                            new PlaceBlock(chest, -3, 6, -1, color, p, false, 0, up);
                            new PlaceBlock(chest, -3, 6, 0, color, p, false, 0, up);
                            new PlaceBlock(chest, -3, 6, 1, color, p, false, 0, up);
                            new PlaceBlock(chest, -3, 6, 2, color, p, false, 0, up);
                            new PlaceBlock(chest, -2, 6, 3, color, p, false, 0, up);
                            new PlaceBlock(chest, -1, 6, 3, color, p, false, 0, up);


                            if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
                                loc.getWorld().playSound(loc, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 1.0F);
                            } else {
                                loc.getWorld().playSound(loc, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 1.0F);
                            }

                            Bukkit.getScheduler().runTaskLater(plugin, () -> {

                                new PlaceBlock(chest, -2, 7, 3, color, p, false, 0, up);
                                new PlaceBlock(chest, 0, 7, 3, color, p, false, 0, up);
                                new PlaceBlock(chest, 2, 7, 3, color, p, false, 0, up);
                                new PlaceBlock(chest, 3, 7, 2, color, p, false, 0, up);
                                new PlaceBlock(chest, 3, 7, 0, color, p, false, 0, up);
                                new PlaceBlock(chest, 3, 7, -2, color, p, false, 0, up);
                                new PlaceBlock(chest, 2, 7, -3, color, p, false, 0, up);
                                new PlaceBlock(chest, 0, 7, -3, color, p, false, 0, up);
                                new PlaceBlock(chest, -2, 7, -3, color, p, false, 0, up);
                                new PlaceBlock(chest, -3, 7, -2, color, p, false, 0, up);
                                new PlaceBlock(chest, -3, 7, 0, color, p, false, 0, up);
                                new PlaceBlock(chest, -3, 7, 2, color, p, false, 0, up);



                                new PlaceBlock(chest, 0, 0, 0, color, p, true, 4);
                                new PlaceBlock(chest, 0, 1, 0, color, p, true, 4);
                                new PlaceBlock(chest, 0, 2, 0, color, p, true, 4);
                                new PlaceBlock(chest, 0, 3, 0, color, p, true, 4);
                                new PlaceBlock(chest, 0, 4, 0, color, p, true, 4);


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
        }, 3L);

         */
    }
}
