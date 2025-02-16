data class Revista(
    override val titulo: String,
    val issue: Int,
    val anio: Int
) : Articulo(titulo)