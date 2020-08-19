package com.example.recyclerlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnProfileClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = list
        recycler_view.adapter =  RVAdapter(list, this)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    //ARRAY OF STUDENTS
    var list = listOf<Data>(
        Data(R.mipmap.ari, "ARI TAMUNOMIEBI", "Android Stack"),
        Data(R.mipmap.abdul, "ABDULRASAQ DUROSOMO", "Android Stack"),
        Data(R.mipmap.osehiase, "OSEHIASE EHILEN", "Android Stack"),
        Data(R.mipmap.timring, "TIMRING TIMKWALI", "Android Stack"),
        Data(R.mipmap.david, "DAVID OMU", "Android Stack"),
        Data(R.mipmap.kingsley, "KINGSLEY IZUNDU", "Android Stack"),
        Data(R.mipmap.omodo, "OMODO OGHENEKOME", "Android Stack"),
        Data(R.mipmap.oyedele, "OYEDELE SAMUEL","Android Stack"),
        Data(R.mipmap.oladapo, "OLADAPO OLADOKUN", "Android Stack"),
        Data(R.mipmap.olalekan, "OLALEKAN FAGBEMI", "Android Stack"),
        Data(R.mipmap.victor, "VICTOR ADEWUMI", "Android Stack"),
        Data(R.mipmap.fredrick, "FREDRICK CHIBUZOR OSUALA", "Android Stack"),
        Data(R.mipmap.daniel, "DANIEL OGUNLEYE AYODEJI", "Android Stack"),
        Data(R.mipmap.samuel, "SAMUEL OCHUBA", "Android Stack"),
        Data(R.mipmap.ransom, "RANSOM AHANMISI", "Android Stack"),
        Data(R.mipmap.emmanuel, "EMMANUEL UTUTU", "Android Stack")
    )

    //IMPLEMENT CLICK ACTIONS
    override fun onItemClick(dataList: Data, position: Int) {
        super.onItemClick(dataList, position)
        Toast.makeText(this, "Hi ${dataList.name}", Toast.LENGTH_SHORT).show()
    }

}