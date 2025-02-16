package com.example.connectme

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(Login::class.java)

    @Before
    fun setUp() {
        Intents.init()  // Initialize Espresso Intent monitoring
    }

    @After
    fun tearDown() {
        Intents.release()  // Release Intent monitoring
    }

    @Test
    fun testLoginButton_NavigatesToHomeScreen() {
        // Enter username and password
        onView(withId(R.id.usernameInput)).perform(typeText("testuser"), closeSoftKeyboard())
        onView(withId(R.id.passwordInput)).perform(typeText("password123"), closeSoftKeyboard())

        // Click on login button
        onView(withId(R.id.loginButton)).perform(click())

        // Verify if it navigates to Bottom Navigation Screen
        Intents.intended(hasComponent(bottom_navigation::class.java.name))
    }

    @Test
    fun testRegisterText_NavigatesToSignupScreen() {
        // Click on the "Register" TextView
        onView(withId(R.id.registerLink)).perform(click())

        // Verify if it navigates to the Signup screen
        Intents.intended(hasComponent(Signup::class.java.name))
    }
}
