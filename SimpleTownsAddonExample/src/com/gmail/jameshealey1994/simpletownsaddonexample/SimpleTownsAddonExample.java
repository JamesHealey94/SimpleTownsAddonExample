package com.gmail.jameshealey1994.simpletownsaddonexample;

import com.gmail.jameshealey1994.simpletowns.events.TownDeleteEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * An example add-on for the SimpleTowns plugin.
 *
 * @author JamesHealey94 <jameshealey1994.gmail.com>
 */
public class SimpleTownsAddonExample extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        final String name = "SimpleTowns";
        if (getServer().getPluginManager().isPluginEnabled(name)) {
            getServer().getPluginManager().registerEvents(this, this);
        } else {
            getLogger().warning(name + " not found");
        }
    }

    @EventHandler
    public void onTownDeleteEvent(TownDeleteEvent event) {
        getServer().broadcastMessage("onTownDeleteEvent - Town deleted: " + event.getTownName());
    }
}