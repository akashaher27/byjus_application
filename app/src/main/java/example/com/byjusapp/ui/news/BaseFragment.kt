package example.com.byjusapp.ui.news

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import example.com.byjusapp.app.MyApplication
import example.com.byjusapp.presentation.BaseViewModel

/**
 * Created by Akash on 2019-10-08.
 */
open class BaseFragment() : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}