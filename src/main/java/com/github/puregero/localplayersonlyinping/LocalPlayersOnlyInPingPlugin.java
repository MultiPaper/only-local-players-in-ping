package com.github.puregero.localplayersonlyinping;

import org.bukkit.plugin.java.JavaPlugin;

public class LocalPlayersOnlyInPingPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        new PingListener(this);
    }

}
