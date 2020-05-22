package hu.lottery.view

import android.content.AbstractThreadedSyncAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.WeeklyPresenter
import hu.lottery.screen.WeeklyScreen
import hu.lottery.view.adapter.FiveAdapter
import hu.lottery.view.adapter.SixAdapter
import kotlinx.android.synthetic.main.activity_five_score.*
import kotlinx.android.synthetic.main.activity_weekly_number.*
import java.util.*
import javax.inject.Inject

class WeeklyNumberActivity : AppCompatActivity(),WeeklyScreen {

    @Inject
    lateinit var weeklyPresenter: WeeklyPresenter
    lateinit var fiveadapter: FiveAdapter
    lateinit var sixAdapter: SixAdapter

    override fun showWeeklyNumbers() {
        val five = weeklyPresenter.listFive()


        fiveadapter = FiveAdapter(this, five)
        rvWeeklyFive.adapter = fiveadapter

        val six = weeklyPresenter.listSix()

        sixAdapter= SixAdapter(this, six)
        rvWeeklySix.adapter=sixAdapter
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

        showWeeklyNumbers()
        ibWeeklyback.setOnClickListener { startActivity(Intent(this,MenuActivity::class.java)) }

        //TODO vissza gomb becsatolása
    }


}
