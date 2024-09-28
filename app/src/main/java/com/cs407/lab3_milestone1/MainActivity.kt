package com.cs407.lab3_milestone1
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cs407.lab3_milestone1.R
import androidx.appcompat.app.AlertDialog
import android.widget.Toast
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.submitbutton)
        submitButton.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        AlertDialog.Builder(this)
            .setTitle("Information")
            .setMessage("This is a dialog")
            .setPositiveButton("Ok") {dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.item1 -> {
                Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item2 -> {
                Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item3 -> {
                Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subitem1 -> {
                Toast.makeText(this, "SubItem 1 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subitem2 -> {
               Toast.makeText(this, "SubItem 2 selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}