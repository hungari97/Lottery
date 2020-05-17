package hu.lottery.mock

import android.content.Context
import hu.lottery.database.AppDatabase
import hu.lottery.database.dao.FiveTicketDao
import hu.lottery.database.entity.FiveTicketEntity
import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.LotteryApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
import java.util.*

class MockLotteryApi : LotteryApi {


    override fun getLastFive(token: String?): Call<List<FiveTicket?>?>? {
        var temp=AppDatabase.getInstance().fiveTicketDao().getAllFiveTicket()

        val call = object : Call<List<FiveTicket?>?> {
            override fun enqueue(callback: Callback<List<FiveTicket?>?>?) {
            }

            @Throws(IOException::class)
            override fun execute(): Response<List<FiveTicket?>?> {
                return Response.success(temp)
            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<List<FiveTicket?>?> {
                return this
            }

        }
        return call
    }

    override fun postFive(token: String?, body: FiveTicket?): Call<Void?>? {


        var entity = FiveTicketEntity(
            Id=0,
            first = body!!.numbers[0],
            second = body.numbers[1],
            third = body.numbers[2],
            fourth = body.numbers[3],
            fifth = body.numbers[4],
            week = Calendar.WEEK_OF_YEAR
        )
        var temp=AppDatabase.getInstance(Context).fiveTicketDao().insertFiveTicket(entity)

        val call = object :  Call<Void?> {
            override fun enqueue(callback: Callback<Void?>?) {
            }

            @Throws(IOException::class)
            override fun execute(): Response<Void?> {
                return Response.success()
            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<Void?> {
                return this
            }

        }

        return call
    }

    override fun getLastSix(token: String?): Call<List<SixTicket?>?>? {
        TODO("Not yet implemented")
    }

    override fun postSix(token: String?, body: SixTicket?): Call<Void?>? {
        AppDatabase.getInstance().sixTicketDao().insertSixTicket(body)
    }
}