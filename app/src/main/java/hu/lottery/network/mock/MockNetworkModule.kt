package hu.lottery.network.mock

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.TokenApi
import hu.lottery.network.client.api.WinnerApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
class MockNetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun provideLotteryApi(context: Context): LotteryApi = MockLotteryApi(context)

    @Provides
    @Singleton
    fun provideWinnerApi(): WinnerApi = MockWinnerApi()

    @Provides
    @Singleton
    fun provideTokenApi(client: OkHttpClient): TokenApi = MockTokenApi()
}