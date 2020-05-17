package hu.lottery.database.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import hu.lottery.database.entity.SixTicketEntity

interface SixTicketDao {

    @Query("""SELECT week FROM sixTickets """)
    fun getWeek(): Int
    @Query("SELECT first,second,third,fourth,fifth FROM sixTickets")
    fun getSixWinner(): List<Int>
    @Query("SELECT * FROM sixTickets")
    fun getAllSixTicket(): List<SixTicketEntity>
    @Insert
    fun insertSixTicket(vararg sixTicket: SixTicketEntity)
    @Delete
    fun deleteSixTicket(sixTicket: SixTicketEntity)
    
}