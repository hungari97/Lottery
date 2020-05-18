package hu.lottery.test

import android.content.Intent
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import hu.lottery.view.MenuActivity
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainAndroidTest /*: EspressoTest<MenuActivity>(MenuActivity::class.java) */{

   /* @Before
    fun setUp() {
        setTestInjector()
        activityRule.launchActivity(Intent())
    }

    @Test
    fun testNavigateToArtistActivity() {
        onView(withId(R.id.etArtist)).perform(typeText(ARTIST), closeSoftKeyboard())
        onView(withId(R.id.btnShowArtists)).perform(click())
        matchToolbarTitle(ARTIST_ACTIVITY_TITLE)
    }

    companion object {
        private const val ARTIST = "AC/DC"
        private const val ARTIST_ACTIVITY_TITLE = "ArtistsActivity"
    }*/
}
