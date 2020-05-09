package hu.lottery.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sixTickets")
data class SixTicketEntity(
    @PrimaryKey(autoGenerate = true) var Id: Long?,
    @ColumnInfo(name = "first") var first: Int,
    @ColumnInfo(name = "second") var second: Int,
    @ColumnInfo(name = "third") var third: Int,
    @ColumnInfo(name = "fourth") var fourth: Int,
    @ColumnInfo(name = "fifth") var fifth: Int,
    @ColumnInfo(name = "sixth") var sixth: Int,
    @ColumnInfo(name = "week") var week: Int
)