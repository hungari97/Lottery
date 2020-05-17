package hu.lottery.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.FivePresenter
import hu.lottery.screen.FiveScreen
import kotlinx.android.synthetic.main.activity_five.*
import javax.inject.Inject

class FiveActivity : AppCompatActivity(),FiveScreen {

    @Inject
    lateinit var fivePresenter: FivePresenter
    var newTicket=ArrayList<Int>()

    fun onClick(v: Button) {

        if (v.background == getResources().getDrawable(R.drawable.number_style)) {
            if (newTicket.size > 6) {
                v.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(v.text.toString().toInt())
            }
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.number_style))
            newTicket.remove(newTicket.indexOf(v.text.toString().toInt()))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_five)

        ibNewFiveback.setOnClickListener { startActivity(Intent(this,MenuActivity::class.java)) }

        btToLastFiveTickets.setOnClickListener { startActivity(Intent(this,FiveScoreActivity::class.java)) }

        btFive1.setOnClickListener { onClick(btFive1) }
	btFive2.setOnClickListener { onClick(btFive2) }
	btFive3.setOnClickListener { onClick(btFive3) }
	btFive4.setOnClickListener { onClick(btFive4) }
	btFive5.setOnClickListener { onClick(btFive5) }
	btFive6.setOnClickListener { onClick(btFive6) }
	btFive7.setOnClickListener { onClick(btFive7) }
	btFive8.setOnClickListener { onClick(btFive8) }
	btFive9.setOnClickListener { onClick(btFive9) }
	btFive10.setOnClickListener { onClick(btFive10) }
	btFive11.setOnClickListener { onClick(btFive11) }
	btFive12.setOnClickListener { onClick(btFive12) }
	btFive13.setOnClickListener { onClick(btFive13) }
	btFive14.setOnClickListener { onClick(btFive14) }
	btFive15.setOnClickListener { onClick(btFive15) }
	btFive16.setOnClickListener { onClick(btFive16) }
	btFive17.setOnClickListener { onClick(btFive17) }
	btFive18.setOnClickListener { onClick(btFive18) }
	btFive19.setOnClickListener { onClick(btFive19) }
	btFive20.setOnClickListener { onClick(btFive20) }
	btFive21.setOnClickListener { onClick(btFive21) }
	btFive22.setOnClickListener { onClick(btFive22) }
	btFive23.setOnClickListener { onClick(btFive23) }
	btFive24.setOnClickListener { onClick(btFive24) }
	btFive25.setOnClickListener { onClick(btFive25) }
	btFive26.setOnClickListener { onClick(btFive26) }
	btFive27.setOnClickListener { onClick(btFive27) }
	btFive28.setOnClickListener { onClick(btFive28) }
	btFive29.setOnClickListener { onClick(btFive29) }
	btFive30.setOnClickListener { onClick(btFive30) }
	btFive31.setOnClickListener { onClick(btFive31) }
	btFive32.setOnClickListener { onClick(btFive32) }
	btFive33.setOnClickListener { onClick(btFive33) }
	btFive34.setOnClickListener { onClick(btFive34) }
	btFive35.setOnClickListener { onClick(btFive35) }
	btFive36.setOnClickListener { onClick(btFive36) }
	btFive37.setOnClickListener { onClick(btFive37) }
	btFive38.setOnClickListener { onClick(btFive38) }
	btFive39.setOnClickListener { onClick(btFive39) }
	btFive40.setOnClickListener { onClick(btFive40) }
	btFive41.setOnClickListener { onClick(btFive41) }
	btFive42.setOnClickListener { onClick(btFive42) }
	btFive43.setOnClickListener { onClick(btFive43) }
	btFive44.setOnClickListener { onClick(btFive44) }
	btFive45.setOnClickListener { onClick(btFive45) }
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
