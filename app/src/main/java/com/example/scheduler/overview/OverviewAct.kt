package com.example.scheduler.overview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.scheduler.R
import com.example.scheduler.base.DataManager


class OverviewAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Change color statusBar
        DataManager.getInstance()!!.getStatusBarColor(this, window, R.color.color_background_app)
        setContentView(R.layout.act_overview)
    }
}