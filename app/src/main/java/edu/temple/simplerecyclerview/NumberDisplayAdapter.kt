package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val items: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* TODO Step 3a: Provide Adapter Parent */ {
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    // TODO Step 3b: Complete function definitions for adapter

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        return NumberViewHolder(
            TextView(parent.context)
        )
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.textView.text = items[position].toString()
        holder.textView.textSize = items[position].toFloat()
    }

    override fun getItemCount(): Int {
        return items.size
    }

}