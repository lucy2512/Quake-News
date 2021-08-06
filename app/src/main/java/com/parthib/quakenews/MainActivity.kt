package com.parthib.quakenews


import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val earthquakes: ArrayList<String> = ArrayList()
        earthquakes.add("San Francisco")
        earthquakes.add("London")
        earthquakes.add("Tokyo")
        earthquakes.add("Mexico City")
        earthquakes.add("Moscow")
        earthquakes.add("Rio de Janeiro")
        earthquakes.add("Paris")

        // Find a reference to the {@link ListView} in the layout
        val earthquakeListView: ListView = findViewById<View>(R.id.list) as ListView

        // Create a new {@link ArrayAdapter} of earthquakes
        val adapter = ArrayAdapter(
               this,android.R.layout.simple_list_item_1,earthquakes)

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter)
    }
}