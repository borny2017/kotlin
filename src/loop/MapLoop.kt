package loop

fun main() {
    val persons = HashMap<Int, PersonDTO>()
    persons.put(1, PersonDTO(1, "Borny"))
    persons.put(2, PersonDTO(2, "Toni"))

    for( (key, value) in persons)
        println("${value.name} has the key $key")
}