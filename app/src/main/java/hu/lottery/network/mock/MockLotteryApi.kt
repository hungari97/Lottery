package hu.lottery.network.mock

import android.content.Context
import hu.lottery.database.AppDatabase
import hu.lottery.database.entity.FiveTicketEntity
import hu.lottery.database.entity.SixTicketEntity
import hu.lottery.mock.CallVoid
import hu.lottery.mock.MockCall
import hu.lottery.model.FiveTicket
import hu.lottery.model.SixTicket
import hu.lottery.network.client.api.LotteryApi
import retrofit2.Call
import java.util.*

class MockLotteryApi(private val context: Context) : LotteryApi {

    val database=AppDatabase.getInstance(context)

    override fun getLastFive(token: String?): Call<List<FiveTicket?>?>? {
        var list = database.fiveTicketDao().getAllFiveTicket()
            .map { FiveTicket(listOf(it.first,it.second,it.third,it.fourth,it.fifth),it.week) }.toMutableList()

        list.add(FiveTicket(
                numbers = listOf(5, 23, 27, 48, 57),
                week = Calendar.WEEK_OF_YEAR - 1
            )
        )

        val obj = MockCall<List<FiveTicket?>?>(list)

        return obj
    }

    override fun postFive(token: String?, body: FiveTicket?): Call<Void> {

         var entity = FiveTicketEntity(
             Id = 0,
             first = body!!.numbers[0],
             second = body.numbers[1],
             third = body.numbers[2],
             fourth = body.numbers[3],
             fifth = body.numbers[4],
             week = Calendar.WEEK_OF_YEAR
         )
        print(body)
        Thread{
        database.fiveTicketDao().insertFiveTicket(entity)
        }.start()


        val call = CallVoid()

        return call
    }

    override fun getLastSix(token: String?): Call<List<SixTicket?>?>? {

        var list = database.sixTicketDao().getAllSixTicket()
            .map { SixTicket(listOf(it.first,it.second,it.third,it.fourth,it.fifth,it.sixth),it.week) }.toMutableList()

        list.add(
            SixTicket(
                numbers = listOf(5, 23, 27, 36, 40, 43),
                week = Calendar.WEEK_OF_YEAR - 1
            )
        )
        val obj = MockCall<List<SixTicket?>?>(list)
        return obj
    }

    override fun postSix(token: String?, body: SixTicket?): Call<Void> {
        var entity = SixTicketEntity(
            Id = 0,
            first = body!!.numbers[0],
            second = body.numbers[1],
            third = body.numbers[2],
            fourth = body.numbers[3],
            fifth = body.numbers[4],
            sixth = body.numbers[5],
            week = body.week!!
        )
        Thread{
        database.sixTicketDao().insertSixTicket(entity)
        }.start()


        val call = CallVoid()

        return call
    }
}

