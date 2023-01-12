package com.example.hw57

import androidx.core.text.isDigitsOnly

class Math {



    fun add(a:String,b:String):String{
        var c = ""

        if(a.contains(".") || b.contains(".")) {
            var num1 = a.toDouble()
            var num2 = b.toDouble()
            c = (num1 + num2).toString()

        }else if ( a.toInt() < 0 || b.toInt() < 0){
            var num1 = a.toInt()
            var num2 = b.toInt()
            c = (num1 + num2).toString()
        }else if (!isNumeric(a) || !isNumeric(b)){
            c = "Нельзя вводить буквы"
        }else{
            var num1 = a.toInt()
            var num2 = b.toInt()
            c = (num1 + num2).toString()
        }
        return c
    }

    fun divide(a:String,b:String):String{
        var c = ""
        if( a.toInt() == 0 || b.toInt() == 0) {
            c = "На ноль делить нельзя"
        }else{
            var num1 = a.toInt()
            var num2 = b.toInt()
            c = (num1 / num2).toString()
        }
        return c
    }

    fun isNumeric(str: String) = str.all { it in '0'..'9' }
}