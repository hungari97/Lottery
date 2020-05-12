package hu.lottery.network.client.api

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import retrofit2.Call
import retrofit2.http.GET

interface WinnerApi {
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @return Call<List></List><FiveTicket>>
    </FiveTicket> */
    @get:GET("FiveLottery")
    val winnerFive:Call<FiveTicket>

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @return Call<List></List><SixTicket>>
    </SixTicket> */
    @get:GET("SixLotter")
    val winnerSix: Call<SixTicket>
}