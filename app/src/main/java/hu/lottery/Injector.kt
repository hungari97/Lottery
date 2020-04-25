package hu.lottery

import android.app.Activity

val Activity.injector: LotteryApplicationComponent
    get() {
        return (this.applicationContext as LotteryApplication).injector
    }