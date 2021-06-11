package me.metallicgoat.PopUpTowers.versionsupport;

import org.bukkit.DyeColor;
import org.bukkit.block.Block;

public interface BlockPlacer {
    void SetBlock(Block b, int x, int y, int z, DyeColor color);
}
