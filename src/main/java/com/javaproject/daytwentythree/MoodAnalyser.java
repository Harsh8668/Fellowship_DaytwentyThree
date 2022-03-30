package com.javaproject.daytwentythree;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String MoodAnalyser(String message) throws MoodAnalyserException {
        this.message = message;
        return analyseMood();
    }

    public String analysisMood() {
        if (message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter a valid Message");
            if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        } catch (NullPointerException n) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Please enter a valid Message");
        }
    }
}