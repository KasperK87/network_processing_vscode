package com.example;

import processing.core.*;
import processing.net.*;

public class Main extends PApplet{
    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
    }

    Server server;

    public void settings() {
        size(640, 360);
    }

    public void setup() {
        server = new Server(this, 12345);
        background(102);
    }

    public void draw() {
        Client thisClient = server.available();
        if (thisClient != null) {
            int what = thisClient.read();
            println(what);
        }
    }
}