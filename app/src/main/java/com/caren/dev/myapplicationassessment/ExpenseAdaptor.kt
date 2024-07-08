package com.caren.dev.myapplicationassessment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ExpenseAdapter(val authorList: List<Expense>): RecyclerView.Adapter<AuthorBlogsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorBlogsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_list,parent,false)
        return AuthorBlogsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return authorList.size
    }

    override fun onBindViewHolder(holder: AuthorBlogsViewHolder, position: Int) {
        val blog= authorList[position]
        holder.authorName.text=blog.name
        holder.authorTitle.text=blog.title
        holder.publishingDate.text=blog.rent
        holder.authorProfile.text=blog.profile
        holder.moreButton.text=blog.salary
    }

}
class AuthorBlogsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var authorName = itemView.findViewById<TextView>(R.id.tvMoney)
    var authorProfile=itemView.findViewById<TextView>(R.id.tvSalary)

    var authorTitle=itemView.findViewById<TextView>(R.id.tvRent)
    var publishingDate=itemView.findViewById<TextView>(R.id.evRent)

    var moreButton=itemView.findViewById<TextView>(R.id.tvSala100)
}