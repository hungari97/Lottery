package hu.lottery.mock

import android.content.Context
import hu.lottery.database.AppDatabase
import hu.lottery.database.dao.FiveTicketDao
import hu.lottery.database.entity.FiveTicketEntity
import hu.lottery.database.entity.SixTicketEntity
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
        var list=ArrayList<FiveTicket>()

        for( tick : FiveTicketEntity in temp){
            if(tick.week==Calendar.WEEK_OF_YEAR-1){

                list.add(FiveTicket(
                    numbers = listOf(tick.first,tick.second,tick.third,tick.fourth,tick.fifth),
                week = tick.week
                ))
            }
        }

        list.add(
            FiveTicket(
            numbers = listOf(5,23,27,48,57),
                week = Calendar.WEEK_OF_YEAR-1
        ))


        val obj = MockCall<List<FiveTicket?>?>(list)


        return obj
    }

    override fun postFive(token: String?, body: FiveTicket?): Call<Void> {


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


        val call = CallVoid()

        return call
    }

    override fun getLastSix(token: String?): Call<List<SixTicket?>?>? {
        var temp=AppDatabase.getInstance().sixTicketDao().getAllSixTicket()
        var list=ArrayList<SixTicket>()

        for( tick : SixTicketEntity in temp){
            if(tick.week==Calendar.WEEK_OF_YEAR-1){

                list.add(SixTicket(
                    numbers = listOf(tick.first,tick.second,tick.third,tick.fourth,tick.fifth,tick.sixth),
                    week = tick.week
                ))
            }
        }

        list.add(
            SixTicket(
                numbers = listOf(5,23,27,36,40,43),
                week = Calendar.WEEK_OF_YEAR-1
            ))


        val obj = MockCall<List<SixTicket?>?>(list)


        return obj
    }

    override fun postSix(token: String?, body: SixTicket?): Call<Void> {
        var entity = SixTicketEntity(
        Id=0,
        first = body!!.numbers[0],
        second = body.numbers[1],
        third = body.numbers[2],
        fourth = body.numbers[3],
        fifth = body.numbers[4],
        sixth= body.numbers[5],
        week = Calendar.WEEK_OF_YEAR
    )

        var temp=AppDatabase.getInstance(Context).sixTicketDao().insertSixTicket(entity)


        val call = CallVoid()

        return call
    }
}