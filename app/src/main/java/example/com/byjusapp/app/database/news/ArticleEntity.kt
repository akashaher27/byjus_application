package example.com.byjusapp.app.database.news

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import example.com.byjusapp.data.news.model.Article
import example.com.byjusapp.data.news.model.Source

/**
 * Created by Akash on 2019-09-22.
 * This Entity class for Articles.
 */

@Entity
data class ArticleEntity(
    @PrimaryKey
    val uid: Int,
    @Embedded
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
) {
}