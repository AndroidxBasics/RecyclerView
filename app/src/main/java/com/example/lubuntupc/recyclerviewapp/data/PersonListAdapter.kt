package com.example.lubuntupc.recyclerviewapp.data

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lubuntupc.recyclerviewapp.R

import com.example.lubuntupc.recyclerviewapp.model.Person

/**
 * Created by lubuntupc on 18.11.17.
 */
class PersonListAdapter(private val list: ArrayList<Person>,
                        private val context: Context) : RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, position: Int): ViewHolder {
        // Create view from xml file
        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindItem(list[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(person: Person) {
            var name: TextView = itemView.findViewById<TextView>(R.id.age)
            var age: TextView = itemView.findViewById<TextView>(R.id.age)

            name.text = person.name
            age.text = person.age.toString()
        }
    }

}