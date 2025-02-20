package br.edu.utfpr.usandorecyclerview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.edu.utfpr.usandorecyclerview.adapter.ItemAdapter
import br.edu.utfpr.usandorecyclerview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>( R.id.recycler_view )
        val adapter = ItemAdapter( this, Datasource().loadAffirmations() )
        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize( true )

    }
}