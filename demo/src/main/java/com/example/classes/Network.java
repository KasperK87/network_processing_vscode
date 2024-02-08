package com.example.classes;

import processing.core.PApplet;
import processing.net.*;

public class Network {
    PApplet p;

   Server server;
   Client client;

   public Network(PApplet p){
        this.p = p;

        client = new Client(p, "127.0.0.1", 8888);

        //server = new Server(p, 8888);
   }

   public void  send(String s){

   } 
   
   public String rsv(){
    String s = "";
    
    return s;
   }

}
