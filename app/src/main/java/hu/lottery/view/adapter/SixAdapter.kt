package hu.lottery.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hu.lottery.R
import hu.lottery.model.SixTicket

class SixAdapter (
    val context: Context,
    val sixTickets: List<SixTicket>
) : RecyclerView.Adapter<SixAdapter.SixViewHolder>() {

    class SixViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViews = arrayOf<TextView>(
            itemView.findViewById(R.id.tvWinnerNumb61),
            itemView.findViewById(R.id.tvWinnerNumb62),
            itemView.findViewById(R.id.tvWinnerNumb63),
            itemView.findViewById(R.id.tvWinnerNumb64),
            itemView.findViewById(R.id.tvWinnerNumb65),
            itemView.findViewById(R.id.tvWinnerNumb66)
        )

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SixViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.row_item_five_ticket, parent, false)
        return SixViewHolder(view)
    }

    override fun getItemCount() = sixTickets.size

    override fun onBindViewHolder(holder: SixViewHolder, position: Int) {
        holder.textViews[0].setText(sixTickets[position].numbers[0])
        holder.textViews[1].setText(sixTickets[position].numbers[1])
        holder.textViews[2].setText(sixTickets[position].numbers[2])
        holder.textViews[3].setText(sixTickets[position].numbers[3])
        holder.textViews[4].setText(sixTickets[position].numbers[4])
        holder.textViews[5].setText(sixTickets[position].numbers[5])
    }

}