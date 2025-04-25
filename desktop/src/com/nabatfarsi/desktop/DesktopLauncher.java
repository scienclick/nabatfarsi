package com.nabatfarsi.desktop;

import com.nabatfarsi.GameEventListener;
import com.nabatfarsi.nabatfarsi;
import com.nabatfarsi.config.GameConfig;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = (int) GameConfig.WIDTH;
        config.height = (int) GameConfig.HEIGHT;
        nabatfarsi game = new nabatfarsi(new GameEventListener() {

            @Override
            public void InitiateIAP() {

            }
        });
        new LwjglApplication(game, config);
        game.setISPURCHASED(true); //*****free* makes it free search for *****free*
    }
}
