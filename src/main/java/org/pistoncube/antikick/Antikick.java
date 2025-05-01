package org.pistoncube.antikick;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.player.KickedFromServerEvent;
import com.velocitypowered.api.plugin.Plugin;
import net.kyori.adventure.text.Component;
import org.slf4j.Logger;

@Plugin(id = "antikick", name = "Antikick", version = BuildConstants.VERSION, authors = {"PistonCube"})
public class Antikick {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("Antikick plugin initialized (Beta version) - by PistonCube.");
    }

    @Subscribe
    public void onKickedFromServer(KickedFromServerEvent event) {
        Component reason = event.getServerKickReason().orElse(null);
        event.setResult(KickedFromServerEvent.DisconnectPlayer.create(reason));
    }
}
