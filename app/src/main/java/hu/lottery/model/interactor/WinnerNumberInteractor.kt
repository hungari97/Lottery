package hu.lottery.model.interactor

import hu.lottery.model.FiveTicket
import hu.lottery.network.client.api.WinnerApi
import javax.inject.Inject

class WinnerNumberInteractor @Inject constructor(
    private val winnerApi: WinnerApi
) {



    fun getWinnerFiveNumber():List<Int>{
        return winnerApi.winnerFive
    }
}