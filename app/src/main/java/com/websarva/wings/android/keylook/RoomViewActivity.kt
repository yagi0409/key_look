package com.websarva.wings.android.keylook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RoomViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btStart = findViewById<Button>(R.id.btStart)
        val listener = RoomListener()
        btStart.setOnClickListener(listener)
    }

    private inner class RoomListener: View.OnClickListener{
        override fun onClick(view: View) {


            when(view.id){
                R.id.btStart -> {
                    val intentRoomItem = Intent(this@RoomViewActivity, RoomItemActivity::class.java)
                    startActivity(intentRoomItem)
                }
            }
        }
    }


}