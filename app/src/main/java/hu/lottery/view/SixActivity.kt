package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.SixPresenter
import hu.lottery.screen.SixScreen
import javax.inject.Inject

class SixActivity : AppCompatActivity(),SixScreen {

    @Inject
    lateinit var sixPresenter: SixPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_six)


        //TODO vissza, beküld és eredmény gomb bekötése
    }

    override fun onStart() {
        super.onStart()
        sixPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        sixPresenter.detachScreen()
    }


    fun rule():Boolean{
        return true
    }

}
