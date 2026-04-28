package com.uts_riri

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WisataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata)

        val btnKembali = findViewById<Button>(R.id.btnKembali)

        btnKembali.setOnClickListener {
            finish()
        }
    }
}
