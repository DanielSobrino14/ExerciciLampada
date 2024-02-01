class Pasta  {
    private var nom: String = ""
    private var preu: Double= 0.0
    private var pes: Double = 0.0
    private var calories: Int = 0


    constructor(nom: String, preu: Double, pes: Double, calories: Int) {
        this.nom = nom
        this.preu = preu
        this.pes = pes
        this.calories = calories
    }

    fun getNom(): String {
        return nom
    }

    fun setNom(nom: String) {
        this.nom = nom
    }

    fun getPreu(): Double {
        return preu
    }

    fun setPreu(preu: Double) {
        this.preu = preu
    }

    fun getPes(): Double {
        return pes
    }

    fun setPes(pes: Double) {
        this.pes = pes
    }

    fun getCalories(): Int {
        return calories
    }

    fun setCalories(calories: Int) {
        this.calories = calories
    }
    override fun toString(): String {
        return "El nom es: $nom, El preu es: $preu, El pes es: $pes, El numero de calories es: $calories"
    }
}
