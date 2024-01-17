package com.example.asd

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.asd.ui.theme.AsdTheme
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.net.Uri

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val callButton = findViewById<Button>(R.id.callButton)
        callButton.setOnClickListener {
            intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9085126134"))
            startActivity(intent)
        }

        val websiteButton = findViewById<Button>(R.id.websiteButton)
        websiteButton.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@DTransit?si=F18XgwwEDYP_dzly"))
            startActivity(intent)
        }

        val officeButton = findViewById<Button>(R.id.officeButton)
        officeButton.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/BEHqG1WB35Qkb5RQ7"))
            startActivity(intent)
        }
    }
}