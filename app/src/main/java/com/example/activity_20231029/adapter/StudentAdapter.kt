package com.example.activity_20231029.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.activity_20231029.R
import com.example.activity_20231029.datas.StudentData

class StudentAdapter(mContext:Context,
    resId : Int,
    mList: ArrayList<StudentData>) :
    ArrayAdapter<StudentData>(mContext, resId, mList) { // ArrayAdaper: 기본 생성자 지원 x
    // 커스텀으로 만든 xml을 => 코틀린으로 끌어와주는 객체
    val inf = LayoutInflater.from(mContext)
    // 완성한 inf를이용해서 xml을 가져와주는 함수

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        return tempRow!!
    }
    // dhfaru


}
