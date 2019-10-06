package example.com.byjusapp.presentation.news

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import example.com.byjusapp.domain.news.NewsInteractor

/**
 * Created by Akash on 2019-09-28.
 */
class NewsViewModel(application: Application, newsInteractor: NewsInteractor) :
    AndroidViewModel(application) {

}