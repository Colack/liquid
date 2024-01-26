package com.watermelonkatana.liquid;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import java.io.File;
import java.io.FileNotFoundException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.watermelonkatana.liquid.engine.Game;
// import com.watermelonkatana.liquid.util.*;
// import com.watermelonkatana.wklib.*; (Note: This is a library that is still in development)
// import com.watermelonkatana.liquid.engine.*;

public class Liquid {
    public static void main(String[] args) {
        boolean debug = false;
        
        if (args.length > 0) {
            if (args[0].equals("debug")) {
                System.out.println("-- Debug Mode Enabled");
                debug = true;
            }
        }

        // Create a new game object and initialize it
        Game game = new Game();
        game.init(debug);

        // Start the game
        game.start();

        // Exit the game
        System.exit(0);
    }
}
