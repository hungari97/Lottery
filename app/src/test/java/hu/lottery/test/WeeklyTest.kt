package hu.lottery.test

import hu.lottery.presenter.WeeklyPresenter
import hu.lottery.screen.WeeklyScreen
import hu.lottery.testInjector
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class WeeklyTest {

        @Inject
        lateinit var weeklyScorePresenter: WeeklyPresenter
        private lateinit var weeklyScoreScreen: WeeklyScreen

        @Before
        @Throws(Exception::class)
        fun setup() {
            testInjector.inject(this)
            weeklyScoreScreen = Mockito.mock(WeeklyScreen::class.java)!!
            weeklyScorePresenter.attachScreen(weeklyScoreScreen)
        }

        @Test
        fun testScore() {




        }

        @After
        fun tearDown() {
            weeklyScorePresenter.detachScreen()
        }
    }
