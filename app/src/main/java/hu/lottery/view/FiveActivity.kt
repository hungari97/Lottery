package hu.lottery.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.FivePresenter
import hu.lottery.screen.FiveScreen
import javax.inject.Inject

class FiveActivity : AppCompatActivity(),FiveScreen {

    @Inject
    lateinit var fivePresenter: FivePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_five)

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
