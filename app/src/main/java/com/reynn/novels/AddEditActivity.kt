package com.reynn.novels

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_edit.*

class AddEditActivity : AppCompatActivity() {

    var novel: Novel? = null

    companion object {
        const val REQUEST_IMAGE = 400
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit)
        novel = intent.getParcelableExtra(MainActivity.KEY_NOVEL)
        supportActionBar?.apply {
            title = if (novel == null) "Add Novel" else "Edit Novel"
            novel?.apply {
                subtitle = nama
            }
//            if (novel == null) {
//                subtitle = novel?.nama
//            }
            setDisplayHomeAsUpEnabled(true)
        }

        novel?.apply {
            addEditNama.setText(nama)
            addEditPenulis.setText(penulis)
            addEditKeterangan.setText(keterangan)
            addEditRating.setText(rating.toString())
            addEditGambar.setText(gambar)
        }
        buttonBrowse.setOnClickListener {
            val intent = Intent()
            intent.setType("image/*")
            intent.setAction(Intent.ACTION_GET_CONTENT)
            startActivityForResult(Intent.createChooser(intent, "Pilih gambar"), REQUEST_IMAGE)
        }
        buttonSave.setOnClickListener {
            if (novel == null) novel = Novel()
            novel?.apply {
                nama = addEditNama.text.toString()
                penulis = addEditPenulis.text.toString()
                keterangan = addEditKeterangan.text.toString()
                gambar = addEditGambar.text.toString()
                val d: String = addEditRating.text.toString()
                rating = d.toDouble()
            }

            val intent = Intent()
            intent.putExtra(MainActivity.KEY_NOVEL, novel)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            val imageUrl = data.data?.toString()
            addEditGambar.setText(imageUrl)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
