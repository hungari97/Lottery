package hu.lottery.presenter

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.model.interactor.DatabaseInteractor
import hu.lottery.screen.WeeklyScreen
import javax.inject.Inject

class WeeklyPresenter @Inject constructor(private val databaseInteractor: DatabaseInteractor) :
    Presenter<WeeklyScreen>() {


    fun listFive(): List<FiveTicket> =
        databaseInteractor.listFiveTickets()

    fun listSix(): List<SixTicket> =
        databaseInteractor.listSixTickets()

    override fun attachScreen(screen: WeeklyScreen) {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }


}