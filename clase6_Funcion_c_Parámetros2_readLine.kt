// Clase #6 | Funciones con parámetros + readLine()

fun saludar(nombre:String) {
    println("\n¡Hola $nombre!")
    println("¡Estamos en la clase 6 de Aprendé Programando!")
}
fun main() {
    println("¿Cómo te llamás?")
    val nombreUsuario = readLine()!!
    saludar(nombreUsuario)
}

/*
Nota:
La variable que se pasa como parámetro (nombreUsuario) para la función saludar()
es inicializada dentro de la función main() con readLine().
 */