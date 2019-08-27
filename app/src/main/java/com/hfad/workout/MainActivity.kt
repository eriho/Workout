package com.hfad.workout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onShowDetails(view : View){

        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)

    }
}
