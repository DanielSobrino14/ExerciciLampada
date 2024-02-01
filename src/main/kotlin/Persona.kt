
class Persona {
     var dni: String = ""
     var nom: String = ""
     var cognoms: String = ""
     var edat: Int = 0
     var estatCivil: Boolean = false

    constructor()

    constructor(nom:String, cognoms: String): this() {
        this.nom = nom
        this.cognoms = cognoms
    }
    constructor(dni: String, nom: String, cognoms: String, edat: Int, estatCivil: Boolean): this() {
        this.dni = dni
        this.nom = nom
        this.cognoms = cognoms
        this.edat = edat
        this.estatCivil = estatCivil
    }


    fun aniversari() {
        edat ++

    }

    fun casament() {
        estatCivil = true

    }

    fun divorci() {
        estatCivil = false

    }

    override fun toString(): String {
        return "El nom es: $nom, Els cognoms son: $cognoms, L'edat es: $edat, El teu estat civil: ${
            if (estatCivil) "Casat" else "Solter"}, El teu dni es: $dni"
    }



}