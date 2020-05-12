package hu.lottery.mock

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.LotteryApi
import retrofit2.Call

class MockLotteryApi:LotteryApi {


    override fun getLastFive(token: String?): Call<List<FiveTicket?>?>? {
        TODO("Not yet implemented")
    }

    override fun postFive(token: String?, body: FiveTicket?): Call<Void?>? {
        TODO("Not yet implemented")
    }

    override fun getLastSix(token: String?): Call<List<SixTicket?>?>? {
        TODO("Not yet implemented")
    }

    override fun postSix(token: String?, body: SixTicket?): Call<Void?>? {
        TODO("Not yet implemented")
    }
}