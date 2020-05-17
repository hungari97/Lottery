package hu.lottery.presenter

import hu.lottery.model.FiveTicket
import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.model.interactor.WinnerNumberInteractor
import hu.lottery.screen.FiveScoreScreen
import java.util.concurrent.Executor
import javax.inject.Inject

class FiveScorePresenter @Inject constructor(private val databaseInteractor: DatabaseInteractor, private val winnerNumberInteractor: WinnerNumberInteractor): Presenter<FiveScoreScreen>() {

    fun getWinnerFive():List<Int>{
        winnerNumberInteractor.getWinnerNumber()
    }

    override fun attachScreen(screen: FiveScoreScreen) {
        super.attachScreen(screen)
    }
    override fun detachScreen() {
        super.detachScreen()
    }
}