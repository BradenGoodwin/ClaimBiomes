package com.bradengoodwin.claimbiomes;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClaimBiomesCommandExecutor implements CommandExecutor {
    private final ClaimBiomes plugin;

    public ClaimBiomesCommandExecutor(ClaimBiomes plugin) {
        this.plugin = plugin; // Store the plugin in situations where you need it.
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //if (cmd.getName().equalsIgnoreCase("claimbiome") ||
            //cmd.getName().equalsIgnoreCase("cb"))
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by a player.");
        } else {
            sender.sendMessage("Usage: /cb <claim|unclaim> [player]");
            Player player = (Player) sender;
            Location loc = player.getLocation();
        }
        return true;
        //}
    }
}
