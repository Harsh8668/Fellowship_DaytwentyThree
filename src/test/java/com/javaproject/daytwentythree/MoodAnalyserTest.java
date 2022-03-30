package com.javaproject.daytwentythree;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenNotHappy_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
        String mood = moodAnalyser.analysisMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
        String mood = moodAnalyser.analysisMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e) {
        }
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e) {
        }
        Assert.assertEquals("Happy", mood);
    }

    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy", mood);
        }
        catch (MoodAnalyserException e) {
        }
    }

    @Test
    public void givenNullMoodShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

}