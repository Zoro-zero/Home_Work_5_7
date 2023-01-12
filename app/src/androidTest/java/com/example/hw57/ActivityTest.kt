package com.example.hw57

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule:ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleDivision(){
        runBlocking {
            Espresso.onView(withId(R.id.et_first)).perform(ViewActions.typeText("10"))
            Espresso.onView(withId(R.id.et_first)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.et_second)).perform(ViewActions.typeText("2"))
            Espresso.onView(withId(R.id.et_second)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.btn_calculate)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.tv_result)).
                    check(ViewAssertions.matches(ViewMatchers.withText("5")))
        }
    }
}