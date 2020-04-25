package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.WeeklyPresenter
import hu.lottery.screen.WeeklyScreen
import javax.inject.Inject

class WeeklyNumberActivity : AppCompatActivity(),WeeklyScreen {

    @Inject
    lateinit var weeklyPresenter: WeeklyPresenter

    override fun showWeeklyNumbers(numbers: List<ArrayList<Int>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStart() {
        super.onStart()
        weeklyPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        weeklyPresenter.detachScreen()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_weekly_number)


        //TODO vissza gomb becsatolása
    }


}
