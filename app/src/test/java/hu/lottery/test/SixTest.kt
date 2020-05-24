package hu.lottery.test

import hu.lottery.presenter.SixPresenter
import hu.lottery.screen.SixScreen
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
class SixTest {

    @Inject
    lateinit var sixPresenter: SixPresenter

    private lateinit var sixScreen: SixScreen
    private lateinit var query: String

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        sixScreen = Mockito.mock(SixScreen::class.java)!!
        sixPresenter.attachScreen(sixScreen)
    }

    @Test
    fun test() {
        var original= sixPresenter.getSize()
        val randomValues=List(6) { Random.nextInt(1, 45) }

        sixPresenter.addNewTicket(randomValues)
        var new= sixPresenter.getSize()

        assertNotEquals(original, new)

    }

    @After
    fun tearDown() {
        sixPresenter.detachScreen()
    }

}