package loop

fun main() {
    var range = 0..9
    for(i in range){
        println(i)
    }
    println("Loop1 0->9")
    (0..9).forEach { println(it) }
    println("downTo Loop 9->0")
    (9 downTo 0).forEach { println(it) }
    println("until Loop 0->9")
    (0 until 9).forEach { println(it) }
    println("Loop with steps of 2 0->9")
    (0..9 step 2).forEach { println(it) }
    println("Character Loop")
    ('A'..'D').forEach { println(it) }
}