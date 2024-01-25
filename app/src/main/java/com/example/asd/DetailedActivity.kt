package com.example.asd
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.asd.databinding.ActivityDetailedBinding
class DetailedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide()
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val date = intent.getStringExtra("date")
            val company = intent.getIntExtra("company", R.string.maggiIngredients)
            val length = intent.getIntExtra("length", R.string.maggieDesc)
            val image = intent.getIntExtra("image", R.drawable.pasta)
            binding.detailName.text = name
            binding.detailDate.text = date
            binding.detailCompany.setText(company)
            binding.detailLength.setText(length)
            binding.detailImage.setImageResource(image)
        }

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            val intent1 = Intent(this, ProjectActivity::class.java)
            startActivity(intent1)
        }
    }
}
