package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.presenter.FivePresenter
import hu.lottery.screen.FiveScreen

class FiveActivity : AppCompatActivity(),FiveScreen {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
    }

    override fun onStart() {
        super.onStart()
        FivePresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        FivePresenter.detachScreen()
    }

}
