package example.com.byjusapp.app.di.component

import dagger.Subcomponent
import example.com.byjusapp.app.di.module.UserModule

/**
 * Created by Akash on 2019-09-29.
 */
@Subcomponent(modules = [UserModule::class])
interface UserComponent {

}