package example.com.byjusapp.ui.news

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import example.com.byjusapp.R
import example.com.byjusapp.app.MyApplication
import example.com.byjusapp.app.di.module.news.NewsListModule
import example.com.byjusapp.presentation.news.NewsListViewModel
import example.com.byjusapp.presentation.news.NewsViewModelFactory
import example.com.byjusapp.ui.HomeFragment
import javax.inject.Inject

/**
 * Created by Akash on 2019-09-22.
 */
class NewsListFragment() : HomeFragment() {

    @Inject
    lateinit var newsViewModelFactory: NewsViewModelFactory

    private lateinit var viewModel: NewsListViewModel


    //region Fragment Lifecycle
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.getInstance(this.requireContext()).getUserComponent().plus(NewsListModule())
            .inject(this)
        viewModel =
            ViewModelProviders.of(this, newsViewModelFactory).get(NewsListViewModel::class.java)
        lifecycle.addObserver(viewModel)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var view = inflater.inflate(R.layout.fragment_news_list, container, false)
        return view;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getBitCoinArticle()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycle.removeObserver(viewModel)
    }
    //endregion

}