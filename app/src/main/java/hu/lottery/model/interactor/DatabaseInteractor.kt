package hu.lottery.model.interactor

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.TokenApi
import javax.inject.Inject

class DatabaseInteractor @Inject constructor(
    private val lotteryApi: LotteryApi,
    private val tokenApi: TokenApi
) {
    lateinit var token:String
    fun authenticateUser(name : String, password: String):Boolean{
        val call = tokenApi.getToken(name,password)
        val response = call.execute()
        token = response.body()
        return token.compareTo("")==0
    }

    fun listFiveTickets(): List<FiveTicket> {
        val call = lotteryApi.getLastFive(token)
        val response = call?.execute() ?: throw Error("No call was returned")
        return response.body()
            ?.filterNotNull()
            ?.map { it as FiveTicket }
            ?: throw Error("No data in responses")
    }

    fun listSixTickets(): List<SixTicket> {
        val call = lotteryApi.getLastSix(token)
        val response = call?.execute() ?: throw Error("No call was returned")
        return response.body()
            ?.filterNotNull()
            ?.map { it as SixTicket }
            ?: throw Error("No data in responses")
    }

    fun addNewSixTickets(tickets:List<SixTicket>){
        tickets.forEach {
            lotteryApi.postSix(token,it)
        }
    }

    fun addNewFiveTickets(tickets:List<FiveTicket>){
        tickets.forEach {
            lotteryApi.postFive(token,it)
        }
    }
}