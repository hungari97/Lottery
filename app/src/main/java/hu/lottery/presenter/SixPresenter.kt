package hu.lottery.presenter

import android.icu.util.Calendar
import android.os.Build
import androidx.annotation.RequiresApi
import hu.lottery.model.SixTicket
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

    @RequiresApi(Build.VERSION_CODES.N)
    fun addNewTicket(numbers: List<Int>) {
        //Thread{Database.addSixTicket(SixTicket(numbers,Calendar.WEEK_OF_YEAR))}.start()
        databaseInteractor.addNewSixTickets(listOf(SixTicket(numbers, Calendar.WEEK_OF_YEAR)))
    }

    fun getSize():Int{return databaseInteractor.listSixTickets().size}
}