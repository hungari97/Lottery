package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.presenter.WeeklyPresenter
import hu.lottery.screen.WeeklyScreen

class WeeklyNumberActivity : AppCompatActivity(),WeeklyScreen {

    override fun showWeeklyNumbers(numbers: List<ArrayList<Int>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStart() {
        super.onStart()
        WeeklyPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        WeeklyPresenter.detachScreen()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weekly_number)

        //TODO vissza gomb becsatolása
    }


}
