package com.example.popupmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencing and Initializing the button
        button = findViewById(R.id.clickBtn)

        // Setting onClick behavior to the button
        button.setOnClickListener {
            // Initializing the popup menu and giving the reference as current context
            val popupMenu = PopupMenu(this@MainActivity,button)

            //inflating popup menu
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                Toast.makeText(this@MainActivity,"You clicked ",Toast.LENGTH_LONG).show()
                true
            }

            popupMenu.show()
        }
    }
}