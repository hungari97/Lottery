package hu.lottery.mock

import dagger.Provides
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.WinnerApi
import javax.inject.Singleton

class MockNetworkModule {

    @Provides
    @Singleton
    fun provideLotteryApi(): LotteryApi = MockLotteryApi()

    @Provides
    @Singleton
    fun provideWinnerApi(): WinnerApi = MockWinnerApi()
}