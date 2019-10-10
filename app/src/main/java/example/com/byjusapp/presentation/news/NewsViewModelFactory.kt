package example.com.byjusapp.presentation.news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import example.com.byjusapp.domain.news.NewsInteractor

/**
 * Created by Akash on 2019-10-07.
 */
class NewsViewModelFactory(val newsInteractor: NewsInteractor) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(NewsListViewModel::class.java!!)) {
            NewsListViewModel(newsInteractor) as T
        } else {
            throw Throwable("ViewModel Not Found")
        }
    }
}