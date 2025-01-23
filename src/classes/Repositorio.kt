package classes

class Repositorio {
    private val listaCompras = mutableListOf<Compra>()

    fun agregar(compra: Compra) {
        listaCompras.add(compra)
    }

    fun agregar(cliente: Cliente, dia: Int, total: Double) {
        listaCompras.add(Compra(cliente, dia, total))
    }

    fun agregar(nombre: String, calle: String, numero: Int, dia: Int, total: Double) {

        val domicilio = Domicilio(calle, numero)
        val cliente = Cliente(nombre, domicilio)
    }
}