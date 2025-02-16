fun tomarPrestado(usuario: Usuario, articulo: Articulo): String {
    return when (usuario) {
        is Estudiante -> "${usuario.nombre} puede tomar prestado el libro '${articulo.titulo}' por 14 días."
        is Profesor -> "${usuario.nombre} puede tomar prestado el libro '${articulo.titulo}' por 30 días."
        is Visitante -> "${usuario.nombre} no puede tomar prestados libros."
    }
}

fun main() {
    val usuarios: MutableList<Usuario> = mutableListOf(
        Estudiante("123456Q", "Fran", "Química"),
        Profesor("654321C", "Diego", "Física"),
        Visitante("975680U", "Pablo")
    )

    val articulos: MutableList<Articulo> = mutableListOf(
        Libro("1984", "George Orwell", 1949),
        Revista("National Geographic", 150, 2023),
        DVD("Inception", "Christopher Nolan", 2010)
    )

    for (i in usuarios.indices) {
            println(tomarPrestado(usuarios[i], articulos[i]))
    }
}