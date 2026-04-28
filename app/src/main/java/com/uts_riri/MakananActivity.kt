package com.uts_riri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MakananActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        val btnWisata = findViewById<Button>(R.id.btnWisata)

        btnWisata.setOnClickListener {
            startActivity(Intent(this, WisataActivity::class.java))
        }
    }
}
