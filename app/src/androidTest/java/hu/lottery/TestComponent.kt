package hu.lottery

import dagger.Component
import hu.lottery.mock.MockNetworkModule
import hu.lottery.model.interactor.InteractorModule
import hu.lottery.test.*
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class])
interface TestComponent : LotteryApplicationComponent {
    fun inject(fiveTest: FiveTest)
    fun inject(sixTest: SixTest)
    fun inject(fiveLastTest: FiveLastTest)
    fun inject(sixLastTest: SixLastTest)
    fun inject(weeklyTest: WeeklyTest)
}
