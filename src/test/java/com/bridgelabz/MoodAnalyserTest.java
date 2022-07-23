package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
//    @Test
//    void messageSad_returnSad() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Sad mood.");
//        String result = moodAnalyser.analyseMood();
//            System.out.println(result);
//            Assertions.assertEquals("Sad" , result);
//    }
//    @Test
//    void messageNull_returnHappy() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Any mood.");
//        String result = moodAnalyser.analyseMood();
//        System.out.println(result);
//        Assertions.assertEquals("Happy" , result);
//    }

    @Test
    void messageHappy_returnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("Happy" , result);
    }
}