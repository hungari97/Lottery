package hu.lottery.presenter

import android.icu.util.Calendar
import hu.lottery.model.FiveTicket
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

<<<<<<< HEAD
    fun addNewTicket(numbers: List<Int>){}
=======
    fun addNewTicket(numbers: ArrayList<Int>){
        databaseInteractor.addNewFiveTickets(listOf(FiveTicket(numbers, Calendar.WEEK_OF_YEAR)))
    }
>>>>>>> 356c4e94342bacbb1c7ea998a9e4a076932bf86a
}