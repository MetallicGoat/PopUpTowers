package me.metallicgoat.PopUpTowers.VersionSupport;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class Legacy implements BlockPlacer{
    public void SetBlock(Block b, int x, int y, int z, DyeColor color) {
        b.getRelative(x, y, z).setType(Material.WOOL);
        b.getRelative(x, y, z).setData(color.getWoolData());
    }
}