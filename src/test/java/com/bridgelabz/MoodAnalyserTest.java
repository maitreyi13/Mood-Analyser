package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenMood_IsSad_ShouldReturn_Sad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        Assertions.assertEquals("Sad", moodAnalyser.analyseMood());
    }

    @Test
    void givenMood_IsHappy_ShouldReturn_Happy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        Assertions.assertEquals("Happy", moodAnalyser.analyseMood());
    }

    @Test
    public void givenMood_NUll_ShouldThrow_MoodAnalysisNullException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.Entered_Null, e.Type);
        }
    }

    @Test
    void givenMood_Empty_ShouldThrow_MoodAnalysisEmptyException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.Entered_Empty, e.Type);
        }
    }
}