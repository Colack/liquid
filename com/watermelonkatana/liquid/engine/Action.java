package com.watermelonkatana.liquid.engine;

public class Action {
    private String name;
    private int key;
    private boolean pressed;

    public Action(String name, int key) {
        this.name = name;
        this.key = key;
        pressed = false;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }

    public boolean isPressed() {
        return pressed;
    }

    public String getName() {
        return name;
    }

    public int getKey() {
        return key;
    }
}
