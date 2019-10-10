package example.com.byjusapp.domain.news

import example.com.byjusapp.app.database.news.ArticleEntity
import example.com.byjusapp.data.news.model.Article
import example.com.byjusapp.data.news.repository.NewsRepository
import io.reactivex.Single

/**
 * Created by Akash on 2019-09-28.
 */
class NewsInteractor(private val newsRepository: NewsRepository) {


    fun getBitCoinArticlesFromLocalStorage(): Single<List<ArticleEntity>> {
        return newsRepository.getBitCoinArticlesFromLocalStorage()


    }

}