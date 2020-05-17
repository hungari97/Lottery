package hu.lottery.test


import hu.lottery.model.FiveTicket
import hu.lottery.presenter.FiveScorePresenter
import hu.lottery.screen.FiveScoreScreen
import hu.lottery.testInjector
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject


@RunWith(RobolectricTestRunner::class)
class FiveLastTest {

    @Inject
    lateinit var fiveScorePresenter: FiveScorePresenter

    private lateinit var fiveScoreScreen: FiveScoreScreen

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        fiveScoreScreen = Mockito.mock(FiveScoreScreen::class.java)!!
        fiveScorePresenter.attachScreen(fiveScoreScreen)
    }

    @Test
    fun testScore() {
        assert(fiveScorePresenter.getWinnerFive().numbers.equals(listOf(6, 11, 23, 42, 69)))
    }

    @Test
    fun testTicket(){
        for(tick: FiveTicket in fiveScorePresenter.listFive()){
            if (equals(listOf(5,23,27,48,57)))
                assert(tick.equals(listOf(5,23,27,48,57)))
        }
    }

    @After
    fun tearDown() {
        fiveScorePresenter.detachScreen()
    }
}