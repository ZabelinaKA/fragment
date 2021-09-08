package com.example.myactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

//class second : AppCompatActivity() {

  //  override fun onCreate(savedInstanceState: Bundle?) {
    //    super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_second)
        //val list = intent?.getStringExtra("Привет!")
       // val hl = findViewById<TextView>(R.id.heelloo)
       // hl.text = list
    //}
//}

class second : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_main, container, false)
        val mainText = view.findViewById<TextView>(R.id.mainText)
        mainText.text = "TEST"
        return view
    }

}
