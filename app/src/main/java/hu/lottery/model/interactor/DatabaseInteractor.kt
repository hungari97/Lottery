package hu.lottery.model.interactor

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.LotteryApi
import hu.lottery.network.client.api.TokenApi
import hu.lottery.network.mock.MockLotteryApi
import javax.inject.Inject

class DatabaseInteractor @Inject constructor(
    private val lotteryApi: LotteryApi,
    private val tokenApi: TokenApi
) {
    lateinit var token:String
    val fiveData=mutableListOf<FiveTicket>()
    val sixData=mutableListOf<SixTicket>()

    fun initialisationData(){
        Thread{val callfive=lotteryApi.getLastFive(token)?:throw Error("No call was returned")
        val bodyfive=callfive.execute().body()
            ?.filterNotNull()
            ?: throw Error("No data in responses")
        fiveData.addAll(bodyfive)

        val callsix=lotteryApi.getLastSix(token)?:throw Error("No call was returned")
        val bodysix=callsix.execute().body()
            ?.filterNotNull()
            ?: throw Error("No data in responses")
        sixData.addAll(bodysix)}.start()
    }

    fun authenticateUser(name : String, password: String):Boolean{
        val call = tokenApi.getToken(name,password)
        val response = call.execute()
        token = response.body()
        initialisationData()
        return token.compareTo("")==0
    }

    fun listFiveTickets(): List<FiveTicket> {
        /*val call = lotteryApi.getLastFive(token)
        val response = call?.execute() ?: throw Error("No call was returned")
        return response.body()
            ?.filterNotNull()
            ?.map { it as FiveTicket }
            ?: throw Error("No data in responses")*/
        return fiveData
    }

    fun listSixTickets(): List<SixTicket> {
        /*val call = lotteryApi.getLastSix(token)
        val response = call?.execute() ?: throw Error("No call was returned")
        return response.body()
            ?.filterNotNull()
            ?.map { it as SixTicket }
            ?: throw Error("No data in responses")*/
        return sixData
    }

    fun addNewSixTickets(tickets:List<SixTicket>){
        tickets.forEach {
            lotteryApi.postSix(token,it)
        }
        sixData.addAll(tickets)
    }

    fun addNewFiveTickets(tickets:List<FiveTicket>){
        tickets.forEach {
            lotteryApi.postFive(token,it)
        }
        fiveData.addAll(tickets)
    }
}