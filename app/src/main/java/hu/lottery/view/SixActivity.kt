package hu.lottery.view


import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.SixPresenter
import hu.lottery.screen.SixScreen
import kotlinx.android.synthetic.main.activity_six.*
import kotlinx.android.synthetic.main.activity_six_score.*
import java.lang.StringBuilder
import java.util.ArrayList
import javax.inject.Inject

class SixActivity : AppCompatActivity(), SixScreen {

    @Inject
    lateinit var sixPresenter: SixPresenter
    var newTicket = ArrayList<Int>()

    fun onClick(v: Button) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (v.background.constantState == getDrawable(R.drawable.number_style)!!.constantState) {
                if (newTicket.size < 6) {
                    v.setBackgroundResource(R.drawable.choosen_number_style)
                    newTicket.add(v.text.toString().toInt())
                }
            } else {
                v.setBackgroundResource((R.drawable.number_style))
                newTicket.removeAt(newTicket.indexOf(v.text.toString().toInt()))
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_six)

        ibNewSixBack.setOnClickListener { startActivity(Intent(this, MenuActivity::class.java)) }

        btToLastSixTickets.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SixScoreActivity::class.java
                )
            )
        }

        btSendSixTicket.setOnClickListener {
            if (newTicket.size == 6) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    sixPresenter.addNewTicket(newTicket)
                }
                startActivity(Intent(this, MenuActivity::class.java))
            }
        }


        btSix1.setOnClickListener { onClick(btSix1) }
        btSix2.setOnClickListener { onClick(btSix2) }
        btSix3.setOnClickListener { onClick(btSix3) }
        btSix4.setOnClickListener { onClick(btSix4) }
        btSix5.setOnClickListener { onClick(btSix5) }
        btSix6.setOnClickListener { onClick(btSix6) }
        btSix7.setOnClickListener { onClick(btSix7) }
        btSix8.setOnClickListener { onClick(btSix8) }
        btSix9.setOnClickListener { onClick(btSix9) }
        btSix10.setOnClickListener { onClick(btSix10) }

        btSix11.setOnClickListener { onClick(btSix11) }
        btSix12.setOnClickListener { onClick(btSix12) }
        btSix13.setOnClickListener { onClick(btSix13) }
        btSix14.setOnClickListener { onClick(btSix14) }
        btSix15.setOnClickListener { onClick(btSix15) }
        btSix16.setOnClickListener { onClick(btSix16) }
        btSix17.setOnClickListener { onClick(btSix17) }
        btSix18.setOnClickListener { onClick(btSix18) }
        btSix19.setOnClickListener { onClick(btSix19) }
        btSix20.setOnClickListener { onClick(btSix20) }

        btSix21.setOnClickListener { onClick(btSix21) }
        btSix22.setOnClickListener { onClick(btSix22) }
        btSix23.setOnClickListener { onClick(btSix23) }
        btSix24.setOnClickListener { onClick(btSix24) }
        btSix25.setOnClickListener { onClick(btSix25) }
        btSix26.setOnClickListener { onClick(btSix26) }
        btSix27.setOnClickListener { onClick(btSix27) }
        btSix28.setOnClickListener { onClick(btSix28) }
        btSix29.setOnClickListener { onClick(btSix29) }
        btSix30.setOnClickListener { onClick(btSix30) }

        btSix31.setOnClickListener { onClick(btSix31) }
        btSix32.setOnClickListener { onClick(btSix32) }
        btSix33.setOnClickListener { onClick(btSix33) }
        btSix34.setOnClickListener { onClick(btSix34) }
        btSix35.setOnClickListener { onClick(btSix35) }
        btSix36.setOnClickListener { onClick(btSix36) }
        btSix37.setOnClickListener { onClick(btSix37) }
        btSix38.setOnClickListener { onClick(btSix38) }
        btSix39.setOnClickListener { onClick(btSix39) }
        btSix40.setOnClickListener { onClick(btSix40) }

        btSix41.setOnClickListener { onClick(btSix41) }
        btSix42.setOnClickListener { onClick(btSix42) }
        btSix43.setOnClickListener { onClick(btSix43) }
        btSix44.setOnClickListener { onClick(btSix44) }
        btSix45.setOnClickListener { onClick(btSix45) }


    }

    override fun onStart() {
        super.onStart()
        sixPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        sixPresenter.detachScreen()
    }


    fun rule(): Boolean {
        return true
    }

}
