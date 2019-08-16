package firewolf8385.frozenmobs.events;

import firewolf8385.frozenmobs.SettingsManager;
import firewolf8385.frozenmobs.Util;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamageByEntity implements Listener
{
    SettingsManager settings = SettingsManager.getInstance();

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e)
    {

        if(e.getDamager() instanceof Player)
        {
            if(!settings.getConfig().getBoolean("PlayerDoDamage"))
            {
                if(settings.getConfig().getBoolean(Util.getEntityType(e.getEntity())))
                {
                    e.setCancelled(true);
                }
            }
        }
    }

}
