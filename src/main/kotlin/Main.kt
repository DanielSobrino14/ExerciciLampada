fun main() {

    val persona1 = Persona("Juan", "Perez")
    persona1.nom = "Juan"
    persona1.cognoms = "Perez"
    persona1.edat = 25
    persona1.casament()

    val persona2 = Persona("12345678A", "Maria", "Gomez", 30, false)
    persona2.divorci()

    val persona3 = Persona("Pedro", "Martinez")
    persona3.aniversari()
    persona3.casament()

    println("Persona 1:")
    println(persona1)
    println()

    println("Persona 2:")
    println(persona2)
    println()

    println("Persona 3:")
    println(persona3)
}
