package example.com.byjusapp.domain.news

import example.com.byjusapp.data.news.model.Article
import example.com.byjusapp.data.news.repository.NewsRepository

/**
 * Created by Akash on 2019-09-28.
 */
class NewsInteractor(newsRepository: NewsRepository) {

    fun getArticlesFromLocal(): List<Article>? {
        return null;
    }

}