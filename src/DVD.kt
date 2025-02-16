data class DVD(
    override val titulo: String,
    val director: String,
    val anio: Int
) : Articulo(titulo)