package com.github.puregero.localplayersonlyinping;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import com.github.puregero.multilib.MultiLib;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PingListener implements Listener {
    public PingListener(LocalPlayersOnlyInPingPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPing(PaperServerListPingEvent event) {
        event.setNumPlayers(MultiLib.getLocalOnlinePlayers().size());
    }
}
