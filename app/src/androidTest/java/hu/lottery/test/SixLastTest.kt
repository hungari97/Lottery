package hu.lottery.test

import hu.lottery.presenter.SixScorePresenter
import hu.lottery.screen.SixScoreScreen
import hu.lottery.testInjector
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class SixLastTest {
    @Inject
    lateinit var sixScorePresenter: SixScorePresenter

    private lateinit var sixScoreScreen: SixScoreScreen

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        sixScoreScreen = Mockito.mock(SixScoreScreen::class.java)!!
        sixScorePresenter.attachScreen(sixScoreScreen)
    }

    @Test
    fun testScore() {


    }

    @After
    fun tearDown() {
        sixScorePresenter.detachScreen()
    }
}
