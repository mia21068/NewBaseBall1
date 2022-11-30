package com.example.newbaseball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AC1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac1)
    }

    fun sendM2 (view: View){
        val intent= Intent(this,AC2::class.java).apply{

        }
        startActivity(intent)
    }

    fun sendM3 (view: View){
        val intent= Intent(this,AC3::class.java).apply{

        }
        startActivity(intent)
    }

    fun sendM4 (view: View){
        val intent= Intent(this,AC4::class.java).apply{

        }
        startActivity(intent)
    }

    fun sendM5 (view: View){
        val intent= Intent(this,AC5::class.java).apply{

        }
        startActivity(intent)
    }
}