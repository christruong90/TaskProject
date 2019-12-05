package com.example.taskproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private String enterFirstName = "Chris";
    private String enterLastName = "Truong";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInputScenario() {
        // task entered
        Espresso.onView(withId(R.id.editTextFirstName)).perform(typeText(enterFirstName));
        Espresso.onView(withId(R.id.editTextLastName)).perform(typeText(enterLastName));
        // close softkeyboard
        Espresso.closeSoftKeyboard();
        // button click
        Espresso.onView(withId(R.id.buttonAddStudent)).perform(click());

    }


    @After
    public void tearDown() throws Exception {
    }
}