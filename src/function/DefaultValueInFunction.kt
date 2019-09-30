package function

fun main() {
    println(addNumbersWithDefault(one = 1.0, two = 2.0))
    // result: 3.0
    println(addNumbersWithDefault(one = 1.0))
    // result: 5.99
}

fun addNumbersWithDefault(one: Double, two: Double = 4.99)  = one + two