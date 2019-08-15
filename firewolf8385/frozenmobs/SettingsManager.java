package firewolf8385.frozenmobs;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;

public class SettingsManager
{
    private SettingsManager() { }
    static SettingsManager instance = new SettingsManager();

    Plugin p;

    FileConfiguration config;
    File configFile;



    /**
     * Retrieves the Instance of SettingsManager
     * @return instance
     */
    public static SettingsManager getInstance()
    {
        return instance;
    }


    /**
     * Creates the files if they do not exist.
     * @param p plugin
     */
    public void setup(Plugin p)
    {
        this.p = p;

        // Create the Plugin Folder if it does not exist.
        if (!p.getDataFolder().exists())
        {
            p.getDataFolder().mkdir();
        }

        createConfig(p);
    }


    /**
     * Create config.yml
     * @param p Plugin
     */
    public void createConfig(Plugin p)
    {
        p.getConfig().options().copyDefaults(true);
        p.saveDefaultConfig();
    }

    /**
     * Get the config file.
     * @return config
     */
    public FileConfiguration getConfig()
    {
        return p.getConfig();
    }

    /**
     * Save the config file.
     */
    public void saveConfig()
    {
        p.saveConfig();
    }

    /**
     * Reload the config file.
     */
    public void reloadConfig()
    {
        p.saveConfig();
        p.getConfig();
    }
}
