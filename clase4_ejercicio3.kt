// Clase 4 | Ejercicio 3 | "Promedio con When"

fun main() {
    val nota1 = 6
    val nota2 = 8
    val nota3 = 7

    val promedio = (nota1 + nota2 + nota3) / 3

    when {
        promedio >= 7 -> print("Promocionado")
        promedio >= 4 -> print("Aprobado")
        else -> print("Reprobado")
    }
}