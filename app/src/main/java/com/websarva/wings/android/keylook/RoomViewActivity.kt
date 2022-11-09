package com.websarva.wings.android.keylook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.BulletSpan
import androidx.core.content.ContextCompat

class RoomViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_view)

//        val text = "aaa"
//        val spannableStringBuilder = SpannableStringBuilder("")
//        spannableStringBuilder.append(
//            text,
//            context?.let { ContextCompat.getColor(it, R.color.black) }?.let {
//                BulletSpan(20,it)
//            },
//            SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE
//        )
    }


}