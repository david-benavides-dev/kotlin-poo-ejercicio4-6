import classes.*

fun main() {
    val listaCompras = listOf(
        Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 5, 12780.78),
        Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 7, 699.0),
        Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 7, 532.90),
        Compra(Cliente("Julián Rodriguez", Domicilio("La Mancha", 761)), 12, 5715.99),
        Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 15, 958.0)
    )

    val repositorioCompras = Repositorio()

    for (compra in listaCompras) {
        repositorioCompras.agregar(compra)
    }

    val setDomicilio = repositorioCompras.domicilios()

    for ((i, domicilio) in setDomicilio.withIndex()) {
        println("Domicilio ${i + 1}: $domicilio")
    }
}