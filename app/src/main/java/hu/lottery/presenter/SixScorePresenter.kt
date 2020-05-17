package hu.lottery.presenter

import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.model.interactor.WinnerNumberInteractor
import hu.lottery.screen.SixScoreScreen
import java.util.concurrent.Executor
import javax.inject.Inject

<<<<<<< HEAD
class SixScorePresenter @Inject constructor( private val databaseInteractor: DatabaseInteractor, private val winnerNumberInteractor: WinnerNumberInteractor): Presenter<SixScoreScreen>() {
=======
class SixScorePresenter @Inject constructor(
    private val databaseInteractor: DatabaseInteractor,
    private val winnerNumberInteractor: WinnerNumberInteractor
) : Presenter<SixScoreScreen>() {
>>>>>>> 356c4e94342bacbb1c7ea998a9e4a076932bf86a
    override fun attachScreen(screen: SixScoreScreen) {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }
}