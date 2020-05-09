package hu.lottery.network

import dagger.Module
import dagger.Provides
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.TokenApi
import hu.lottery.network.client.api.WinnerApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

import okhttp3.logging.HttpLoggingInterceptor

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }


    @Provides
    @Singleton
    fun provideTokenApi(client: OkHttpClient): TokenApi {
        val retrofit = Retrofit.Builder()
            .client(client)
            //.baseUrl(NetworkConfig.TOKEN_ENDPOINT_ADDRESS)
            //.addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(TokenApi::class.java)
    }

    @Provides
    @Singleton
    fun provideLotteryApi(client: OkHttpClient): LotteryApi {
        val retrofit = Retrofit.Builder()
            .client(client)
          //  .baseUrl(NetworkConfig.API_ENDPOINT_ADDRESS)
          //  .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(LotteryApi::class.java)
    }


    @Provides
    @Singleton
    fun provideWinnerApi(client: OkHttpClient): WinnerApi {
        val retrofit = Retrofit.Builder()
            .client(client)
            //.baseUrl(NetworkConfig.API_ENDPOINT_ADDRESS)
           // .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(WinnerApi::class.java)
    }
}