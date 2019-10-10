package example.com.byjusapp.app.di.component

import dagger.Subcomponent
import example.com.byjusapp.app.di.module.UserModule
import example.com.byjusapp.app.di.module.news.NewsListModule
import example.com.byjusapp.ui.news.NewsListFragment

/**
 * Created by Akash on 2019-09-29.
 */
@Subcomponent(modules = [UserModule::class])
interface UserComponent {

    fun plus(newsListModule: NewsListModule): NewsListComponent

    //region SubComponent

    //region News
    @Subcomponent(modules = [NewsListModule::class])
    interface NewsListComponent {

        fun inject(newsListFragment: NewsListFragment)
    }

    //endregion

    //endregion
}