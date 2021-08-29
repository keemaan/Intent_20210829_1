package com.neppplus.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        // Intent를 이용, 메인으로 이동
        returnToMainBtn.setOnClickListener {
            val myIntent = Intent( this, MainActivity::class.java)
            startActivity( myIntent )

        }
    }
}