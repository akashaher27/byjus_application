package example.com.byjusapp.app.di.component

import dagger.Component
import example.com.byjusapp.app.di.module.AppModule
import example.com.byjusapp.app.di.module.UserModule

/**
 * Created by Akash on 2019-09-29.
 * Top level Component
 */

@Component(modules = [AppModule::class])
interface AppComponent {

    fun plus(userModule: UserModule): UserComponent
}