package example.com.byjusapp.presentation

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Akash on 2019-10-07.
 */
open class BaseViewModel() : ViewModel(), LifecycleObserver {

    lateinit var cDisposable: CompositeDisposable

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateView() {

        cDisposable = CompositeDisposable()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyedView() {
        cDisposable.dispose()
    }

}