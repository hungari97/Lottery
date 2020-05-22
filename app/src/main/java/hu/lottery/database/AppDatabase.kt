package hu.lottery.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import hu.lottery.database.dao.FiveTicketDao
import hu.lottery.database.dao.SixTicketDao
import hu.lottery.database.entity.FiveTicketEntity
import hu.lottery.database.entity.SixTicketEntity

@Database(entities = [FiveTicketEntity::class, SixTicketEntity::class], version = 3)
abstract class AppDatabase: RoomDatabase() {
    abstract fun fiveTicketDao(): FiveTicketDao
    abstract fun sixTicketDao(): SixTicketDao
    companion object {
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                    AppDatabase::class.java, "lottery.db").build()
            }
            return INSTANCE!!
        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}