package com.example.assingmentshaayin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assingmentshaayin.databinding.PersonalviewBinding

class MeetingAdapter(val meetingList:ArrayList<Meeting>):RecyclerView.Adapter<MeetingAdapter.MeetingViewHolder>() {


    class MeetingViewHolder(private val binding: PersonalviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(meeting: Meeting) {
            binding.imgPersonCall.setImageResource(meeting.imgOfPerson)
            binding.Call.setImageResource(meeting.imgOfCall)
            binding.Chat.setImageResource(meeting.imgOfChat)
            binding.Video.setImageResource(meeting.imgOfVideo)
            binding.More.setImageResource(meeting.imgOfMore)
            binding.txtName.text=meeting.txtOfNamePerson
        }
    }


    override fun getItemCount() = meetingList.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MeetingAdapter.MeetingViewHolder {
        val binding=PersonalviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MeetingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MeetingAdapter.MeetingViewHolder, position: Int) {
       val meeting=meetingList[position]
        holder.bind(meeting)

    }
}
