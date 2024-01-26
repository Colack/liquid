package com.watermelonkatana.liquid.engine;

public class Player extends Sprite {
    public double velX;
    public double velY;

    public Player() {
        super();
        velX = 0;
        velY = 0;
    }

    public Player(double x, double y) {
        super(x, y);
        velX = 0;
        velY = 0;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }

    public double getVelX() {
        return velX;
    }

    public double getVelY() {
        return velY;
    }
}
