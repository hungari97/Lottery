package hu.lottery.view


import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
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

        if (v.background == getResources().getDrawable(R.drawable.number_style)) {
            if (newTicket.size > 5) {
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
        setContentView(R.layout.activity_six)

        ibLastSixback.setOnClickListener { startActivity(Intent(this, MenuActivity::class.java)) }

        btToLastSixTickets.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SixScoreActivity::class.java
                )
            )
        }

        btSendSixTicket.setOnClickListener {
            sixPresenter.addNewTicket(newTicket)
            startActivity(Intent(this, MenuActivity::class.java))
        }

        btSix1.setOnClickListener { onClick(btSix1) }
        btSix1.setOnClickListener {

        }
        btSix2.setOnClickListener {
            if (btSix2.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix2.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(2)
            } else {
                btSix2.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(2))
            }
        }
        btSix3.setOnClickListener {
            if (btSix3.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix3.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(3)
            } else {
                btSix3.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(3))
            }
        }
        btSix4.setOnClickListener {
            if (btSix4.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix4.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(4)
            } else {
                btSix4.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(4))
            }
        }
        btSix5.setOnClickListener {
            if (btSix5.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix5.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(5)
            } else {
                btSix5.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(5))
            }
        }
        btSix6.setOnClickListener {
            if (btSix6.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix6.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(6)
            } else {
                btSix6.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(6))
            }
        }
        btSix7.setOnClickListener {
            if (btSix7.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix7.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(7)
            } else {
                btSix7.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(7))
            }
        }
        btSix8.setOnClickListener {
            if (btSix8.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix8.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(8)
            } else {
                btSix8.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(8))
            }
        }
        btSix9.setOnClickListener {
            if (btSix9.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix9.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(9)
            } else {
                btSix9.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(9))
            }
        }
        btSix10.setOnClickListener {
            if (btSix10.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix10.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(10)
            } else {
                btSix10.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(10))
            }
        }
        btSix11.setOnClickListener {
            if (btSix11.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix11.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(11)
            } else {
                btSix11.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(11))
            }
        }
        btSix12.setOnClickListener {
            if (btSix12.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix12.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(12)
            } else {
                btSix12.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(12))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }
        btSix1.setOnClickListener {
            if (btSix1.background == getResources().getDrawable(R.drawable.number_style)) {
                btSix1.setBackground(getResources().getDrawable(R.drawable.choosen_number_style))
                newTicket.add(1)
            } else {
                btSix1.setBackground(getResources().getDrawable(R.drawable.number_style))
                newTicket.remove(newTicket.indexOf(1))
            }
        }

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
