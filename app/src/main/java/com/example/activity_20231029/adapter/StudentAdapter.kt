package com.example.activity_20231029.adapter

import android.content.Context
import android.widget.ArrayAdapter
import com.example.activity_20231029.datas.StudentData

class StudentAdapter(mContext:Context,
    resId : Int,
    mList: ArrayList<StudentData>) :
    ArrayAdapter<StudentData>(
        mContext, resId, mList
    )
 { // ArrayAdaper: 기본 생성자 지원 x
}