package hu.lottery.model.interactor

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.WinnerApi
import javax.inject.Inject

class WinnerNumberInteractor @Inject constructor(
    private val winnerApi: WinnerApi
) {
    fun getWinnerFiveNumber():FiveTicket{
        val call = winnerApi.winnerFive
        val response = call.execute() ?: throw Error("No response was returned")
        return response.body()
    }

<<<<<<< HEAD


    fun getWinnerFiveNumber():List<Int>{
        return winnerApi.winnerFive
=======
    fun getWinnerSixNumber():SixTicket{
        val call = winnerApi.winnerSix
        val response = call.execute() ?: throw Error("No response was returned")
        return response.body()
>>>>>>> 356c4e94342bacbb1c7ea998a9e4a076932bf86a
    }
}