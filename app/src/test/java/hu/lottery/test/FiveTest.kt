package hu.lottery.test

import hu.lottery.presenter.FivePresenter
import hu.lottery.screen.FiveScreen
import hu.lottery.testInjector
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject
import kotlin.random.Random


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

        var original=fivePresenter.getSize()
        val randomValues=List(5) { Random.nextInt(1, 90) }

        val list=ArrayList<Int>()
        list.addAll(randomValues)

        fivePresenter.addNewTicket(list)
        var new=fivePresenter.getSize()

        assertNotEquals(original,new)

    }

    @After
    fun tearDown() {
        fivePresenter.detachScreen()
    }
}