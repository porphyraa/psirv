package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rvMahasiswa = findViewById<RecyclerView>(R.id.prak5recycleview)
        val viewModel = ViewModelProvider(this).get(MahasiswaViewModel::class.java)

        viewModel.mahasiswaListState.observe(this, Observer {
            rvMahasiswa.adapter = MahasiswaAdapter(viewModel.getMahasiswa().value!!)
            rvMahasiswa.layoutManager = LinearLayoutManager(this)
        })
    }

    override fun onClick(v: View?) {
        // not implemented yet
    }
}