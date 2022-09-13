package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.nfc.Tag
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val Tag = "Mainactivity"
    private lateinit var mylayout: ConstraintLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mylayout = findViewById(R.id.mylayout)
        Log.i(Tag, "onCreate function called:")
        Toast.makeText(this, "onCreate function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.mylayout), "OnCreate function called",Snackbar.LENGTH_LONG).show()

    }
    private fun showmassage(msg: String) {
        Log.i(Tag, msg)
        Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).show()


    }

    override fun onStart() {
        super.onStart()
        showmassage("start function called")
        Snackbar.make(findViewById(R.id.mylayout),"onStart function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        showmassage("onRusume function called")
        Snackbar.make(findViewById(R.id.mylayout),"onResume function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        showmassage("onPause function called")
        Snackbar.make(findViewById(R.id.mylayout),"onPause function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        showmassage("onStop function called")
        Snackbar.make(findViewById(R.id.mylayout),"onStop function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        showmassage("onDestory function called")
        Snackbar.make(findViewById(R.id.mylayout),"onDestroy function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        showmassage("onRestart function called")
        Snackbar.make(findViewById(R.id.mylayout),"onRestartfunction called",Snackbar.LENGTH_LONG).show()
    }
}