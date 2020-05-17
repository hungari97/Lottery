package hu.lottery.test

import hu.lottery.LotteryApplication
import hu.lottery.database.AppDatabase
import hu.lottery.presenter.FivePresenter
import hu.lottery.screen.FiveScreen
import hu.lottery.testInjector
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import javax.inject.Inject
import kotlin.random.Random
import hu.lottery.TestModule

@RunWith(RobolectricTestRunner::class)
class FiveTest {

    @Inject
    lateinit var fivePresenter: FivePresenter

    private lateinit var fiveScreen: FiveScreen

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        fiveScreen = Mockito.mock(FiveScreen::class.java)!!
        fivePresenter.attachScreen(fiveScreen)

    }

    @Test
    fun test() {
        var original=AppDatabase.getInstance().fiveTicketDao().getAllFiveTicket().size
        val randomValues=List(5) { Random.nextInt(1, 90) }

        val list=ArrayList<Int>()
        list.addAll(randomValues)

        fivePresenter.addNewTicket(list)
        var new=AppDatabase.getInstance(RuntimeEnvironment.application as LotteryApplication).fiveTicketDao().getAllFiveTicket().size

        assert(original!=new)

    }

    @After
    fun tearDown() {
        fivePresenter.detachScreen()
    }
}