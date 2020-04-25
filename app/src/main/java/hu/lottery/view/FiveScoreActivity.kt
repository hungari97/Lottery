package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.FiveScorePresenter
import hu.lottery.screen.FiveScoreScreen
import javax.inject.Inject

class FiveScoreActivity : AppCompatActivity(),FiveScoreScreen {

    @Inject
    lateinit var fiveScorePresenter: FiveScorePresenter

    override fun showLastWeekTickets(tickets: List<ArrayList<Int>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showWinnerNumbers(numbers: ArrayList<Int>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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

    }
}
