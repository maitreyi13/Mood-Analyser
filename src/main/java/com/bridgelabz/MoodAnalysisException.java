package com.bridgelabz;

public class MoodAnalysisException extends Exception {
    enum ExceptionType{
        Entered_Null, Entered_Empty;
    }
    ExceptionType Type;
    public MoodAnalysisException(ExceptionType Type, String message){
        super(message);
        this.Type = Type;
    }
}
