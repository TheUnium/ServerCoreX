package xyz.majongtech.servercorex.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            p.setFoodLevel(20);
            p.setHealth(20);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bS&3C&9X&8] &aYou have been feed!"));;
        }
        return true;
    }
}
