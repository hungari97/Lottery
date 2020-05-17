package hu.lottery

import dagger.Component
import hu.lottery.model.interactor.InteractorModule
import hu.lottery.network.NetworkModule
import hu.lottery.network.mock.MockNetworkModule
import hu.lottery.view.*
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, InteractorModule::class, MockNetworkModule::class])
interface LotteryApplicationComponent {
    fun inject(menuActivity: MenuActivity)
    fun inject(sixActivity: SixActivity)
    fun inject(sixScoreActivity: SixScoreActivity)
    fun inject(fiveActivity: FiveActivity)
    fun inject(fiveScoreActivity: FiveScoreActivity)
    fun inject(loginActivity: LoginActivity)
    fun inject(weeklyActivity: WeeklyNumberActivity)
}