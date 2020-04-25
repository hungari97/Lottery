package hu.lottery.presenter

import hu.lottery.screen.SixScreen

object SixPresenter : Presenter<SixScreen>() {
    override fun attachScreen(screen: SixScreen) {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }

    fun addNewTicket(numbers: List<Int>) {}
}