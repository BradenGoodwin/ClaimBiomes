package com.bradengoodwin.claimbiomes;

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
        if (cmd.getName().equalsIgnoreCase("claimbiome")) { // If the player typed /basic then do the following, note: If you only registered this executor for one command, you don't need this
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be run by a player.");
            } else {
                Player player = (Player) sender;
                // do something
            }
            return true;
        } //If this has happened the function will return true.
        // If this hasn't happened the value of false will be returned.
        return false;
    }
}
