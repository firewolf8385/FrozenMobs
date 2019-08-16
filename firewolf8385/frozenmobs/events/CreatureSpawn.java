package firewolf8385.frozenmobs.events;

import firewolf8385.frozenmobs.SettingsManager;
import firewolf8385.frozenmobs.Util;
import org.apache.logging.log4j.core.net.Priority;
import org.bukkit.entity.Phantom;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CreatureSpawn implements Listener
{
    SettingsManager settings = SettingsManager.getInstance();

    @EventHandler
    public void onSpawn(CreatureSpawnEvent e)
    {
        if(settings.getConfig().getBoolean(Util.getEntityType(e.getEntity())))
        {
            if(e.getEntity() instanceof Phantom)
            {
                e.setCancelled(true);

                PotionEffect effect = new PotionEffect(PotionEffectType.SLOW, 99999, 99999);
                e.getEntity().addPotionEffect(effect);

                if(!settings.getConfig().getBoolean("Collidable"))
                {
                   e.getEntity().setCollidable(false);
                }
            }
        }
    }

}
