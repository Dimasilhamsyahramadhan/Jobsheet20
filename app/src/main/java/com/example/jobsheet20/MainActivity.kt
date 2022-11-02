package com.example.jobsheet20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Siswa>()
    val listnama = arrayOf(
        "ANDREAS ADI MINARSO",
        "ANITA SARI",
        "ARDIAN MUHAMMAD IQBAL",
        "BAGAS SAPUTRA",
        "CHELSEA ADITYA SUYATNO",
        "DIMAS ILHAMSYAH RAMADHAN",
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SHOLIKHATUL MUFALAH",
        "FIKA ISMATUL HAWA",
        "FIKI ZULKARNAIN"
    )

    val listnis = arrayOf(
        "2994",
        "2975",
        "2976",
        "2978",
        "2980",
        "2983",
        "2984",
        "2986",
        "2989",
        "2990",
        "2991",
    )
    lateinit var SiswaView: RecyclerView
    lateinit var SiswaAdapter: SiswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SiswaView = findViewById(R.id.SiswaView)
        SiswaView.layoutManager = LinearLayoutManager(this)

        for (i in listnama.indices) {
            list.add(Siswa(listnama[i], listnis[i]))
        }

        SiswaAdapter = SiswaAdapter(list)
        SiswaAdapter.notifyDataSetChanged()
        SiswaView.adapter = SiswaAdapter
    }
}
