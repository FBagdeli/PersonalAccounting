package com.farshadchalenges.personalaccounting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.farshadchalenges.personalaccounting.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listViewBalances = binding.listViewHistory
        val cardViewHistory = binding.cardViewHistory

        cardViewHistory.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, BalanceHistory::class.java)
            startActivity(intent)
        })

        val transections = mutableListOf<String>(
            "far",
            "test"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transections)

        listViewBalances.adapter = adapter

        val butttonAdd = binding.buttonAdd

        butttonAdd.setOnClickListener(View.OnClickListener {
//            transections.add()
        })

    }
}