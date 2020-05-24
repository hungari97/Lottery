package hu.lottery.mock


import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.WinnerApi
import retrofit2.Call

class MockWinnerApi : WinnerApi {
    override val winnerFive: Call<FiveTicket>
        get() {
            val ticket = FiveTicket()
            ticket.week = 20
            ticket.numbers = listOf(6, 11, 23, 42, 69)
            val obj =MockCall<FiveTicket>(ticket)


            return obj
        }

    override val winnerSix: Call<SixTicket>
        get() {
            val ticket = SixTicket()
            ticket.week = 20
            ticket.numbers = listOf(9, 19, 20, 29, 42, 45)
            val obj =MockCall<SixTicket>(ticket)

            return obj
        }

}