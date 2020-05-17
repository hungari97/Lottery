package hu.lottery.presenter

import hu.lottery.model.FiveTicket
import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.model.interactor.WinnerNumberInteractor
import hu.lottery.screen.FiveScoreScreen
import java.util.concurrent.Executor
import javax.inject.Inject

class FiveScorePresenter @Inject constructor(
    private val databaseInteractor: DatabaseInteractor,
    private val winnerNumberInteractor: WinnerNumberInteractor
) : Presenter<FiveScoreScreen>() {

<<<<<<< HEAD
    fun getWinnerFive():List<Int>{
        winnerNumberInteractor.getWinnerNumber()
    }
=======
    fun getWinnerFive(): List<FiveTicket> =
        listOf(winnerNumberInteractor.getWinnerFiveNumber())
>>>>>>> 356c4e94342bacbb1c7ea998a9e4a076932bf86a

    override fun attachScreen(screen: FiveScoreScreen) {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }
}