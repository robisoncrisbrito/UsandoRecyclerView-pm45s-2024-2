package br.edu.utfpr.usandorecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import br.edu.utfpr.usandorecyclerview.R
import br.edu.utfpr.usandorecyclerview.model.Affirmation

class ItemAdapter ( private val context : Context, private val dataset : List< Affirmation> ) : RecyclerView.Adapter< ItemAdapter.ItemViewHolder>()  {

    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder( view ) {
        val textView : TextView = view.findViewById( R.id.item_title )
        val imageView : ImageView = view.findViewById( R.id.item_image )
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from( parent.context )
            .inflate( R.layout.list_item, parent, false  )

        return ItemViewHolder(adapterLayout)
    }



    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.textView.text = context.resources.getString( item.stringResourceId )
        holder.imageView.setImageResource( item.imageResourceId )
    }

}