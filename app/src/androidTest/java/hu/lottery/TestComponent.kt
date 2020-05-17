package hu.lottery

import dagger.Component
import hu.lottery.mock.MockNetworkModule
import hu.lottery.model.interactor.InteractorModule
import hu.lottery.test.FiveLastTest
import hu.lottery.test.FiveTest
import hu.lottery.test.SixLastTest
import hu.lottery.test.SixTest
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class])
interface TestComponent : LotteryApplicationComponent {
    fun inject(fiveTest: FiveTest)
    fun inject(sixTest: SixTest)
    fun inject(fiveLastTest: FiveLastTest)
    fun inject(sixLastTest: SixLastTest)
}
