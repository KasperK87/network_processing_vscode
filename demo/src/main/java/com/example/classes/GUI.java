package com.example.classes;

import processing.core.*;

public class GUI {
   PApplet p;

   PImage sten;
   PImage saks;
   PImage paper;
   
   PImage icon;

   public GUI(PApplet parent){
    p = parent;

    sten    = p.loadImage(p.sketchPath("") + "/demo/src/main/java/com/example/data/fist.png");
    saks    = p.loadImage(p.sketchPath("") + "/demo/src/main/java/com/example/data/scissors.png");
    paper   = p.loadImage(p.sketchPath("") + "/demo/src/main/java/com/example/data/paper.png");

    sten.resize(100, 100);
    saks.resize(100, 100);
    paper.resize(100, 100);
   }

   public void render(){
    p.image(sten, 50, 250);
    p.image(saks, 250, 250);
    p.image(paper, 450, 250);
   }
}
