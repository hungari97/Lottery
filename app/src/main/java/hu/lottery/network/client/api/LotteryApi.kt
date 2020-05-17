package hu.lottery.network.client.api

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface LotteryApi {
    /**
     * Get the five tickets
     *
     * @param token Authentication number
     * @return Call<List></List><FiveTicket>>
    </FiveTicket> */
    @GET("FiveLottery,{token}")
    fun getLastFive(
        @Path("token") token: String?
    ): Call<List<FiveTicket?>?>?

    /**
     * Add a new five ticket
     *
     * @param token Authentication number
     * @param body five ticket that needs to be added
     * @return Call<Void>
    </Void> */
    @POST("FiveLottery,{token}")
    fun postFive(
        @Path("token") token: String?, @Body body: FiveTicket?
    ): Call<Void>

    /**
     * Get the six tickets
     *
     * @param token Authentication number
     * @return Call<List></List><SixTicket>>
    </SixTicket> */
    @GET("SixLottery")
    fun getLastSix(
        @Path("token") token: String?
    ): Call<List<SixTicket?>?>?

    /**
     * Add a new six ticket
     *
     * @param token Authentication number
     * @param body six ticket that needs to be added
     * @return Call<Void>
    </Void> */
    @POST("SixLottery")
    fun postSix(
        @Path("token") token: String?, @Body body: SixTicket?
    ): Call<Void>
}