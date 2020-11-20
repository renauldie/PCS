package com.reynn.novels

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    lateinit var novelDao: NovelDao
    var novel: Novel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        novelDao = AppDatabase.getInstance(this).novelDao()
        novel = intent.getParcelableExtra<Novel>(MainActivity.KEY_NOVEL)
        populate(novel)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }
    }

    fun populate(novel: Novel?) {
        novel?.apply {
            Glide.with(this@DetailActivity).load(gambar).into(detailImage)
            detailName.text = nama
            detailPenulis.text = penulis
            detailKeterangan.text = keterangan
            itemRating.text = "Rating: ${rating.toString()}"
        }
        supportActionBar?.apply {
            title = novel?.nama
            subtitle = novel?.penulis
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuEdit -> {
                val intent = Intent(this, AddEditActivity::class.java)
                intent.putExtra(MainActivity.KEY_NOVEL, novel)
                startActivityForResult(intent, MainActivity.REQUEST_EDIT)
            }
            R.id.menuRemove -> {
                AlertDialog.Builder(this)
                    .setMessage("Apakah anada ingin menghapus item ini?")
                    .setPositiveButton("Ya") { _, _ ->
                        novel?.apply {
                            novelDao.delete(this)
                        }
                        Toast.makeText(this, "Data berhasil diapus", Toast.LENGTH_SHORT).show()
                        finish()
                    }
                    .setNegativeButton("Tidak", null)
                    .show()
            }
            else -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == MainActivity.REQUEST_EDIT && resultCode == Activity.RESULT_OK && data != null) {
            novel = data.getParcelableExtra(MainActivity.KEY_NOVEL)
            populate(novel)
            novel?.apply {
                novelDao.update(this)
            }
            Toast.makeText(this, "Data berhasil diedit", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}