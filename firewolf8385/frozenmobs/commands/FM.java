package firewolf8385.frozenmobs.commands;

import firewolf8385.frozenmobs.SettingsManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class FM implements CommandExecutor
{
    // Gets theme information
    SettingsManager settings = SettingsManager.getInstance();
    String dark_green = settings.getConfig().getString("color1");
    String light_green = settings.getConfig().getString("color2");
    String dark_gray = settings.getConfig().getString("color3");

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(args.length != 0)
        {
            switch(args[0])
            {
                case "info":
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m--------------------" + dark_green + "&lFrozenMobs" + dark_gray + "&m--------------------" + dark_green + "&l["));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Author: " + light_green + "firewolf8385"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Version: " + light_green + "1.0"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Spigot: " + light_green + "Coming soon."));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m---------------------------------------------------" + dark_green + "&l["));
                    break;

                case "support":
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m--------------------" + dark_green + "&lFrozenMobs" + dark_gray + "&m--------------------" + dark_green + "&l["));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Support: " + light_green + "https://github.com/firewolf8385/FrozenMobs/issues"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m---------------------------------------------------" + dark_green + "&l["));
                    break;

                case "version":
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m--------------------" + dark_green + "&lFrozenMobs" + dark_gray + "&m--------------------" + dark_green + "&l["));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Version: " + light_green + "1.0"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m---------------------------------------------------" + dark_green + "&l["));
                    break;

                default:
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m--------------------" + dark_green + "&lFrozenMobs" + dark_gray + "&m--------------------" + dark_green + "&l["));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "/fm info " + dark_gray + "- " + light_green + "View Plugin Info"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "/fm help " + dark_gray + "- " + light_green + "View This Page"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "/fm support " + dark_gray + "- " + light_green + "Get The Support Link"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "/fm version " + dark_gray + "- " + light_green + "See The Plugin Version"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m---------------------------------------------------" + dark_green + "&l["));
                    break;
            }
        }
        else
        {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m--------------------" + dark_green + "&lFrozenMobs" + dark_gray + "&m--------------------" + dark_green + "&l["));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Author: " + light_green + "firewolf8385"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Version: " + light_green + "1.0"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_gray + "  » " + dark_green + "Spigot: " + light_green + "Coming soon."));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', dark_green + "&l]" + dark_gray + "&m---------------------------------------------------" + dark_green + "&l["));
        }

        return true;
    }

}
