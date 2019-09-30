package nullable

fun main(args: Array<String>) {
    var name: String? = null
    //name = "Matt"
    // print NULL
    println("$name".toUpperCase())
    /**
     * val result = name?.toUpperCase() means
     * val result : String?
     * if(name!=null)  result = name.toUpperCase() else result = null
     */
    println(name?.toUpperCase())
    // throws a KotlinNullPointerException
    println(name!!.toUpperCase())

}