package com.example.activity_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.activity_20231029.adapter.StudentAdapter
import com.example.activity_20231029.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStuentList = ArrayList<StudentData>()

    lateinit var mStdAdapter: StudentAdapter

    lateinit var binding : MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 넣는법 1
        val std1 = StudentData("임홍인", 1999, "010-30265086")

        // 넣는법 2
        mStuentList.add(StudentData("홍도완", 1999, "010-1186-1585"))
        mStuentList.add(StudentData("탁혁재", 1999, "010-8889-5486"))
        mStuentList.add(StudentData("박진우", 1999, "010-1674-4852"))
        mStuentList.add(StudentData("이보성", 1999, "010-6969-5895"))
        mStuentList.add(StudentData("유세훈", 1999, "010-5162-1515"))
        mStuentList.add(StudentData("바로나", 1999))

        mStdAdapter = StudentAdapter(this, R.layout.student_list_item, mStuentList)


    }
}
