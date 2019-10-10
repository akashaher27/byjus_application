package example.com.byjusapp.presentation.news

import example.com.byjusapp.app.database.news.ArticleEntity
import example.com.byjusapp.domain.news.NewsInteractor
import example.com.byjusapp.presentation.BaseViewModel
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 * Created by Akash on 2019-09-28.
 */
class NewsListViewModel(private val newsInteractor: NewsInteractor) : BaseViewModel() {

    private lateinit var mDisposable: Disposable


    fun getBitCoinArticle() {
        mDisposable = newsInteractor.getBitCoinArticlesFromLocalStorage()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ getBitCoinArticleSuccess(it) }, { getBitCoinArticleFailure(it) })
        cDisposable.add(mDisposable)
    }

    private fun getBitCoinArticleSuccess(articleEntityList: List<ArticleEntity>) {
        if (articleEntityList != null) {

        }
    }

    private fun getBitCoinArticleFailure(throwable: Throwable) {
        if (throwable != null) {

        }
    }

}