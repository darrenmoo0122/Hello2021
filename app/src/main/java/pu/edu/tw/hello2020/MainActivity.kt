package pu.edu.tw.hello2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello Darren"
        //TestDEV()
        //TestMaster()
        txv.setText("嗨，我是巫萬升");

    }
}
