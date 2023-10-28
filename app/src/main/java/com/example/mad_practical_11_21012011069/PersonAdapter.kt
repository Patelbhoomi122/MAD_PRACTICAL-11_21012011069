package com.example.mad_practical_11_21012011069

import android.content.Context
import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class PersonAdapter(val context:Context, val PersonArray :ArrayList<Person>):RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
    inner class PersonViewHolder(val view: View):RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)
        return PersonViewHolder(view)

    }

    override fun getItemCount(): Int {
        return PersonArray.size

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val view=holder.view
        view.findViewById<TextView>(R.id.textView_name).text=PersonArray[position].name
        view.findViewById<TextView>(R.id.textView_no).text=PersonArray[position].phoneNo
        view.findViewById<TextView>(R.id.textView_email).text=PersonArray[position].emailid
        view.findViewById<TextView>(R.id.textView_address).text=PersonArray[position].address
        view.findViewById<MaterialButton>(R.id.button2).setOnClickListener {
            Intent(context,MapsActivity::class.java).putExtra("object",PersonArray[position]).apply { context.startActivity(this) }
        }
    }

}