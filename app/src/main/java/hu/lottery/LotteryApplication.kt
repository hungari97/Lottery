package hu.lottery

import android.app.Application
import hu.lottery.view.UIModule

class LotteryApplication: Application() {
    lateinit var injector: LotteryApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injector = DaggerLotteryApplicationComponent.builder().uIModule(UIModule(this)).build()

    }
}