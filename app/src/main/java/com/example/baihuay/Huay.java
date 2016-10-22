package com.example.baihuay;

import java.util.Random;

/**
 * Created by ON-ONE on 10/22/2016.
 */
public class Huay {
    private Random mRandom = new Random();
    public String getRandomTwoDigits(){
        int randomInt = mRandom.nextInt(100);
        String t = Integer.toString(randomInt);
        if(randomInt<10){
            t = "0"+t;
        }
        return t;
    }
    public String getRandomThreeDigits(){
        int randomInt = mRandom.nextInt(999);
        String t = Integer.toString(randomInt);
        if(randomInt<10){
            t = "00"+t;
        }else if(randomInt<100&&randomInt>=10){
            t ="0"+t;
        }
        return t;
    }
}
