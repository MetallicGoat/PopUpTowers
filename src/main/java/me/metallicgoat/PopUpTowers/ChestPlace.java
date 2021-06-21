package me.metallicgoat.PopUpTowers;

import de.marcely.bedwars.api.BedwarsAPI;
import de.marcely.bedwars.api.arena.Arena;
import de.marcely.bedwars.api.arena.Team;
import de.marcely.bedwars.api.event.player.PlayerUseSpecialItemEvent;
import de.marcely.bedwars.api.game.spawner.Spawner;
import de.marcely.bedwars.api.game.specialitem.SpecialItemUseSession;
import me.metallicgoat.PopUpTowers.towers.TowerEast;
import me.metallicgoat.PopUpTowers.towers.TowerNorth;
import me.metallicgoat.PopUpTowers.towers.TowerSouth;
import me.metallicgoat.PopUpTowers.towers.TowerWest;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class ChestPlace implements Listener {

    public void buildTower(PlayerUseSpecialItemEvent e, SpecialItemUseSession session){
        final Player player = e.getPlayer();

        if(e.getClickedBlock() == null){
            e.setTakingItem(false);
            session.stop();
            return;
        }else if(e.getClickedBlockFace() == BlockFace.DOWN){
            e.setTakingItem(false);
            session.stop();
            return;
        }else if(!CheckArea(BedwarsAPI.getGameAPI().getArenaByPlayer(player), e.getClickedBlock().getRelative(0, 1, 0))){
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', getMessage()));
            e.setTakingItem(false);
            session.stop();
            return;
        }

        session.takeItem();

        final Location loc = e.getClickedBlock().getLocation();
        final Block clicked = e.getClickedBlock();
        final DyeColor col = BedwarsAPI.getGameAPI().getArenaByPlayer(player).getPlayerTeam(player).getDyeColor();

        ChooseTower(player, loc, clicked, col, session);
    }

    private void ChooseTower(Player player, Location loc, Block clicked, DyeColor col, SpecialItemUseSession session){
        double rotation = (double) ((player.getLocation().getYaw() - 90.0F) % 360.0F);
        if (rotation < 0.0D) {
            rotation += 360.0D;
        }
        if (45.0D <= rotation && rotation < 135.0D) {
            new TowerSouth(loc, clicked, col, player, session);
        } else if (225.0D <= rotation && rotation < 315.0D) {
            new TowerNorth(loc, clicked, col, player, session);
        } else if (135.0D <= rotation && rotation < 225.0D) {
            new TowerWest(loc, clicked, col, player,  session);
        } else if (0.0D <= rotation && rotation < 45.0D) {
            new TowerEast(loc, clicked, col, player, session);
        } else if (315.0D <= rotation && rotation < 360.0D) {
            new TowerEast(loc, clicked, col, player, session);
        }
    }

    //Checks if the popuptower is placed inside/near team spawn area, and item spawners
    private boolean CheckArea(Arena arena, Block b){

        final int sRadius = getSRadius();
        final int tRadius = getTRadius();

        for(Spawner s : arena.getSpawners()){
            Location sLoc = s.getLocation().toLocation(arena.getGameWorld());
            Location bLoc = b.getLocation();
            if ((sLoc.getX() <= bLoc.getX() + sRadius && sLoc.getY() <= bLoc.getY() + sRadius && sLoc.getZ() <= bLoc.getZ() + sRadius)
                    && (sLoc.getX() >= bLoc.getX() - sRadius && sLoc.getY() >= bLoc.getY() - sRadius && sLoc.getZ() >= bLoc.getZ() - sRadius)) {
                return false;
            }
        }
        for(Team team : arena.getEnabledTeams()){
            Location tLoc = arena.getTeamSpawn(team).toLocation(arena.getGameWorld());
            Location bLoc = b.getLocation();
            if ((tLoc.getX() <= bLoc.getX() + tRadius && tLoc.getY() <= bLoc.getY() + tRadius && tLoc.getZ() <= bLoc.getZ() + tRadius)
                    && (tLoc.getX() >= bLoc.getX() - tRadius && tLoc.getY() >= bLoc.getY() - tRadius && tLoc.getZ() >= bLoc.getZ() - tRadius)) {
                return false;
            }
        }
        return true;
    }
    private int getSRadius(){
        return Main.getConfigManager().getItemSpawnerRadius();
    }
    private int getTRadius(){
        return Main.getConfigManager().getTeamSpawnRadius();
    }
    private String getMessage(){
        return Main.getConfigManager().getAntiPlaceMessage();
    }
}
