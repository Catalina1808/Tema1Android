package com.example.homework1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.`interface`.ActivityFragmentComunication
import kotlinx.android.synthetic.main.f1a1.*

class Activity1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        Log.e(Activity1::class.java.name, "onCreate")

        button_first.setOnClickListener{
            goToSecondActivity()
            finish()
        }


    }

    override fun onStart() {
        super.onStart()
        Log.e(Activity1::class.java.name, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(Activity1::class.java.name, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e(Activity1::class.java.name, "onResume")

    }

    override fun onStop() {
        super.onStop()
        Log.e(Activity1::class.java.name, "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(Activity1::class.java.name, "onDestroy")

    }

    fun goToSecondActivity(){
        val intent: Intent = Intent(this,Activity2::class.java)
        startActivity(intent)


    }

}
