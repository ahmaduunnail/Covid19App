package com.lleans.covid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHimbauan: Button =findViewById(R.id.btn_himbauan)
        val btnCuciTangan: Button=findViewById(R.id.btn_cuci_tangan)
        val btnMasker: Button=findViewById(R.id.btn_pakai_masker)
        val btnPola: Button=findViewById(R.id.btn_pola_hidup)

        btnHimbauan.setOnClickListener(this)
        btnCuciTangan.setOnClickListener(this)
        btnMasker.setOnClickListener(this)
        btnPola.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when (v.id){
            R.id.btn_himbauan -> {
                val move=Intent(this@MainActivity, HimbuanActivity::class.java)
                startActivity(move)
            }
            R.id.btn_cuci_tangan -> {
                val move=Intent(this@MainActivity, CuciTanganActivity::class.java)
                startActivity(move)
            }
            R.id.btn_pakai_masker -> {
                val move=Intent(this@MainActivity, WearMaskActivity::class.java)
                startActivity(move)
            }
            R.id.btn_pola_hidup -> {
                val move=Intent(this@MainActivity, PolaHidupSehatActivity::class.java)
                startActivity(move)
            }
        }
    }
}