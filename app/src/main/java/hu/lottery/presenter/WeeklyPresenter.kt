package hu.lottery.presenter

import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.screen.WeeklyScreen
import javax.inject.Inject

class WeeklyPresenter @Inject constructor(private val databaseInteractor: DatabaseInteractor): Presenter<WeeklyScreen>() {
    override fun attachScreen(screen: WeeklyScreen) {
        super.attachScreen(screen)
    }
    override fun detachScreen() {
        super.detachScreen()
    }


}