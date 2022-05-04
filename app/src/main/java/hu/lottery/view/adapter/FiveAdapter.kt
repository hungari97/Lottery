package hu.lottery.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hu.lottery.R
import hu.lottery.model.FiveTicket

class FiveAdapter(
    val context: Context,
    val fiveTickets: List<FiveTicket>
) : RecyclerView.Adapter<FiveAdapter.FiveViewHolder>() {

    class FiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViews = arrayOf<TextView>(
            itemView.findViewById(R.id.tvWinnerNumb1),
            itemView.findViewById(R.id.tvWinnerNumb2),
            itemView.findViewById(R.id.tvWinnerNumb3),
            itemView.findViewById(R.id.tvWinnerNumb4),
            itemView.findViewById(R.id.tvWinnerNumb5)
        )

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FiveViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.row_item_five_ticket, parent, false)
        return FiveViewHolder(view)
    }

    override fun getItemCount() = fiveTickets.size

    override fun onBindViewHolder(holder: FiveViewHolder, position: Int) {
        holder.textViews[0].text = fiveTickets[position].numbers[0].toString()
        holder.textViews[1].text = fiveTickets[position].numbers[1].toString()
        holder.textViews[2].text = fiveTickets[position].numbers[2].toString()
        holder.textViews[3].text = fiveTickets[position].numbers[3].toString()
        holder.textViews[4].text = fiveTickets[position].numbers[4].toString()
    }

}