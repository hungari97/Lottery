package hu.lottery.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query
import hu.lottery.database.entity.SixTicketEntity

@Dao
interface SixTicketDao {

    @Query("""SELECT week FROM sixTickets WHERE id=:id """)
    fun getWeek(id:Long): Int
    /*@Query("SELECT first,second,third,fourth,fifth FROM sixTickets")
    fun getSixWinner():SixTicketEntity */
    @Query("SELECT * FROM sixTickets")
    fun getAllSixTicket(): List<SixTicketEntity>
    @Insert(onConflict = IGNORE)
    fun insertSixTicket(sixTicket: SixTicketEntity):Long?
    @Delete
    fun deleteSixTicket(sixTicket: SixTicketEntity)
    
}