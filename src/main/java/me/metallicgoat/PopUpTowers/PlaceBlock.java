package me.metallicgoat.PopUpTowers;

import de.marcely.bedwars.api.BedwarsAPI;
import de.marcely.bedwars.api.arena.Arena;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class PlaceBlock {
    public PlaceBlock(Block b, int x, int y, int z, DyeColor color, Player p, boolean ladder, int ladderdata) {
        Arena arena = BedwarsAPI.getGameAPI().getArenaByPlayer(p);
        //World world = arena.getGameWorld();

        //Is block there?
        if (b.getRelative(x, y, z).getType().equals(Material.AIR)) {

            //Is block inside region
            //Location loc = new Location(world, b.getX() + x, b.getY() + y, b.getZ() + z);
            //Location loc = new Location(b.getRelative(x, y, z).getLocation());
            if (arena.isInside(b.getRelative(x, y, z).getLocation())) {
                if (!ladder) {
                    b.getRelative(x, y, z).setType(Material.WOOL);
                    b.getRelative(x, y, z).setData(color.getWoolData());
                } else {
                    b.getRelative(x, y, z).setType(Material.LADDER);
                    b.getRelative(x, y, z).setData((byte) ladderdata);
                }
                BedwarsAPI.getGameAPI().getArenaByPlayer(p).setBlockPlayerPlaced(b.getRelative(x, y, z), true);
            }
        }
    }
}