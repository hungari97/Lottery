package hu.lottery.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.MenuPresenter
import hu.lottery.screen.MenuScreen
import javax.inject.Inject

class MenuActivity : AppCompatActivity(), MenuScreen {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_menu)


        //TODO ötös, hatos és eheti gomb bekötése
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
