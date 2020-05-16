package hu.lottery.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.FivePresenter
import hu.lottery.screen.FiveScreen
import kotlinx.android.synthetic.main.activity_five.*
import kotlinx.android.synthetic.main.activity_six.*
import javax.inject.Inject

class FiveActivity : AppCompatActivity(),FiveScreen {

    @Inject
    lateinit var fivePresenter: FivePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_five)

        ibNewFiveback.setOnClickListener { startActivity(Intent(this,MenuActivity::class.java)) }

        btToLastFiveTickets.setOnClickListener { startActivity(Intent(this,FiveScoreActivity::class.java)) }
    }

    override fun onStart() {
        super.onStart()
        fivePresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        fivePresenter.detachScreen()
    }

}
