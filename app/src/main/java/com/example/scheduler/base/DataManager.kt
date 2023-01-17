package com.example.scheduler.base

import android.content.Context
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.scheduler.R

class DataManager private constructor(){
    companion object{
        private var instance: DataManager? = null
        fun getInstance() = synchronized(this){
            if(instance == null)
                instance = DataManager()
            instance
        }
    }

    fun getStatusBarColor(context: Context, window: Window, color: Int){
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(context, color)
    }


}
