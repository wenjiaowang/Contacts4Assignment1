package com.example.contacts4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerOptions: Spinner = findViewById(R.id.spinner1)
        val options = arrayOf("stay on this page","add contact")
        val textView: TextView = findViewById(R.id.textView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerOptions.adapter = adapter

        spinnerOptions.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                when (position) {
                    0 -> {
                        // Option 1: Stay on this page (do nothing)
                        Toast.makeText(this@MainActivity, "Staying on this page", Toast.LENGTH_SHORT).show()
                    }
                    1 -> {
                        // Option 2: Go to Subpage (Addcontact activity)
                        val intent = Intent(this@MainActivity, Addcontact::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
    }

    private fun navigateToActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}