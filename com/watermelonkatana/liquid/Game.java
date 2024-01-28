package com.watermelonkatana.liquid;

import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.Dimension;

public class Game {
    public int width, height;
    public String title;

    public Game(int width, int height, String title) {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void init() {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
