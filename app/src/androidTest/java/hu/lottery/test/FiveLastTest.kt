package hu.lottery.test

import hu.lottery.presenter.FiveScorePresenter
import hu.lottery.screen.FiveScoreScreen
import hu.lottery.testInjector
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject


@RunWith(RobolectricTestRunner::class)
class FiveLastTest {

    @Inject
    lateinit var fiveScorePresenter: FiveScorePresenter

    private lateinit var fiveScoreScreen: FiveScoreScreen
    private lateinit var query: String

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        fiveScoreScreen = Mockito.mock(FiveScoreScreen::class.java)!!
        fiveScorePresenter.attachScreen(fiveScoreScreen)
    }

    @Test
    fun testScore() {

        fiveScoreScreen.showWinnerNumbers()

    }

    @After
    fun tearDown() {
        fiveScorePresenter.detachScreen()
    }
}