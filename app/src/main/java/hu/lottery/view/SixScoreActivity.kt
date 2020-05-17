package hu.lottery.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.model.SixTicket
import hu.lottery.presenter.SixScorePresenter
import hu.lottery.screen.SixScoreScreen
import hu.lottery.view.adapter.SixAdapter
import kotlinx.android.synthetic.main.activity_six_score.*
import javax.inject.Inject

class SixScoreActivity : AppCompatActivity(), SixScoreScreen {

    @Inject
    lateinit var sixScorePresenter: SixScorePresenter
    lateinit var adapter:SixAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_six_score)

        ibLastSixback.setOnClickListener { startActivity(Intent(this, SixActivity::class.java)) }

    }

    override fun onStart() {
        super.onStart()
        sixScorePresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        sixScorePresenter.detachScreen()
    }

    override fun showWinnerNumbers(numbers: List<Int>) {
        tvWinnerNumb1.text = numbers.get(0).toString()
        tvWinnerNumb2.text = numbers.get(1).toString()
        tvWinnerNumb3.text = numbers.get(2).toString()
        tvWinnerNumb4.text = numbers.get(3).toString()
        tvWinnerNumb5.text = numbers.get(4).toString()
        tvWinnerNumb6.text = numbers.get(5).toString()
    }

    override fun showLastWeekTickets(tickets: List<SixTicket>) {
        adapter = SixAdapter(this, sixScorePresenter.listSix())
        rvLastSix.adapter = adapter
    }

}
