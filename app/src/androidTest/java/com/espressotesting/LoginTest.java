package com.espressotesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by root on 14/12/17.
 */
@RunWith(AndroidJUnit4.class)
public class LoginTest {
    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule =
            new ActivityTestRule<>(LoginActivity.class);



    @Test
    public void ensureWork() {
        // Type text and then press the button.


        // Scanario 1
       /* onView(withId(R.id.input_name)).perform(typeText("Ramprasath K"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
        onView(withId(R.id.input_name)).perform(replaceText(""),closeSoftKeyboard());
        pauseTestFor(1000);

       // Scanario 2
        onView(withId(R.id.input_password)).perform(typeText("alluser@123"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
        onView(withId(R.id.input_password)).perform(replaceText(""), closeSoftKeyboard());
        pauseTestFor(1000);


        // Scanario 3
        onView(withId(R.id.input_name)).perform(typeText("Ramprasath K"), closeSoftKeyboard());

        onView(withId(R.id.input_password)).perform(typeText("alluser@123"), closeSoftKeyboard());

        onView(withId(R.id.btn_login)).perform(click());
*/



    }

    private void pauseTestFor(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
