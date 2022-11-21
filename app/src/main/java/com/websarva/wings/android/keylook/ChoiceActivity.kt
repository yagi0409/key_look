package com.websarva.wings.android.keylook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
    }
    public override fun onStart() {
        Log.i("keylook", "Main onStart() called.")
        super.onStart()
    }
    public override fun onRestart() {
        Log.i("keylook", "Main onRestart() called.")
        super.onRestart()
    }
    public override fun onResume() {
        Log.i("keylook", "Main onResume() called.")
        super.onResume()
    }

    public override fun onPause() {
        Log.i("keylook", "Main onPause() called.")
        super.onPause()
    }

    public override fun onStop() {
        Log.i("keylook", "Main onStop() called.")
        super.onStop()
    }

    public override fun onDestroy() {
        Log.i("keylook", "Main onDestory() called.")
        super.onDestroy()
    }
    fun onButtonClickRoom1(view: View) {
        // インテントオブジェクトを用意。
        val intent = Intent(this@ChoiceActivity,KidsRoomActivity::class.java)
        // アクティビティを起動。
        startActivity(intent)
    }
    fun onButtonClickRoom2(view: View) {
        // インテントオブジェクトを用意。
        val intent = Intent(this@ChoiceActivity,RoomViewActivity::class.java)
        // アクティビティを起動。
        startActivity(intent)
    }
    fun onButtonClickHome(view: View) {
        // インテントオブジェクトを用意。
        val intent = Intent(this@ChoiceActivity,MainActivity::class.java)
        // アクティビティを起動。
        startActivity(intent)
    }
}