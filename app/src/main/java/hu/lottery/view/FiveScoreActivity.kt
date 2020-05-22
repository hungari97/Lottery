package hu.lottery.view


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.model.FiveTicket
import hu.lottery.presenter.FiveScorePresenter
import hu.lottery.screen.FiveScoreScreen
import hu.lottery.view.adapter.FiveAdapter
import kotlinx.android.synthetic.main.activity_five_score.*
import javax.inject.Inject

class FiveScoreActivity : AppCompatActivity(), FiveScoreScreen {

    @Inject
    lateinit var fiveScorePresenter: FiveScorePresenter
    lateinit var adapter: FiveAdapter

    override fun showWinnerNumbers(numbers: List<Int>) {

        tvWinnerNumb1.text = numbers.get(0).toString()
        tvWinnerNumb2.text = numbers.get(1).toString()
        tvWinnerNumb3.text = numbers.get(2).toString()
        tvWinnerNumb4.text = numbers.get(3).toString()
        tvWinnerNumb5.text = numbers.get(4).toString()

    }

    override fun showLastWeekTickets(tickets: List<FiveTicket>) {
        adapter = FiveAdapter(this, fiveScorePresenter.listFive())
        rvLastFive.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        fiveScorePresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        fiveScorePresenter.detachScreen()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_five_score)

        showLastWeekTickets(fiveScorePresenter.listFive())

        showWinnerNumbers(fiveScorePresenter.getWinnerFive().numbers)

        ibLastFiveback.setOnClickListener { startActivity(Intent(this, FiveActivity::class.java)) }

    }
}
