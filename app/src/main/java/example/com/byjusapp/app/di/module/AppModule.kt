package example.com.byjusapp.app.di.module

import android.app.Application
import android.content.Context
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import example.com.byjusapp.app.MyApplication
import example.com.byjusapp.app.database.AppDatabase

/**
 * Created by Akash on 2019-09-29.
 * Top level module class for App Component.
 */

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideRoomInstance(): AppDatabase {
        return AppDatabase.getInstance(context.applicationContext)
    }
}