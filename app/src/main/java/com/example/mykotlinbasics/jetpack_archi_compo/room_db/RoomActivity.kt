package com.example.mykotlinbasics.jetpack_archi_compo.room_db

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import com.example.mykotlinbasics.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RoomActivity : AppCompatActivity() {
    lateinit var database: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_room)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        database = ContactDatabase.getDatabase(this)
        var database2 = ContactDatabase.getDatabase(this)

        GlobalScope.launch{
            database.contactDao().insertContact(Contact(0, "John", "9999999999"))
        }
    }

    fun getContact(view: View) {
        database.contactDao().getContact().observe(this,{
            Log.e("Contact Table Data",it.toString())
        })
    }
}