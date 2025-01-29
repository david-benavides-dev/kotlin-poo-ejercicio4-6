package classes

/**
 * Clase que representa un repositorio de compras.
 * Permite agregar compras y obtener un conjunto de domicilios únicos de los clientes.
 */
class Repositorio {
    private val listaCompras = mutableListOf<Compra>()

    /**
     * Agrega una compra al repositorio.
     *
     * @param compra La compra a agregar.
     */
    fun agregar(compra: Compra) {
        listaCompras.add(compra)
    }

    /**
     * Agrega una compra al repositorio utilizando la información del cliente, día y total.
     *
     * @param cliente El cliente que realizó la compra.
     * @param dia El día en que se realizó la compra.
     * @param total El total de la compra.
     */
    fun agregar(cliente: Cliente, dia: Int, total: Double) {
        listaCompras.add(Compra(cliente, dia, total))
    }

    /**
     * Agrega una compra al repositorio utilizando el nombre del cliente, su domicilio,
     * el día y el total de la compra.
     *
     * @param nombre El nombre del cliente.
     * @param calle La calle del domicilio del cliente.
     * @param numero El número del domicilio del cliente.
     * @param dia El día en que se realizó la compra.
     * @param total El total de la compra.
     */
    fun agregar(nombre: String, calle: String, numero: Int, dia: Int, total: Double) {

        val domicilio= Domicilio(calle, numero)
        val cliente= Cliente(nombre, domicilio)
        listaCompras.add(Compra(cliente, dia, total))
    }

    /**
     * Obtiene un conjunto de domicilios únicos de los clientes que realizaron compras.
     *
     * @return Un conjunto mutable de domicilios.
     */
    fun domicilios(): MutableSet<Domicilio> {
        val setCompras: MutableSet<Domicilio> = mutableSetOf()
        for (compra in listaCompras) {
            setCompras.add(compra.cliente.domicilio)
        }
        return setCompras
    }
}