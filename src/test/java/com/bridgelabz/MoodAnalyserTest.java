package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void messageSad_returnSad() {
        //  TC1.1 Given “I am in Sad Mood” message should return SAD
        String result = MoodAnalyser.analyseMood("I am in Sad Mood.");
            System.out.println(result);
            Assertions.assertEquals("Sad" , result);
    }
    @Test
    void messageNull_returnHappy() {
        //  TC1.2 Given “I am in Any Mood” message should return HAPPY
        String result = MoodAnalyser.analyseMood("I am in Any Mood");
        System.out.println(result);
        Assertions.assertEquals("Happy" , result);
    }
}