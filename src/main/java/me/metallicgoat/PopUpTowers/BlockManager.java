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
        Arena arena = BedwarsAPI.getGameAPI().getArenaByPlayer(p);

        //Is block there?
        if (b.getRelative(x, y+1, z).getType().equals(Material.AIR)) {

            //Is block inside region
            if (arena.isInside(b.getRelative(x, y+1, z).getLocation())) {
                PlaceBlock(ladder, b, ladderdata, p, color, x, y+1, z);
            }
        }
    }

    private void PlaceBlock(boolean ladder, Block b, String ladderdata, Player p, DyeColor color, int x, int y, int z){
        Main plugin = Main.getInstance();
        Block block = b.getRelative(x, y, z);
        BlockPlacer blockPlacer = plugin.blockPlacer;

        if (!ladder) {
            blockPlacer.SetBlock(b, x, y, z, color);
        } else {
            b.getRelative(x, y, z).setType(Material.LADDER);

            //Make this better (Error if ladder is not successfully placed from above. Ex. on a slab)
            if (block.getType() == Material.LADDER) {
                BlockState state = block.getState();
                Ladder lad = new Ladder();
                lad.setFacingDirection(BlockFace.valueOf(ladderdata));
                state.setData(lad);
                state.update();
            }
        }
        BedwarsAPI.getGameAPI().getArenaByPlayer(p).setBlockPlayerPlaced(b.getRelative(x, y, z), true);
    }
}
