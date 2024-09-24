package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberInString = str.filter { it.isDigit() }.toString()

    return if (numberInString.isNotEmpty()) {
        val number = numberInString.toInt()
        val result = number * int
        str.replace(numberInString, "") + result
    } else {
        str + int
    }
}
