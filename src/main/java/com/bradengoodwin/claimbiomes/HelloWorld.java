package com.bradengoodwin.claimbiomes;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class HelloWorld implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Material type = event.getBlock().getType();
        if(type == Material.ACACIA_DOOR){
            event.setCancelled(true);
            event.getPlayer().sendMessage("joe mama");
        }
    }
}
