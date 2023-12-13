package com.example.asd

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.asd.databinding.ActivityMainBinding
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resButton = findViewById<Button>(R.id.resumeButton)
        resButton.setOnClickListener {
            intent = Intent(this, ResumeActivity::class.java)
            startActivity(intent)
        }

        val conButton = findViewById<Button>(R.id.contactButton)
        conButton.setOnClickListener {
            intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        val projButton = findViewById<Button>(R.id.projectButton)
        projButton.setOnClickListener {
            intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }
    }
}