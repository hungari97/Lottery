package hu.lottery.presenter

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.model.interactor.WinnerNumberInteractor
import hu.lottery.screen.SixScoreScreen
import java.util.*
import java.util.concurrent.Executor
import javax.inject.Inject

class SixScorePresenter @Inject constructor(
    private val databaseInteractor: DatabaseInteractor,
    private val winnerNumberInteractor: WinnerNumberInteractor
) : Presenter<SixScoreScreen>() {

    fun getWinnerSix(): SixTicket =
        winnerNumberInteractor.getWinnerSixNumber()

    fun listSix(): List<SixTicket> =
        databaseInteractor.listSixTickets().filter { it.week== Calendar.WEEK_OF_YEAR-1 }

    override fun attachScreen(screen: SixScoreScreen) {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }
}