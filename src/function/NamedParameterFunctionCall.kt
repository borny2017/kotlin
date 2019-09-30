package function

fun main() {
    println(minusTwoNumbers(one = 1.0, two = 2.0))
    println(minusTwoNumbers(two = 1.0, one = 2.0))
    println(minusTwoNumbers(one = 2.0, two = 1.0))
}

fun minusTwoNumbers(one: Double, two: Double)  = one - two