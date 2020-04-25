package hu.lottery.presenter

import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.screen.LoginScreen
import javax.inject.Inject

class LoginPresenter @Inject constructor(private val databaseInteractor: DatabaseInteractor): Presenter<LoginScreen>() {
    override fun attachScreen(screen: LoginScreen) {
        super.attachScreen(screen)
    }
    override fun detachScreen() {
        super.detachScreen()
    }

    fun login(){}

    fun register(){}
}