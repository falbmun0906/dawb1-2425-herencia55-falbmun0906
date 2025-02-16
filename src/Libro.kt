data class Libro(
    override val titulo: String,
    val autor: String,
    val anioPublicacion: Int
) : Articulo(titulo)