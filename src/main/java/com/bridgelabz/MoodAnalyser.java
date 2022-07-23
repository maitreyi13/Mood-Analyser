package com.bridgelabz;
public class MoodAnalyser {
    public String message;
    //constructor
    public MoodAnalyser(String message){
        this.message = message;
        analyseMood();
    }
    public String analyseMood(){
        if (message.contains("Sad"))
            return "Sad";
        else if (message.contains("Happy"))
            return "Happy";
        else
            return null;

    }
}

