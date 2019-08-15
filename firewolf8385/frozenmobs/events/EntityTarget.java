package firewolf8385.frozenmobs.events;

import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class EntityTarget implements Listener
{

    @EventHandler
    public void onTarget(EntityTargetEvent e)
    {
        if(e.getTarget() instanceof Player)
        {
            if(e.getEntity() instanceof Monster)
            {
                e.setCancelled(true);
            }
        }
    }

}
