package hu.lottery.mock

import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.WinnerApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException


class MockWinnerApi : WinnerApi {
    override val winnerFive: Call<FiveTicket>
        get() {
            val ticket = FiveTicket()
            ticket.week = 20
            ticket.numbers = listOf(6, 11, 23, 42, 69)
            val call = object : Call<FiveTicket> {
                override fun enqueue(callback: Callback<FiveTicket>?) {
                }

                @Throws(IOException::class)
                override fun execute(): Response<FiveTicket> {
                    return Response.success(ticket)
                }

                override fun isExecuted(): Boolean {
                    return false
                }

                override fun cancel() {

                }

                override fun isCanceled(): Boolean {
                    return false
                }

                override fun clone(): Call<FiveTicket> {
                    return this
                }
            }
            return call
        }

    override val winnerSix: Call<SixTicket>
        get() {
            val ticket = SixTicket()
            ticket.week = 20
            ticket.numbers = listOf(9, 19, 20, 29, 42, 45)
            val call = object : Call<SixTicket> {
                override fun enqueue(callback: Callback<SixTicket>?) {
                }

                @Throws(IOException::class)
                override fun execute(): Response<SixTicket> {
                    return Response.success(ticket)
                }

                override fun isExecuted(): Boolean {
                    return false
                }

                override fun cancel() {

                }

                override fun isCanceled(): Boolean {
                    return false
                }

                override fun clone(): Call<SixTicket> {
                    return this
                }
            }
            return call
        }

}