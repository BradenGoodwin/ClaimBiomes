package com.bradengoodwin.claimbiomes;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ClaimBiomes extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("onEnable has been invoked");
        // This will throw a NullPointerException if you don't have the command defined in your plugin.yml file!
        this.getCommand("claimbiome").setExecutor(new ClaimBiomesCommandExecutor(this));
    }

    @Override
    public void onDisable(){
        getLogger().info("onDisable has been invoked");
    }
}
