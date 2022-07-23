package com.bridgelabz;
public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }

    public String analyseMood() {
        try{
            if (message.contains("Sad"))
                return "Sad";
            else if (message.contains("Happy"))
                return "Happy";
//            else
//                return "HAPPY";

        }catch (NullPointerException e){
            System.out.println("Please Enter the Valid Mood");
        }
        return "";
    }
}