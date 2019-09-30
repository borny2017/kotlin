package `class`
// class public
class Customer {
    // field are public
    val name = "Borny"
    var age = 10
}

fun main() {
                   // none new however ()
    val customer = Customer()
    // set a public field
    customer.age = 11
    println("${customer.name} is ${customer.age} years old")
}

