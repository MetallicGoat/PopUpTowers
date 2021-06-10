package me.metallicgoat.PopUpTowers;


import de.marcely.bedwars.api.GameAPI;
import de.marcely.bedwars.api.event.player.PlayerBuyInShopEvent;
import de.marcely.bedwars.api.event.player.PlayerUseSpecialItemEvent;
import de.marcely.bedwars.api.game.specialitem.SpecialItem;
import de.marcely.bedwars.api.game.specialitem.SpecialItemListener;
import de.marcely.bedwars.api.game.specialitem.SpecialItemUseHandler;
import de.marcely.bedwars.api.game.specialitem.SpecialItemUseSession;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class RegisterTower {
    public void registerItem() {
        Main plugin = Main.getInstance();
        SpecialItemListener listener = new SpecialItemListener() {

            @Override
            public void onShopBuy(PlayerBuyInShopEvent e) {
            }

            @Override
            public void onUse(PlayerUseSpecialItemEvent e) {
            }
        };

        SpecialItem specialItem = GameAPI.get().registerSpecialItem("tower", plugin, "%towerItem%", new ItemStack(Material.CHEST));
        //GameAPI.get().registerSpecialItem("tower", plugin, "%towerItem%", new ItemStack(Material.CHEST)).registerListener(listener);


        if(specialItem != null){
            specialItem.registerListener(listener);

            specialItem.setHandler(new SpecialItemUseHandler() {
                @Override
                public Plugin getPlugin() {
                    return plugin;
                }

                @Override
                public SpecialItemUseSession openSession(PlayerUseSpecialItemEvent e) {
                    SpecialItemUseSession session = new SpecialItemUseSession(e) {
                        @Override
                        protected void handleStop() {
                        }
                    };
                    ChestPlace cp = new ChestPlace();
                    cp.buildTower(e, session);
                    return session;
                }
            });
        }else{
            // id is already taken
            System.out.println("WARNING: Another addon is probably using the 'tower' special item id");
        }
    }
}
