package constructor

// primary constructor
class Person(val fn: String, val ln:String){
}

fun main(args: Array<String>) {
    val p: Person = Person("Anna", "Who")
    // Output Anna
    println(p.fn)
}