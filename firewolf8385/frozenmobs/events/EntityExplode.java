package firewolf8385.frozenmobs.events;

import firewolf8385.frozenmobs.SettingsManager;
import firewolf8385.frozenmobs.Util;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplode implements Listener
{
    SettingsManager settings = SettingsManager.getInstance();

    @EventHandler
    public void onExplode(EntityExplodeEvent e)
    {

        if(settings.getConfig().getBoolean(Util.getEntityType(e.getEntity())))
        {
            if(!settings.getConfig().getBoolean("DoDamage"))
            {
                e.setCancelled(true);
            }
        }

    }

}
