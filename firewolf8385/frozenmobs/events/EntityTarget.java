package firewolf8385.frozenmobs.events;

import firewolf8385.frozenmobs.SettingsManager;
import firewolf8385.frozenmobs.Util;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class EntityTarget implements Listener
{
    SettingsManager settings = SettingsManager.getInstance();


    @EventHandler
    public void onTarget(EntityTargetEvent e)
    {
        if(settings.getConfig().getBoolean(Util.getEntityType(e.getEntity())))
        {
            if(e.getTarget() instanceof Player)
            {
                if(e.getEntity() instanceof Monster)
                {
                    if(!settings.getConfig().getBoolean("DoDamage"))
                    {
                        e.setCancelled(true);
                    }
                }
            }
        }
    }

}