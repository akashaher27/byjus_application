package example.com.byjusapp.app.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import example.com.byjusapp.app.common.SingletonHolder

/**
 * Created by Akash on 2019-09-22.
 *
 * Local storage (Room)
 */

@Database(entities = arrayOf(), version = 1)
abstract class AppDatabase() : RoomDatabase() {

    companion object : SingletonHolder<AppDatabase, Context>({
        Room.databaseBuilder(it, AppDatabase::class.java, "AppDataBase").build()
    }){}
}