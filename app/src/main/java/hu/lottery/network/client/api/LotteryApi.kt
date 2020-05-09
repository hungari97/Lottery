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
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param token Authentication number
     * @return Call<List></List><FiveTicket>>
    </FiveTicket> */
    @GET("FiveLottery,{token}")
    fun getLastFive(
        @Path("token") token: String?
    ): Call<List<FiveTicket?>?>?

    /**
     * Add a new pet to the store
     *
     * @param token Authentication number
     * @param body Pet object that needs to be added to the store
     * @return Call<Void>
    </Void> */
    @POST("FiveLottery,{token}")
    fun postFive(
        @Path("token") token: String?, @Body body: FiveTicket?
    ): Call<Void?>?

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param token Authentication number
     * @return Call<List></List><SixTicket>>
    </SixTicket> */
    @GET("SixLottery")
    fun getLastSix(
        @Path("token") token: String?
    ): Call<List<SixTicket?>?>?

    /**
     * Add a new pet to the store
     *
     * @param token Authentication number
     * @param body Pet object that needs to be added to the store
     * @return Call<Void>
    </Void> */
    @POST("SixLottery")
    fun postSix(
        @Path("token") token: String?, @Body body: SixTicket?
    ): Call<Void?>?
}