package com.bridgelabz;
public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {

    }
    public MoodAnalyser(String message) {
        super();
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0){
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Entered_Empty,"Enter a message");
            }
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Entered_Null,"Invalid mood");
        }
    }
}