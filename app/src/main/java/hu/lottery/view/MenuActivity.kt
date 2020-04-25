package hu.lottery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hu.lottery.R
import hu.lottery.presenter.MenuPresenter
import hu.lottery.screen.MenuScreen

class MenuActivity : AppCompatActivity(), MenuScreen {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    override fun onStart() {
        super.onStart()
        MenuPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        MenuPresenter.detachScreen()
    }


}
