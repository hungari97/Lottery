package hu.lottery.database.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import hu.lottery.database.entity.FiveTicketEntity

@Dao
interface FiveTicketDao {

        @Query("""SELECT week FROM fiveTickets """)
        fun getWeek(): Int
      /*  @Query("SELECT first,second,third,fourth,fifth FROM fiveTickets")
        fun getFiveWinner(): FiveTicketEntity*/
        @Query("SELECT * FROM fiveTickets")
        fun getAllFiveTicket(): List<FiveTicketEntity>
        @Insert(onConflict = IGNORE)
        fun insertFiveTicket(fiveTicket: FiveTicketEntity):Long?
        @Delete
        fun deleteFiveTicket(fiveTicket: FiveTicketEntity)
        @Update
        fun updateFiveTickets(vararg fiveTicket: FiveTicketEntity)

    }
