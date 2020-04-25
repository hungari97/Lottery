package hu.lottery.presenter

import hu.lottery.screen.FiveScreen

object FivePresenter: Presenter<FiveScreen>() {
    override fun attachScreen(screen: FiveScreen) {
        super.attachScreen(screen)
    }
    override fun detachScreen() {
        super.detachScreen()
    }

    fun addNewTicket(numbers: ArrayList<Int>){}
}