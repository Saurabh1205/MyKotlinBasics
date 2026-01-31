package com.example.mykotlinbasics.jetpack_archi_compo.livedata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mykotlinbasics.R

class LiveDataActivity : AppCompatActivity() {
    lateinit var liveDataViewModel: LiveDataViewModel

    private val factsTextView: TextView
        get() = findViewById(R.id.factsTextView)
    private val btnUpdate: Button
        get() = findViewById(R.id.btnUpdate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_live_data)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        liveDataViewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)
        liveDataViewModel.factsLiveData.observe(this, Observer {
            factsTextView.text = it
        })
        btnUpdate.setOnClickListener {
            liveDataViewModel.updateLiveData()
        }
    }
}