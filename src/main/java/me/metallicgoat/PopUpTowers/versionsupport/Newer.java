package me.metallicgoat.PopUpTowers.versionsupport;

import org.bukkit.*;
import org.bukkit.block.Block;

public class Newer implements BlockPlacer{
    public void SetBlock(Block b, int x, int y, int z, DyeColor color) {
        Material woolMat = Material.valueOf(color.name() + "_WOOL");
        b.getRelative(x, y, z).setType(woolMat);
    }
}