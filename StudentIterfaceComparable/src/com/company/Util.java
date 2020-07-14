package com.company;

import java.util.Random;

public class Util {
    static Random r = new Random();

    public static int getRandomIndeks(){
        return r.nextInt(2700);
    }
    public static String getRandomIme(){
        String s = "";
        for(int i =0; i<12;i++){
            s+=(char)(r.nextInt(25) + 'a');
        }
        return s;
    }
}
