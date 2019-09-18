package constructor

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

// primary constructor
class Person(fn: String, ln:String){
    val firstName=fn
    val lastName=ln //
}

fun main(args: Array<String>) {
    val p: Person = Person("Anna", "Who")
    p.firstName
}