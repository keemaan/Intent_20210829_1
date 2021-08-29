package com.neppplus.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {
//      다른 화면으로 이동하기가 눌리면?

//      어디서 어느화면으로 이동할 것인지 정보(Intent) 명시. ==> 변수에 담아 저장
            val myIntent = Intent( this, OtherActivity::class.java)
//      실제로 이동시킴
            startActivity( myIntent )

        }

        sendMessageBtn.setOnClickListener {
//      메세지 보내기가 눌리면?
//      입력한 내용이 어떻게 되는지 변수에 저장
            val inputContent = messageEdt.text.toString()
//       메세지 조회화면으로 (입력한 내용을 가지고) 이동
            val myIntent = Intent(this, ViewMessageActivity::class.java)
            startActivity(myIntent)

        }
    }
}