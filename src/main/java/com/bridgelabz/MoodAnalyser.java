package com.bridgelabz;
public class MoodAnalyser {
    public static String analyseMood(String message){
        if (message.toLowerCase().contains("sad"))
            return "Sad";
        else if (message.toLowerCase().contains("happy"))
            return "Happy";
        else
            return null;
    }
    public static void main(String[] args) {
        String mood = MoodAnalyser.analyseMood("I am happy");
        System.out.println(mood);
        mood = MoodAnalyser.analyseMood("I am sad");
        System.out.println(mood);
    }
}

