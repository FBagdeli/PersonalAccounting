package com.farshadchalenges.personalaccounting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.farshadchalenges.personalaccounting.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var historyList = binding.listViewHistory
        var textViewBalance = binding.textViewCurrentBalance


        val items = mutableListOf<Any>(1,2,3,4,5)


        var butttonAdd = binding.buttonAdd

    }
}