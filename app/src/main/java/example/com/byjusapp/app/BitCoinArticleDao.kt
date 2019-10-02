package example.com.byjusapp.app

import androidx.room.Dao
import androidx.room.Query
import example.com.byjusapp.app.database.news.ArticleEntity

/**
 * Created by Akash on 2019-09-28.
 * Data access object (DAO) get data from local Database.
 */

@Dao
interface BitCoinArticleDao {

    @Query("SELECT * FROM ArticleEntity")
    fun getArticlesFromLocal(): List<ArticleEntity>
}