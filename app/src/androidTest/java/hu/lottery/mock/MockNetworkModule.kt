package hu.lottery.mock

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.WinnerApi
import javax.inject.Singleton

@Module
class MockNetworkModule {

    @Provides
    @Singleton
    fun provideLotteryApi(provideContext: Context): LotteryApi = MockLotteryApi(provideContext)

    @Provides
    @Singleton
    fun provideWinnerApi(provideContext: Context): WinnerApi = MockWinnerApi(provideContext)
}