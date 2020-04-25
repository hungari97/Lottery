package hu.lottery.presenter

import hu.lottery.screen.LoginScreen

object LoginPresenter: Presenter<LoginScreen>() {
    override fun attachScreen(screen: LoginScreen) {
        super.attachScreen(screen)
    }
    override fun detachScreen() {
        super.detachScreen()
    }

    fun login(){}

    fun register(){}
}