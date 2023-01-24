fun saludo2(nombre1: String) {

    if (nombre1 == "") {
        println("\nEl nombre no puede estar vacío!")
    } else {
        print("Hola $nombre1!\n")
    }
}

fun main() {

    print("\nCual es tu nombre? >")
    val nombre = readLine()!!
    saludo2(nombre)
}

/*
Nota: en la línea 3 se puede usar: (nombre.isNullOrEmpty())
 */