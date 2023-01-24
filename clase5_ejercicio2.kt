// Clase #5 | Ejercicio 2 | Acumuladores múltiples

/* Modificá el ejercicio de ejemplo de acumuladores para que luego de acumular los 10 números
nos informe cuántos de estos números son mayores o iguales a 7 y cuántos menores.
Pista: vas a necesitar más de un contador para resolver este ejercicio.
*/

fun main() {

    var i = 1                   // contador
    var acum = 0
    var contMayores = 0
    var contMenores = 0

    while (i <= 10) {
        acum = acum + i
        i++
        if (i <= 7 ) {
            contMenores++
	}
        else {
            contMayores++
	}
    }
    println("\nEl total acumulado es: $acum")
    println("La cantidad de números mayores o iguales a 7 es: $contMayores")
    println("La cantidad de números menores a 7 es: $contMenores")
}
