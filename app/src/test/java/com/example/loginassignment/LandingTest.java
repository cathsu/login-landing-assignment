package com.example.loginassignment;

import android.content.Intent;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

// Citation: https://stackoverflow.com/questions/9445661/how-to-get-the-context-from-anywhere
public class LandingTest {

    @Test
    public void shouldReturnIntent() {
        Landing landing = new Landing();
        Intent intent = landing.getIntent(MainActivity.getContext());
        assertTrue(intent.getClass() == Intent.class);
    }
}

