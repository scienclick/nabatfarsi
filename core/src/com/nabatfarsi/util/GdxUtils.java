package com.nabatfarsi.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by AShamsa on 11/16/2017.
 */

public class GdxUtils {
    //Private constructor, then noone can instantiate
    private GdxUtils() {
    }
    public static void clearScreen(){
        clearScreen(Color.BLACK);

    }

    public static void clearScreen(Color color){
        Gdx.gl.glClearColor(color.r, color.g, color.b,color.a);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }


}
