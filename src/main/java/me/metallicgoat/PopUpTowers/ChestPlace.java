package me.metallicgoat.PopUpTowers;

import de.marcely.bedwars.api.BedwarsAPI;
import de.marcely.bedwars.api.event.player.PlayerUseSpecialItemEvent;
import de.marcely.bedwars.api.game.specialitem.SpecialItemUseSession;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class ChestPlace implements Listener {

    public void buildTower(PlayerUseSpecialItemEvent e, SpecialItemUseSession session){
        final Player player = e.getPlayer();
        boolean up;
        if(e.getClickedBlock() == null){
            e.setTakingItem(false);
            session.stop();
            return;
        }
        if(e.getClickedBlockFace() != BlockFace.DOWN){
            e.setTakingItem(true);
        }else{
            e.setTakingItem(false);
            session.stop();
            return;
        }
        final Location loc = e.getClickedBlock().getLocation();
        final Block chest = e.getClickedBlock();
        final DyeColor col = BedwarsAPI.getGameAPI().getArenaByPlayer(player).getPlayerTeam(player).getDyeColor();
        double rotation = (double) ((player.getLocation().getYaw() - 90.0F) % 360.0F);
        if (rotation < 0.0D) {
            rotation += 360.0D;
        }
        if (45.0D <= rotation && rotation < 135.0D) {
            new TowerSouth(loc, chest, col, player, session);
        } else if (225.0D <= rotation && rotation < 315.0D) {
            new TowerNorth(loc, chest, col, player, session);
        } else if (135.0D <= rotation && rotation < 225.0D) {
            new TowerWest(loc, chest, col, player,  session);
        } else if (0.0D <= rotation && rotation < 45.0D) {
            new TowerEast(loc, chest, col, player, session);
        } else if (315.0D <= rotation && rotation < 360.0D) {
            new TowerEast(loc, chest, col, player, session);
        }
    }
}
