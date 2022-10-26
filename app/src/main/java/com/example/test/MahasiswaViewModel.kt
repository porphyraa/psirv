package com.example.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MahasiswaViewModel : ViewModel() {
    private val listMahasiswa = MutableLiveData<MutableList<MahasiswaModel>>()
    val mahasiswaListState = MutableLiveData<Long>()

    init {
        listMahasiswa.value = mutableListOf<MahasiswaModel>()
        listMahasiswa.value!!.add(MahasiswaModel(R.drawable.foto_066,"???", "???", "E","ntahlah"))
        listMahasiswa.value!!.add(MahasiswaModel(R.drawable.foto_059,"Neo Hernando", "205150201111059", "E","Menggendong kawan :')"))
        listMahasiswa.value!!.add(MahasiswaModel(R.drawable.foto_xxx,"???", "???", "E","ntahlah (2)"))
        mahasiswaListState.value = 0L
    }

    fun getMahasiswa() = listMahasiswa

    fun addTodo(m: MahasiswaModel) {
        listMahasiswa.value!!.add(m)
        mahasiswaListState.value = System.currentTimeMillis()
    }
}
