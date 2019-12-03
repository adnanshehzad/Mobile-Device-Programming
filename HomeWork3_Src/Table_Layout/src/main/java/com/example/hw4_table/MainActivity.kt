package com.example.hw4_table

import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addTableRow(view: View) {

        //Creating a table Dynamically : Adnan CheckIn
        val tableRow = TableRow(getApplicationContext())
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)

        tableRow.setLayoutParams(layoutParams)
        val textview0 = TextView(this)
        val textview1 = TextView(this)
        textview0.text = et_Name.text
        textview1.text = et_version.text
        tableRow.addView(textview0,0)
        tableRow.addView(textview1,1)

// Finally add the created row row into layout
        androidT.addView(tableRow) // id from Layout_file
    }


}
