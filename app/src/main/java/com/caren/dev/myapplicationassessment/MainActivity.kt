package com.caren.dev.myapplicationassessment

import BlogsAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.caren.dev.myprojectuserblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtText.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        displayArticles()
    }
    fun displayArticles(){
        val expense1 = Expense("10-8-2020","Megan Trainor","Mistress","pic","See More")
        val expense2 = Expense("22-9-2020","Melan Trainor","Mistress","pic","See More")
        val expense3= Expense("12-10-2020","Mejan Trainor","Mistress","pic","See More")
        val expense4 = Expense("2-11-2020","Mefan Trainor","Mistress","pic","See More")
        val expense5 = Expense("11-12-2020","Medan Trainor","Mistress","pic","See More")

        val blogList = listOf(expense1,expense2,expense3,expense4,expense5)
        val blogAdapter = ExpenseAdapter(blogList)
        binding.txtText.adapter =blogAdapter

    }


}