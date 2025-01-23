package classes
/**
 * Clase Domicilio
 * @param calle calle del domicilio
 * @param numero numero del domicilio
 * @constructor Crea un domicilio con calle y numero
 */
data class Domicilio(private val calle: String, private val numero: Int,) {
    override fun toString(): String {
        return "Calle $calle, Número: $numero"
    }
}