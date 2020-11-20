package com.reynn.novels

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPref: SharedPref
    lateinit var novelDao: NovelDao
    lateinit var adapter: NovelAdapter

    companion object {
        const val REQUEST_ADD = 100
        const val REQUEST_EDIT = 200
        const val REQUEST_REMOVE = 300
        const val REQUEST_DETAIL = 500
        const val KEY_NOVEL = "novel"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        novelDao = AppDatabase.getInstance(this).novelDao()
        sharedPref= SharedPref(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = NovelAdapter(novelDao.selectAll(),sharedPref)
        recyclerView.adapter = adapter

        adapter.onItemClickListener = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(KEY_NOVEL, it)
            startActivityForResult(intent, REQUEST_DETAIL)
        }

        buttonAdd.setOnClickListener {
            val intent = Intent(this, AddEditActivity::class.java)
            startActivityForResult(intent, REQUEST_ADD)
        }
    }

    override fun onResume() {
        super.onResume()
        recyclerView.layoutManager = if (sharedPref.gridLayout && sharedPref.column > 0) {
            GridLayoutManager(this, sharedPref.column)
        } else {
            LinearLayoutManager(this)
        }

        supportActionBar?.title = sharedPref.appName
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_ADD && resultCode == Activity.RESULT_OK && data != null) {
            //todo: Tambah Data
            val novel = data.getParcelableExtra<Novel>(KEY_NOVEL)
            novel?.apply {
                novelDao.insert(this)
            }
            Toast.makeText(this, "Data berhasil ditambahkan", Toast.LENGTH_SHORT).show()
        }

        adapter.list = novelDao.selectAll()
        adapter.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menuSettings -> startActivity(Intent(this, settingsActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}