class Beguda {
    private var nom: String = ""
    internal var preu: Double = 0.0
    private var incrementPreu: Boolean = false

    constructor(nom: String, preu: Double, incrementPreu: Boolean) {
        this.nom = nom
        this.preu = preu
        this.incrementPreu = incrementPreu
    }

    fun bebidaAzucarada() {
        incrementPreu = true
    }
    override fun toString(): String {
        val increment = if (incrementPreu) "Sí" else "No"
        return "Beguda: $nom, Preu: $preu€, Té increment de preu: $increment"
    }


}