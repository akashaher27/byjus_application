package example.com.byjusapp.app.di.module

import dagger.Module
import dagger.Provides
import example.com.byjusapp.app.NewsArticleDao
import example.com.byjusapp.app.database.AppDatabase
import example.com.byjusapp.data.news.repository.NewsRepository

/**
 * Created by Akash on 2019-09-29.
 */

@Module
class UserModule {

    @Provides
    fun provideNewsArticleDao(appDatabase: AppDatabase):NewsArticleDao{
        return appDatabase.newsArticleDao()
    }

    @Provides
    fun provideNewsRepository(newsArticleDao: NewsArticleDao):NewsRepository{
        return NewsRepository(newsArticleDao)
    }
}