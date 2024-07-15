package com.example.contacts4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Addcontact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_contact)

        // Find the EditText fields by their IDs
        val editTextName: EditText = findViewById(R.id.editTextName)
        val editTextNumber: EditText = findViewById(R.id.editTextNumber)



        val buttonBackToMain: Button = findViewById(R.id.mainButton)
        buttonBackToMain.setOnClickListener {
            onBackPressed()
        }
    }

}