package example.com.byjusapp.app

import android.app.Application
import android.content.Context
import example.com.byjusapp.app.di.component.AppComponent
import example.com.byjusapp.app.di.component.DaggerAppComponent
import example.com.byjusapp.app.di.component.UserComponent
import example.com.byjusapp.app.di.module.AppModule
import example.com.byjusapp.app.di.module.UserModule

/**
 * Created by Akash on 2019-09-20.
 */
class MyApplication() : Application() {

    private lateinit var appComponent: AppComponent
    private lateinit var userComponent: UserComponent

    companion object {

        fun getInstance(context: Context): MyApplication {
            return context.applicationContext as MyApplication
        }
    }

    override fun onCreate() {
        super.onCreate()
        createAppComponent()
    }

    fun createAppComponent() {
        this.appComponent =
            DaggerAppComponent.builder().appModule(AppModule(this.applicationContext)).build()
    }

    fun getAppComponent(): AppComponent {
        return appComponent;
    }

    fun createUserComponent() {
        userComponent = appComponent.plus(UserModule())
    }

    fun getUserComponent(): UserComponent {
        return userComponent;
    }
}