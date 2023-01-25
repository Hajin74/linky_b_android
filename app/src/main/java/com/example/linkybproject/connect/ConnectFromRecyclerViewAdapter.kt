package com.example.linkybproject.connect

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.linkybproject.databinding.ItemConnectFromBinding

class ConnectFromRecyclerViewAdapter:RecyclerView.Adapter<ConnectFromRecyclerViewAdapter.MyViewHolder>() {

    var datalist = mutableListOf<ConnectUserData>() //리사이클러뷰에서 사용할 데이터 미리 정의 -> 나중에 MainActivity등에서 datalist에 실제 데이터 추가

    inner class MyViewHolder(private val binding: ItemConnectFromBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(userData: ConnectUserData){
            binding.profileName.text = userData.username
            binding.profileLike.text = userData.likecount.toString()
            binding.profileMajor.text = userData.department
        }
    }

    //만들어진 뷰홀더 없을때 뷰홀더(레이아웃) 생성하는 함수
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConnectFromRecyclerViewAdapter.MyViewHolder {
        val binding = ItemConnectFromBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = datalist.size

    //recyclerview가 viewholder를 가져와 데이터 연결할때 호출
    //적절한 데이터를 가져와서 그 데이터를 사용하여 뷰홀더의 레이아웃 채움
    override fun onBindViewHolder(holder: ConnectFromRecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.bind(datalist[position])
    }

}