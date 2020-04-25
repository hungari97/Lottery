package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.presenter.SixScorePresenter
import hu.lottery.screen.SixScoreScreen

class SixScoreActivity : AppCompatActivity(),SixScoreScreen {

    override fun showLastWeekTickets(tickets: List<ArrayList<Int>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showWinnerNumbers(numbers: ArrayList<Int>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_score)

        //TODO vissza gomb becsatolása
    }

    override fun onStart() {
        super.onStart()
        SixScorePresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        SixScorePresenter.detachScreen()
    }

}
