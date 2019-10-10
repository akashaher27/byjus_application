package example.com.byjusapp.data.news.repository

import example.com.byjusapp.app.NewsArticleDao
import example.com.byjusapp.app.database.AppDatabase
import example.com.byjusapp.app.database.news.ArticleEntity
import example.com.byjusapp.data.news.model.Article
import example.com.byjusapp.data.news.model.News
import io.reactivex.Single

/**
 * Created by Akash on 2019-09-22.
 *
 * News Repository will fetch data from local database(room)
 */


class NewsRepository(val newsArticleDao: NewsArticleDao) {


    fun getBitCoinArticlesFromLocalStorage(): Single<List<ArticleEntity>>{
        return newsArticleDao.getBitCoinArticles()
    }
}