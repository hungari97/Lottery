package hu.lottery.presenter

import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.screen.LoginScreen
import javax.inject.Inject

class LoginPresenter @Inject constructor(private val databaseInteractor: DatabaseInteractor) :
    Presenter<LoginScreen>() {
    override fun attachScreen(screen: LoginScreen) {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }

    fun login(name: String, password: String) {
        databaseInteractor.authenticateUser(name,password)
    }

    fun validate(username:String,password: String):Boolean {

        return databaseInteractor.authenticateUser(username,password)

    }
}