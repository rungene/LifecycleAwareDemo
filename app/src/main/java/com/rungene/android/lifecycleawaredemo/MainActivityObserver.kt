package com.rungene.android.lifecycleawaredemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent() {
        Log.i(TAG,"Observer On_CREATE")
    }
    companion object {
        private val TAG : String = MainActivityObserver::class.java.simpleName
    }
}