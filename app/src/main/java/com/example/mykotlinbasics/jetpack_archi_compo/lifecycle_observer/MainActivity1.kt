package com.example.mykotlinbasics.jetpack_archi_compo.lifecycle_observer

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.mykotlinbasics.R
import com.example.mykotlinbasics.jetpack_archi_compo.MainViewModel
import com.example.mykotlinbasics.jetpack_archi_compo.Observer

class MainActivity1 : AppCompatActivity() {
    lateinit var textCount : TextView
    lateinit var buttonIncrement : Button
   lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.e("Activity", "onCreate")
        //LifecycleObserver
        lifecycle.addObserver(Observer())

        //ViewModel
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    fun setTextView() {
        textCount.text = mainViewModel.count.toString()
    }



    override fun onStart() {
        super.onStart()
        Log.e("Activity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity", "onDestroy")
    }

    fun btnClick(view: View) {
        setTextView()
    }


}