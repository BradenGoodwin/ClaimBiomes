package com.bradengoodwin.claimbiomes;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.block.Biome;
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
        //if (cmd.getName().equalsIgnoreCase("claimbiomes") ||
            //cmd.getName().equalsIgnoreCase("cb"))
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by a player.");
        } else {
            if (args.length == 0) {
                return false;
            }

            System.out.println("Args passed: " + args.toString());

            Player player = (Player) sender;
            Location loc = player.getLocation();
            Biome biome = loc.getBlock().getBiome();
            Chunk chunk = loc.getChunk();
            String arg = args[0].toString();

            if (arg.equals("claim")) {
                player.sendMessage("This command is not yet implemented.");
            } else if (arg.equals("info")) {
                player.sendMessage("Current biome: " + biome.name());
                player.sendMessage("Current chunk: " + chunk.toString());
            } else {
                sender.sendMessage("Did not recognize argument: " + arg);
            }

        }
        return true;
        //}
    }
}
