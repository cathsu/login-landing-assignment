package com.example.loginassignment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    MainActivity mainActivity;
    @Before
    public void before() {
        mainActivity = new MainActivity();
    }

    @Test
    public void shouldReturnTrueWhenCredentialsAreCorrect() {
        assertTrue(mainActivity.validateUsername("din_djarin"));
        assertTrue(mainActivity.validatePassword("baby_yoda_ftw"));

    }

    @Test
    public void shouldReturnFalseWhenUsernameIsIncorrect() {
        assertFalse(mainActivity.validateUsername("username"));
        assertTrue(mainActivity.validatePassword("baby_yoda_ftw"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsIncorrect() {
        assertTrue(mainActivity.validateUsername("din_djarin"));
        assertFalse(mainActivity.validatePassword("password"));
    }

    @Test
    public void shouldReturnFalseWhenUsernameAndPasswordAreIncorrect() {
        assertFalse(mainActivity.validateUsername("username"));
        assertFalse(mainActivity.validatePassword("password"));
    }
}