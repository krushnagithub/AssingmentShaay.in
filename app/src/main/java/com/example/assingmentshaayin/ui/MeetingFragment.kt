package com.example.assingmentshaayin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assingmentshaayin.R
import com.example.assingmentshaayin.databinding.FragmentMeetingBinding


class MeetingFragment : Fragment() {
    private lateinit var binding:FragmentMeetingBinding
    private lateinit var meetingList:ArrayList<Meeting>
    private lateinit var meetingadapter:MeetingAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentMeetingBinding.bind(inflater.inflate(R.layout.fragment_meeting,null))
        initData()
        initView()

        return binding.root
    }
    private fun initData(){
        meetingList = ArrayList()

        meetingList.add(Meeting(R.drawable.imagcall1,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imaaaaage,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imaaaaagee,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"Michael Davis"))
        meetingList.add(Meeting(R.drawable.imagecall3,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagecall4,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"Michael Davis"))
        meetingList.add(Meeting(R.drawable.imagcall1,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imaaaaage,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imaaaaagee,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagecall3,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagecall4,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagcall1,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"Michael Davis"))
        meetingList.add(Meeting(R.drawable.imaaaaage,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imaaaaagee,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagecall3,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"Michael Davis"))
        meetingList.add(Meeting(R.drawable.imagecall4,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagcall1,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imaaaaage,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imaaaaagee,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagecall3,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))
        meetingList.add(Meeting(R.drawable.imagecall4,R.drawable.telephonecall,R.drawable.more,R.drawable.videoimage,R.drawable.chat,"James Brown"))





    }
    private fun initView(){
        val spanCount = 2
        val layoutManager = GridLayoutManager(activity, spanCount, GridLayoutManager.VERTICAL, false)
        binding.RecyclerView.layoutManager = layoutManager
        meetingadapter = MeetingAdapter(meetingList)
        binding.RecyclerView.adapter = meetingadapter
        meetingadapter.notifyDataSetChanged()

    }

}