package example.com.byjusapp.data.news.model

/**
 * Created by Akash on 2019-09-22.
 */
data class Article(
    val source: Source, val author: String = "", val title: String = "",
    val description: String = "", val url: String = "", val urlToImage: String = "",
    val publishedAt: String = "", val content: String = ""
) {}