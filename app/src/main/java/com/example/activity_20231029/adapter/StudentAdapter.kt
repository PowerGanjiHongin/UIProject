package com.example.activity_20231029.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.activity_20231029.R
import com.example.activity_20231029.datas.StudentData

class StudentAdapter
    (mContext:Context,
    resId : Int,
    val mList: ArrayList<StudentData> // getview '함수'에서도 사용하고 싶다. : val 키워드를 추가한다.
     ) : ArrayAdapter<StudentData>(mContext, resId, mList) { // ArrayAdaper: 기본 생성자 지원 x
    // 커스텀으로 만든 xml을 => 코틀린으로 끌어와주는 객체
    val inf = LayoutInflater.from(mContext)
    // 완성한 inf를이용해서 xml을 가져와주는 함수

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        // 만일 tempRow가 null상태라면 (재사용할 row가 아직 안그려짐)

        if (tempRow == null) {
            //xml을  inflate해서 그려준다. 그렇게 tempRow에 담아준다.
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        // if문을 빠져나온후 원래 null이라면 새로 그려서 넣고 null이 아니라면 있는 것을 사용한다.
        // tempdp null 상태일 가능성을 완전히 제거

        // 진짜로 사용할 row 변수에 temprow가 null이 아니라고 장담하며 대입
        val row = tempRow!!

        // xml 을 그려낸 row 객체 내부에서, 텍스트뷰 등을 찾아서 실제 데이터로 이동
        // 실제 데이터? 어떤학생 => mList의 position에 맞는 객체

        val stdData = mList[position] // 그림을 그려줄 위치에 맞는 학생 객체 추출

        mList

        // row 안의 이름 표시하는 TextView를 변수로 가져와야, stdData의 이름값을 대입 가능
        // Adapter에서는 데이터 바인딩 사용불가 => 직접 코드로 불러 내야하다. (텍스트 뷰들 가져옥

        val stdName = row.findViewById<TextView>(R.id.txtName)
        stdName.text = stdData.name

        val stdAge = row.findViewById<TextView>(R.id.txtAge)
        stdAge.text = "${stdData.getKoreanAge(2023)}세"

        val stdPhone = row.findViewById<TextView>(R.id.txtPhone)
        stdPhone.text = stdData.phoneNum

        return row
    }
    // dhfaru


}
