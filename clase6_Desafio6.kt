// Clase #6 | Desafío 6 - Intérvalo

fun intervalo(numero: Int, min: Int, max: Int) {

    if (numero > min && numero < max) {
        println("El número $numero se encuentra entre el intervalo menor $min y el mayor $max.")
    } else {
        println("El número $numero está fuera de los intérvalos $min y $max.")
    }
}

fun main() {
    intervalo(20,18,23)
}