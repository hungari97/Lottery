package hu.lottery.presenter

import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.model.interactor.WinnerNumberInteractor
import hu.lottery.screen.SixScoreScreen
import java.util.concurrent.Executor
import javax.inject.Inject

class SixScorePresenter @Inject constructor( private val databaseInteractor: DatabaseInteractor, private val winnerNumberInteractor: WinnerNumberInteractor): Presenter<SixScoreScreen>() {
    override fun attachScreen(screen: SixScoreScreen) {
        super.attachScreen(screen)
    }
    override fun detachScreen() {
        super.detachScreen()
    }
}