package com.example.classes;

import processing.core.PApplet;
import processing.net.*;

public class Network {
    PApplet p;

    boolean isServer = false;
   Server server;
   Client client;

   public Network(PApplet p){
        this.p = p;
        
        
            client = new Client(p, "127.0.0.1", 8888);

            if (client.active() == false){
                server = new Server(p, 8888);
                isServer = true;
            }
        
   }

   public void  send(String s){
    if (isServer){
        server.write(s);
    } else {
        client.write(s);
    }
   } 
   
   public int rsv(){
    if (isServer){
        client = server.available();
    }
    
    if (client !=null) {
        if (client.available() > 0) { 
            return client.read();     
        }
    }

    return 9001;
   }

}
