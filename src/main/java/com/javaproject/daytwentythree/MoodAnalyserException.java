package com.javaproject.daytwentythree;

public class MoodAnalyserException extends Exception{

    public MoodAnalyserException() {
    }

    enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY
    }

    ExceptionType type;

    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
