package me.metallicgoat.PopUpTowers;

import de.marcely.bedwars.api.BedwarsAPI;
import de.marcely.bedwars.api.arena.Arena;
import me.metallicgoat.PopUpTowers.VersionSupport.BlockPlacer;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.material.Ladder;

public class BlockManager {
    public BlockManager(Block b, int x, int y, int z, DyeColor color, Player p, boolean ladder, String ladderdata) {
        Main plugin = Main.getInstance();
        BlockPlacer blockPlacer = plugin.blockPlacer;

        Arena arena = BedwarsAPI.getGameAPI().getArenaByPlayer(p);

        int y2 = y + 1;

        //Is block there?
        if (b.getRelative(x, y2, z).getType().equals(Material.AIR)) {

            //Is block inside region
            if (arena.isInside(b.getRelative(x, y2, z).getLocation())) {
                if (!ladder) {
                    blockPlacer.SetBlock(b, x, y2, z, color);
                } else {
                    b.getRelative(x, y2, z).setType(Material.LADDER);
                    Block block = b.getRelative(x, y2, z);

                    //Make this better (Error if ladder is not successfully placed from above. Ex. on a slab)
                    if (block.getType() == Material.LADDER) {
                        BlockState state = block.getState();
                        Ladder lad = new Ladder();
                        lad.setFacingDirection(BlockFace.valueOf(ladderdata));
                        state.setData(lad);
                        state.update();
                    }
                }
                BedwarsAPI.getGameAPI().getArenaByPlayer(p).setBlockPlayerPlaced(b.getRelative(x, y2, z), true);
            }
        }
    }
}
