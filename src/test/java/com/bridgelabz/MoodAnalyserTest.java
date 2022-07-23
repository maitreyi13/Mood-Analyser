package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void messageSad_returnSad() {
            String result = MoodAnalyser.analyseMood("I am in Sad Mood.");
            System.out.println(result);
            Assertions.assertEquals("Sad" , result);
    }
}