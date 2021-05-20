package me.metallicgoat.PopUpTowers;

import de.marcely.bedwars.api.BedwarsAPI;
import de.marcely.bedwars.api.arena.Arena;
import de.marcely.bedwars.api.event.player.PlayerUseSpecialItemEvent;
import de.marcely.bedwars.api.game.specialitem.SpecialItemUseSession;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class ChestPlace implements Listener {
    /*
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlace(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        Arena arena = BedwarsAPI.getGameAPI().getArenaByPlayer(player);
        if (e.getBlockPlaced().getType() == Material.CHEST && arena != null) {
            e.setCancelled(true);

            Location loc = e.getBlockPlaced().getLocation();
            Block chest = e.getBlockPlaced();
            //TeamColor col = BedWars.getAPI().getArenaUtil().getArenaByPlayer(player).getTeam(player).getColor();
            DyeColor col = BedwarsAPI.getGameAPI().getArenaByPlayer(player).getPlayerTeam(player).getDyeColor();
            double rotation = (double) ((player.getLocation().getYaw() - 90.0F) % 360.0F);
            if (rotation < 0.0D) {
                rotation += 360.0D;
            }

            if (45.0D <= rotation && rotation < 135.0D) {
                new TowerSouth(loc, chest, col, player);
            } else if (225.0D <= rotation && rotation < 315.0D) {
                new TowerNorth(loc, chest, col, player);
            } else if (135.0D <= rotation && rotation < 225.0D) {
                new TowerWest(loc, chest, col, player);
            } else if (0.0D <= rotation && rotation < 45.0D) {
                new TowerEast(loc, chest, col, player);
            } else if (315.0D <= rotation && rotation < 360.0D) {
                new TowerEast(loc, chest, col, player);
            }
        }
    }*/
    public void buildTower(PlayerUseSpecialItemEvent e, SpecialItemUseSession session){
        final Player player = e.getPlayer();
        boolean up = false;
        if(e.getClickedBlock() == null){
            session.stop();
            return;
        }
        if(e.getClickedBlockFace() == BlockFace.UP){
            up = true;
        }else if(e.getClickedBlockFace() == BlockFace.DOWN){
            //don't take item
        }
        final Location loc = e.getClickedBlock().getLocation();
        final Block chest = e.getClickedBlock();
        final DyeColor col = BedwarsAPI.getGameAPI().getArenaByPlayer(player).getPlayerTeam(player).getDyeColor();
        double rotation = (double) ((player.getLocation().getYaw() - 90.0F) % 360.0F);
        if (rotation < 0.0D) {
            rotation += 360.0D;
        }
        if (45.0D <= rotation && rotation < 135.0D) {
            new TowerSouth(loc, chest, col, player, up, session);
        } else if (225.0D <= rotation && rotation < 315.0D) {
            new TowerNorth(loc, chest, col, player,up, session);
        } else if (135.0D <= rotation && rotation < 225.0D) {
            new TowerWest(loc, chest, col, player, up,  session);
        } else if (0.0D <= rotation && rotation < 45.0D) {
            new TowerEast(loc, chest, col, player, up, session);
        } else if (315.0D <= rotation && rotation < 360.0D) {
            new TowerEast(loc, chest, col, player, up, session);
        }
    }
}
