package hu.lottery.presenter

import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.screen.FiveScreen
import javax.inject.Inject

class FivePresenter @Inject constructor(private val databaseInteractor: DatabaseInteractor): Presenter<FiveScreen>() {

    override fun attachScreen(screen: FiveScreen) {
        super.attachScreen(screen)
    }
    override fun detachScreen() {
        super.detachScreen()
    }

    fun addNewTicket(numbers: List<Int>){}
}