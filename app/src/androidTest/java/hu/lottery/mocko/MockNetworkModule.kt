package hu.lottery.mocko

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.TokenApi
import hu.lottery.network.client.api.WinnerApi
import hu.lottery.network.mock.MockTokenApi
import hu.lottery.network.mock.MockWinnerApi
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class MockNetworkModule {

    @Provides
    @Singleton
    fun provideLotteryApi(provideContext: Context): LotteryApi = MockLotteryApi(provideContext)

    @Provides
    @Singleton
    fun provideWinnerApi(provideContext: Context): WinnerApi = MockWinnerApi()

    @Provides
    @Singleton
    fun provideTokenApi(): TokenApi = MockTokenApi()
}