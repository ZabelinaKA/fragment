package com.example.myactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, second())
            .commit()
    }




companion object {
        fun newInstance(id: Int): second {
            val args = Bundle()
            args.putInt("openWithId", id)
            val fragment = second()
            fragment.arguments = args
            return fragment
        }
    }
    interface secondClickListener {
        fun onClick()
    }

}
 //   override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
  //      setContentView(R.layout.activity_main)
  //          val value = "Привет!"
//            val list = Intent(this, second::class.java).apply {
 //               putExtra("Привет!", value)
    //    }
  ///      startActivity(list)
  //      }


