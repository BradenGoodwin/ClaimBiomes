package com.bradengoodwin.claimbiomes;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ClaimBiomes extends JavaPlugin {

    private static ClaimBiomes instance;

    @Override
    public void onEnable() {
        //Bukkit.getPluginManager().registerEvents(new HelloWorld(), this);
        this.getCommand("claimbiomes").setExecutor(new ClaimBiomesCommandExecutor(this));
        getLogger().info("enabled");
    }

    @Override
    public void onDisable(){
        getLogger().info("onDisable has been invoked");
    }

    public static ClaimBiomes getInstance() {
        return instance;
    }
}
