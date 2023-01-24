// Clase #6 | Función con Parámetros

fun main() {
    misdatos("Matías", "Campos", 44)
}

fun misdatos(nombre: String, apellido: String, edad: Int) {
    println("\n Me llamo $nombre $apellido y tengo $edad de edad.")
}

/*
En las funciones con parámetros, se coloca entre los paréntesis
de la función creada, los nombres de las variables, seguido de dos puntos y el tipo de dato que almacenará.
Luego, desde la función principa (main) se pasa los datos o valores que procesará la
función (mis datos).
 */