package firewolf8385.frozenmobs;

import firewolf8385.frozenmobs.commands.FM;
import firewolf8385.frozenmobs.events.CreatureSpawn;
import firewolf8385.frozenmobs.events.EntityDamageByEntity;
import firewolf8385.frozenmobs.events.EntityExplode;
import firewolf8385.frozenmobs.events.EntityTarget;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FrozenMobs extends JavaPlugin
{

    /***************************************************************************************
     *    Title: FrozenMobs
     *    Author: firewolf8385
     *    Date: August 16th, 2019
     *    Code version: 1.0
     ***************************************************************************************/
    SettingsManager settings = SettingsManager.getInstance();

    @Override
    public void onEnable()
    {
        // Creates/Loads the config.yml
        settings.setup(this);

        // Enables bStats
        Metrics metrics = new Metrics(this);

        // Registers Events used by the plugin.
        registerEvents();

        // Registers Commands used by the plugin.
        registerCommands();
    }

    private void registerEvents()
    {
        Bukkit.getServer().getPluginManager().registerEvents(new CreatureSpawn(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new EntityExplode(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new EntityTarget(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new EntityDamageByEntity(), this);
    }

    private void registerCommands()
    {
        getCommand("frozenmobs").setExecutor(new FM());
    }

}
