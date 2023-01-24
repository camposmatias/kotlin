// Clase 4 | Ejercicio 3 | "Promedio con When"

fun main() {
    println("\nIngrese la nota de su primer examen: ")
    val nota1 = readLine()!!.toDouble()
    println("\nIngrese la nota de su segundo examen: ")
    val nota2 = readLine()!!.toDouble()
    println("\nIngrese la nota de su tercer examen: ")
    val nota3 = readLine()!!.toDouble()

    val promedio = (nota1 + nota2 + nota3) / 3

    when {
        promedio >= 7 -> print("Promocionado. \nSu nota final es: $promedio.\n")
        promedio >= 4 -> print("Aprobado. \nSu nota final es: $promedio.\n")
        else -> print("Reprobado. \nSu nota final es: $promedio.\n")
    }
}