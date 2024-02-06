package com.example;

import  com.example.classes.*;

import processing.core.*;
import processing.net.*;

public class Main extends PApplet{
    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
    }

    Server server;
    Logic gameLogic;
    GUI gameGUI;

    public void settings() {
        size(640, 360);
    }

    public void setup() {
        
        server = new Server(this, 12345);
        gameLogic = new Logic();
        gameGUI = new GUI(this);
        
        background(102);
    }

    public void draw() {
        Client thisClient = server.available();
        if (thisClient != null) {
            int what = thisClient.read();
            gameLogic.fjendeValg = what;
            //gameLogic.isWinner(Logic.sten, what);
            println(what);
        }

        gameLogic.test();
        
        background(0);
        textSize(32);
        textAlign(LEFT);
        text(gameLogic.myScore, 10, 50);
        textAlign(RIGHT);
        text(gameLogic.enemyScore, width-10, 50);

        fill(255);
        rect(0,240,640,120);

        gameGUI.render();
    }
}