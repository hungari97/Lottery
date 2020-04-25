package hu.lottery.presenter

import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.screen.SixScreen
import javax.inject.Inject

class SixPresenter @Inject constructor(private val databaseInteractor: DatabaseInteractor): Presenter<SixScreen>() {


    override fun attachScreen(screen: SixScreen) {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }

    fun addNewTicket(numbers: List<Int>) {}
}