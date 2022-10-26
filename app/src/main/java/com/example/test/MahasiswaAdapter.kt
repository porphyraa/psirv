package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(var mhs: MutableList<MahasiswaModel>) : RecyclerView.Adapter<MahasiswaAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mahasiswa, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<ImageView>(R.id.ivfoto).setImageResource(mhs[position].foto)
            findViewById<TextView>(R.id.tvvaluenama).text = mhs[position].nama
            findViewById<TextView>(R.id.tvvaluenim).text = mhs[position].nim
            findViewById<TextView>(R.id.tvvaluekelas).text = mhs[position].kelas
            findViewById<TextView>(R.id.tvvaluehobi).text = mhs[position].hobi
        }
    }

    override fun getItemCount(): Int {
        return mhs.size
    }
}