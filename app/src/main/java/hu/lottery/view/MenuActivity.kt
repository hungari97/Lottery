package hu.lottery.view

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.MenuPresenter
import hu.lottery.screen.MenuScreen
import kotlinx.android.synthetic.main.activity_menu.*
import javax.inject.Inject

class MenuActivity : AppCompatActivity(), MenuScreen {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_menu)


        btFiveLottery.setOnClickListener { startActivity(Intent(this, FiveActivity::class.java)) }

        btSixLottery.setOnClickListener { startActivity(Intent(this, SixActivity::class.java)) }

        btWeeklyTickets.setOnClickListener { startActivity(Intent(this,WeeklyNumberActivity::class.java)) }
        /*ivFive.bringToFront()
        ivSix.bringToFront()*/
        //val crashButton = Button(this)


        btCrash.text = "Crash!"
        btCrash.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }

/*        addContentView(btCrash, ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT))*/
    }

    @Inject
    lateinit var menuPresenter: MenuPresenter

    override fun onStart() {
        super.onStart()
        menuPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        menuPresenter.detachScreen()
    }


}
