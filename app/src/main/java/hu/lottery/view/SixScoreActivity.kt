package hu.lottery.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.SixScorePresenter
import hu.lottery.screen.SixScoreScreen
import javax.inject.Inject

class SixScoreActivity : AppCompatActivity(),SixScoreScreen {

    @Inject
    lateinit var sixScorePresenter: SixScorePresenter

    override fun showLastWeekTickets(tickets: List<ArrayList<Int>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showWinnerNumbers(numbers: ArrayList<Int>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_six_score)


        //TODO vissza gomb becsatolása
    }

    override fun onStart() {
        super.onStart()
        sixScorePresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        sixScorePresenter.detachScreen()
    }

}
