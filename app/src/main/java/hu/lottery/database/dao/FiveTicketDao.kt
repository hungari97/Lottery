package hu.lottery.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import hu.lottery.database.entity.FiveTicketEntity

@Dao
interface FiveTicketDao {

        @Query("""SELECT week FROM fiveTickets """)
        fun getWeek(): Int
        @Query("SELECT first,second,third,fourth,fifth FROM fiveTickets")
        fun getFiveWinner(): List<Int>
        @Query("SELECT * FROM fiveTickets")
        fun getAllFiveTicket(): List<FiveTicketEntity>
        @Insert
        fun insertFiveTicket(vararg fiveTicket: FiveTicketEntity):Long
        @Delete
        fun deleteFiveTicket(fiveTicket: FiveTicketEntity)
    }
