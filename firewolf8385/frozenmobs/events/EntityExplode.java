package firewolf8385.frozenmobs.events;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplode implements Listener
{

    @EventHandler
    public void onExplode(EntityExplodeEvent e)
    {

        if(e.getEntity() instanceof LivingEntity)
        {
            e.setCancelled(true);
        }

    }

}
