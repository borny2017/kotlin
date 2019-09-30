package function

fun printAsString2(value: String) = println(value)

fun main() {
    println(addTwoNumbers(1.2, 1.5))
    printAsString2("Calling SingleExpressionFunction.")
}

fun addTwoNumbers(one: Double, two: Double)  = one + two
