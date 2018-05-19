package com.example.lubuntupc.recyclerviewapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.lubuntupc.recyclerviewapp.data.PersonListAdapter
import com.example.lubuntupc.recyclerviewapp.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter: PersonListAdapter? = null
    private var personList: ArrayList<Person>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personList = ArrayList<Person>()
        layoutManager = LinearLayoutManager(this)
        adapter = PersonListAdapter(personList!!, this)


        //setup list
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


        //load data
        for (i in 0..16) {
            val person = Person()
            person.name = "Luke" + i
            person.age = 20 + i
            personList!!.add(person)
        }
        adapter!!.notifyDataSetChanged()
    }
}
