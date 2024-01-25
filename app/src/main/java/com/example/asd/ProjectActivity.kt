package com.example.asd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import android.widget.ListView
import com.example.asd.databinding.ActivityMainBinding

class ProjectActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)
        binding = ActivityMainBinding.inflate(layoutInflater)


        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val imageList = intArrayOf(
            R.drawable.pasta,
            R.drawable.maggi,
            R.drawable.cake,
            R.drawable.pancake,
            R.drawable.pizza,
        )
        val companyList = intArrayOf(
            R.string.pastaIngredients,
            R.string.maggiIngredients,
            R.string.cakeIngredients,
            R.string.pancakeIngredients,
            R.string.pizzaIngredients,
        )
        val lengthList = intArrayOf(
            R.string.pastaDesc,
            R.string.maggieDesc,
            R.string.cakeDesc,
            R.string.pancakeDesc,
            R.string.pizzaDesc,
        )
        val nameList = arrayOf("Ceramic Technician Exploration in the Hudson River", "Developing the Most Efficient Ceramic Technician Process", "Efficient Nutrition Relocater Scheduling", "cleanX", "Not Just Porcelain")
        val dateList = arrayOf("Jun 2008 - May 2012", "Jul 2014 - Sept 2015", "Jul 1998 - Aug 2004", "Sept 2018 - Jul 2019", "Dec 2012 - May 2013")
        for (i in imageList.indices) {
            listData = ListData(
                nameList[i],
                dateList[i], companyList[i], lengthList[i], imageList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(this@ProjectActivity, dataArrayList)

        val listview = findViewById<ListView>(R.id.listview)

        listview.adapter = listAdapter
        listview.isClickable = true
        listview.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@ProjectActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("date", dateList[i])
            intent.putExtra("company", companyList[i])
            intent.putExtra("length", lengthList[i])
            intent.putExtra("image", imageList[i])
            startActivity(intent)
        }

    }
}