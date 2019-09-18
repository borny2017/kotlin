package variabledeclaration

import java.math.BigDecimal

fun main(args: Array<String>){
    val thisIsString = "thisIsString"
    val thisIsInteger: Int = 1
    val thisIsLong: Long = 20L
    val thisIsFloat: Float = 4f
    val thisIsBoolean = true
    val thisIsBigDecimal = BigDecimal(2)
    val thisIsBigDecimalToo : BigDecimal
    val thisIsObject: Any
    val thisIsNullString: String? = null
    val thisIsDouble = 2.7
    val listOfStrings = listOf("Hello", "World", "!")
    val mapOfStringLength = listOfStrings.map() {it.length}

    println("thisIsDouble is a Double? ${thisIsDouble is Double}")
    println("thisIsDouble is ? ${thisIsInteger::class.qualifiedName}")
}