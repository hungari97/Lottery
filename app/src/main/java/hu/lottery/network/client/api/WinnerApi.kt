package hu.lottery.network.client.api

import retrofit2.Call
import retrofit2.http.GET

interface WinnerApi {
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @return Call<List></List><FiveTicket>>
    </FiveTicket> */
    @get:GET("FiveLottery")
    val winnerFive: Call<List<Any?>?>?

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @return Call<List></List><SixTicket>>
    </SixTicket> */
    @get:GET("SixLotter")
    val winnerSix: Call<List<Any?>?>?
}