package com.hfad.beeradviser

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context
): RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var countryName: TextView = itemView.findViewById(R.id.countryName)
        var countryDetail: TextView = itemView.findViewById(R.id.countryDetail)
        var circleFlag: CircleImageView = itemView.findViewById(R.id.circleFlag)
        var cardView : CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CountryViewHolder {

        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.card_design,
            parent,false)
    return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
            holder.countryName.text = countryNameList[position]
            holder.countryDetail.text = detailsList[position]
            holder.circleFlag.setImageResource(imageList[position])
    holder.cardView.setOnClickListener {
        Toast.makeText(context,"You selected the " +
                countryNameList[position],Toast.LENGTH_SHORT).show()
    }
    }

    override fun getItemCount(): Int {
return countryNameList.size
    }

}