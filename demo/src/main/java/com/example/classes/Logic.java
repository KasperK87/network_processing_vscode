package com.example.classes;

public class Logic {
   int turn = 0;
   int myScore = 0; 
   int enemyScore = 0;

   public static final int saks = 0;
   public static final int papir = 1;
   public static final int sten = 2;

   public static final int draw = 3;
   public static final int win = 4;
   public static final int lose = 5;

   final int error = 9001;

   public int isWinner(int myChoose, int enemyChoose){
    turn++;
    if (myChoose == saks){
        if (enemyChoose == saks)    {return draw;}
        if (enemyChoose == papir)   {myScore ++; return win;}
        if (enemyChoose == sten)    {enemyScore++; return lose;}
    } else if (myChoose == papir){
        if (enemyChoose == saks)    {enemyScore++;return lose;}
        if (enemyChoose == papir)   {return draw;}
        if (enemyChoose == sten)    {myScore++; return win;}

    } else if (myChoose == sten){
        if (enemyChoose == saks)    {myScore++; return win;}
        if (enemyChoose == papir)   {enemyScore++; return lose;}
        if (enemyChoose == sten)    {return draw;}
    }
    
    return error;
   }
}
