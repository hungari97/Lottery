package hu.lottery.test

import hu.lottery.model.SixTicket
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
    fun testWinner() {
        assert(sixScorePresenter.getWinnerSix().numbers.equals(listOf(9, 19, 20, 29, 42, 45)))
    }

    @Test
    fun testTicket(){
        for(tick: SixTicket in sixScorePresenter.listSix()){
            if (equals(listOf(5,23,27,36,40,43)))
                assert(tick.equals(listOf(5,23,27,36,40,43)))
        }
    }

    @After
    fun tearDown() {
        sixScorePresenter.detachScreen()
    }
}
