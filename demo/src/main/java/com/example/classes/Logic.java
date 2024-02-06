package com.example.classes;

public class Logic {
   int turn = 0; 

   final int saks = 0;
   final int papir = 1;
   final int sten = 2;

   final int draw = 3;
   final int win = 4;
   final int lose = 5;

   final int error = 9001;

   public int isWinner(int myChoose, int enemyChoose){
    if (myChoose == saks){
        if (enemyChoose == saks)    {return draw;}
        if (enemyChoose == papir)   {return win;}
        if (enemyChoose == sten)    {return lose;}
    } else if (myChoose == papir){
        if (enemyChoose == saks)    {return lose;}
        if (enemyChoose == papir)   {return draw;}
        if (enemyChoose == sten)    {return win;}

    } else if (myChoose == sten){
        if (enemyChoose == saks)    {return win;}
        if (enemyChoose == papir)   {return lose;}
        if (enemyChoose == sten)    {return draw;}
    }
    
    return error;
   }
}
