package hu.lottery.network.mock

import android.content.Context
import hu.lottery.mock.MockCall
import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.WinnerApi
import retrofit2.Call
import java.util.*


class MockWinnerApi : WinnerApi {
    override val winnerFive: Call<FiveTicket>
        get() {
            val ticket = FiveTicket()
            ticket.week = Calendar.WEEK_OF_YEAR-1
            ticket.numbers = listOf(6, 11, 23, 42, 69)
            val obj =
                MockCall<FiveTicket>(
                    ticket
                )


            return obj
        }

    override val winnerSix: Call<SixTicket>
        get() {
            val ticket = SixTicket()
            ticket.week = Calendar.WEEK_OF_YEAR-1
            ticket.numbers = listOf(9, 19, 20, 29, 42, 45)
            val obj =
                MockCall<SixTicket>(
                    ticket
                )

            return obj
        }

}