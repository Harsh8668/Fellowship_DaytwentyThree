package com.javaproject.daytwentythree;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrue(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateFirstName("Harsh");
                Assert.assertEquals(true,result);
        }

        @Test
        public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.userFirstName("harsh");
                Assert.assertEquals(false,result);
        }

        @Test
        public void givenLastName_WhenProper_ShouldReturnTrue(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateLastName("Choudhary");
                Assert.assertEquals(true,result);
        }

        @Test
        public void givenLastName_WhenNotProper_ShouldReturnFalse(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.userLastName("choudhary");
                Assert.assertEquals(false,result);
        }

        @Test
        public void givenEmail_WhenProper_ShouldReturnTrue(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateEmail("charsh123@gmail.com");
                Assert.assertEquals(true,result);
        }

        @Test
        public void givenEmail_WhenNotProper_ShouldReturnFalse(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.userEmail(".charsh@123.com");
                Assert.assertEquals(false,result);
        }


        @Test
        public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateMobileNumber("8923657412");
                Assert.assertEquals(true,result);
        }

        @Test
        public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.userMobileNumber("89520665875");
                Assert.assertEquals(false,result);
        }

        @Test
        public void givenPassword_WhenProper_ShouldReturnTrue(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validatePassword("harsh@123");
                Assert.assertEquals(true,result);
        }

        @Test
        public void givenPassword_WhenNotProper_ShouldReturnFalse(){
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.userPassword("*/hasd");
                Assert.assertEquals(false,result);
        }

        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrues() {
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateFirstName.registration("Harsh");
                Assert.assertEquals(true, result);
        }

        @Test
        public void givenLastName_WhenProper_ShouldReturnTrues() {
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateLastName.registration("Choudhary");
                Assert.assertEquals(true, result);
        }

        @Test
        public void givenEmail_WhenProper_ShouldReturnTrues() {
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateEmail.registration("charsh3@gmail.com");
                Assert.assertEquals(true, result);
        }

        @Test
        public void givenPassword_WhenProper_ShouldReturnTrues() {
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validatePassword.registration("Harsh@22");
                Assert.assertEquals(true, result);
        }

        @Test
        public void givenMobileNumber_WhenProper_ShouldReturnTrues() {
                UserRegistration userRegistration = new UserRegistration();
                boolean result = userRegistration.validateMobileNumber.registration("+91 8965238956");
                Assert.assertEquals(true, result);
        }
}
