package example.com.byjusapp.app.di.module.news

import dagger.Module
import dagger.Provides
import example.com.byjusapp.data.news.repository.NewsRepository
import example.com.byjusapp.domain.news.NewsInteractor
import example.com.byjusapp.presentation.news.NewsViewModelFactory

/**
 * Created by Akash on 2019-10-06.
 */

@Module
class NewsListModule() {

    @Provides
    fun provideNewsInteractor(newsRepository: NewsRepository): NewsInteractor {
        return NewsInteractor(newsRepository)
    }

    @Provides
    fun provideNewsListViewModelFactory(newsInteractor: NewsInteractor): NewsViewModelFactory {
        return NewsViewModelFactory(newsInteractor)
    }
}