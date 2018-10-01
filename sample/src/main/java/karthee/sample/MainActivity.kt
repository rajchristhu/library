package karthee.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.arivista.drag__drop.custom_view.CustomView
import com.example.arivista.drag__drop.custom_view.Optionmodel

import java.util.*

class MainActivity : AppCompatActivity() {
    val data = ArrayList<Optionmodel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val customView = findViewById<CustomView>(R.id.customView)
        val submit = findViewById<Button>(R.id.submit)
        val reset = findViewById<Button>(R.id.reset)
        val reveal  = findViewById<Button>(R.id.reveal )
        customView.setImage(R.drawable.demoimage)
        data.add(Optionmodel("14th Jan", 900, 300, 320, 80))
        data.add(Optionmodel("15th Aug", 900, 100, 320, 80))
        data.add(Optionmodel("25th Dec", 900, 500, 320, 80))
        data.add(Optionmodel("12 May", 900, 1100, 320, 80))
        data.add(Optionmodel("14th Feb", 900, 700, 320, 80))
        data.add(Optionmodel("4 Aug", 900, 900, 320, 80))
        customView.setInput(data)
        submit.setOnClickListener {
            customView.submit()
            reveal .isEnabled = true
            reset.isEnabled = true

        }
        reset.setOnClickListener {
            customView.reset()
        }
        reveal .setOnClickListener {
            customView.reveal()
        }
    }
}


