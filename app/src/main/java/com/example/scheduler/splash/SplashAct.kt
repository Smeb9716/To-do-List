package com.example.scheduler.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.scheduler.MainAct
import com.example.scheduler.R
import com.example.scheduler.base.PreferManager
import com.example.scheduler.overview.OverviewAct

class SplashAct : AppCompatActivity() {
    private val checkMainOrOverview: String = "checkMainOrOverview"
    private val delayTime: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_splash)

        val preferManager = PreferManager.getInstance(this)

        Handler().postDelayed({
            // start activity
            if(applicationContext.packageName.trim() == "com.example.scheduler"){
                if(!preferManager!!.readBoolean(checkMainOrOverview,false)){
                    preferManager.write(checkMainOrOverview, true)
                    startActivity(Intent(this, OverviewAct::class.java))
                    finish()
                }else{
                    startActivity(Intent(this, MainAct::class.java))
                    finish()
                }
            }
        }, delayTime)
    }
}