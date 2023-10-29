package com.example.activity_20231029.datas

import android.util.Log
import android.view.LayoutInflater

class StudentData( //StudentData의 생성자 변경 : 이름, 출생년도, 폰번을 넣어서 생성.
    val name:String,
    val birthYear:Int,
    val phoneNum:String) {
    // 생성자 문법체험 => 폰번을 안받는 생성자도 쓰고 싶다.
    // Main : 전부 다 받는. Sub : 폰번은 안받는(보조)
    constructor( name : String, birthYear: Int) :this(name, birthYear,"폰번 모름")

    // 현재 한국식 나이를 계산해서 리턴해주는 함수
    fun getKoreanAge( year: Int ) : Int{
        return year - this.birthYear + 1
    }

    // void 대체 연습 : 폰번을 - 제외하고 주는 함수

    fun getSimpePhoneNum(){ // 리턴 타입을 명시하지 않으면 리턴 타입이 없는 것
        Log.d("학생 데이터", this.phoneNum.replace("-", ""))
    }


}