package hu.lottery.model.interactor

import dagger.Module
import dagger.Provides
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.TokenApi
import hu.lottery.network.client.api.WinnerApi
import javax.inject.Singleton

@Module
class InteractorModule {

    @Provides
    @Singleton
    fun databaseInteractor(lotteryApi: LotteryApi, tokenApi: TokenApi) =
        DatabaseInteractor(lotteryApi, tokenApi)


    @Provides
    @Singleton
    fun winnerNumberInteractor(winnerApi: WinnerApi) =
        WinnerNumberInteractor(winnerApi)

}