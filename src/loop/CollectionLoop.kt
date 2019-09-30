package loop

data class PersonDTO(val id: Int, val name: String)

fun main() {
    val persons = ArrayList<PersonDTO>()
    persons.add(PersonDTO(1, "Borny"))
    persons.add(PersonDTO(2, "Sabine"))

    for(p in persons){
        println(p)
    }

    for((id, name) in persons){
        println("$name has the id $id")
    }
}