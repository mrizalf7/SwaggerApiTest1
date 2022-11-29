package com.example.btsidapitestrizalf.ui

import android.content.Context
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import com.example.btsidapitestrizalf.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ApiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api)

    }
}
