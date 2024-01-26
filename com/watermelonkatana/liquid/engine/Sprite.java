package com.watermelonkatana.liquid.engine;

import java.awt.Image;

public class Sprite {
    private boolean visible;
    private Image image;

    protected double x;
    protected double y;
    protected int width;
    protected int height;

    public Sprite() {
        visible = true;
    }

    public Sprite(double x, double y) {
        this.x = x;
        this.y = y;
        visible = true;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    protected void setX(double x) {
        this.x = x;
    }

    protected void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
