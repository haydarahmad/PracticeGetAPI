package com.haydar.practicegetapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haydar.practicegetapi.data.User
import com.haydar.practicegetapi.data.UserItem
import com.haydar.practicegetapi.databinding.ItemUserBinding

class AdapterUser : RecyclerView.Adapter<AdapterUser.UserViewHolder>() {

    private val listUser = ArrayList<UserItem>()

    class UserViewHolder(val itemUser: ItemUserBinding) : RecyclerView.ViewHolder(itemUser.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UserViewHolder(
        ItemUserBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemUser.apply {
            with(listUser[position]){
                tvUserName.text = username
                tvName.text = name
                tvEmail.text  = email
            }
        }
    }

    override fun getItemCount() = listUser.size

    fun setUser(user: ArrayList<UserItem>){
        this.listUser.clear()
        this.listUser.addAll(user)
    }
}