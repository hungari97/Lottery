package hu.lottery

import dagger.Component
import hu.lottery.mock.MockNetworkModule
import hu.lottery.model.interactor.InteractorModule
import javax.inject.Singleton

class AndroidTestComponent {

    @Singleton
    @Component(modules = [MockNetworkModule::class, AndroidTestModule::class, InteractorModule::class])
    interface AndroidTestComponent : LotteryApplicationComponent
}