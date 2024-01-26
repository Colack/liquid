package com.watermelonkatana.liquid.engine;

public class Game {
    private boolean running;
    private int width;
    private int height;
    
    public String title;
    public boolean debug;

    public int versionMajor;
    public int versionMinor;
    public int versionPatch;
    
    public Game() {
        running = false;
        width = 0;
        height = 0;
        title = "Liquid";
        debug = false;
        versionMajor = 0;
        versionMinor = 0;
        versionPatch = 1;
    }


    public void init(boolean debug) {
        // Create a player object

    }

    public void start() {

    }

    private void createWindow() {

    }

    private void update() {

    }
}
