package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.presenter.MenuPresenter
import hu.lottery.presenter.SixPresenter
import hu.lottery.screen.SixScreen

class SixActivity : AppCompatActivity(),SixScreen {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)

        //TODO
    }

    override fun onStart() {
        super.onStart()
        SixPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        SixPresenter.detachScreen()
    }


    fun rule():Boolean{
        return true
    }
}
