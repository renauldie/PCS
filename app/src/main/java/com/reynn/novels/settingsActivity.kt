package com.reynn.novels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_settings.*

class settingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        supportActionBar?.apply {
            title = "Settings"
            setDisplayHomeAsUpEnabled(true)
        }

        val sharedPref = SharedPref(this)

        settingGrid.isChecked = sharedPref.gridLayout
        settingGrid.setOnCheckedChangeListener { buttonView, isChecked ->
            sharedPref.gridLayout= isChecked
        }

        settingPengarang.isChecked=sharedPref.writter
        settingPengarang.setOnCheckedChangeListener { buttonView, isChecked ->
            sharedPref.writter = isChecked
        }

        settingAppName.setText(sharedPref.appName)
        settingAppName.addTextChangedListener {
            sharedPref.appName = it.toString()
        }

        settingsColumn.setText(sharedPref.column.toString())
        settingsColumn.addTextChangedListener {
            var cols = if (it.toString().length == 0) 1 else it.toString().toInt()
            cols = if (cols > 2) {
                2
            } else if (cols < 1) {
                1
            } else {
                cols
            }
            sharedPref.column = cols
        }

        settingItem.isChecked = sharedPref.item
        settingItem.setOnCheckedChangeListener { buttonView, isChecked ->
            sharedPref.item = isChecked
        }

        settingTheme.isChecked = sharedPref.item
        settingTheme.setOnCheckedChangeListener { buttonView, isChecked ->
            sharedPref.item = isChecked
        }

        settingsJumlahKontent.setText(sharedPref.content.toString())
        settingsJumlahKontent.addTextChangedListener {
            var row = if (it.toString().length == 0) 1 else it.toString().toInt()
            row = if (row > 2) {
                2
            } else if (row < 1) {
                1
            } else {
                row
            }
            sharedPref.content = row
        }



    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}