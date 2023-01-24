// Clase #6 | Función con prámetros que retornan un valor | Promedio de Notas.

fun notaFinal(notaA: Int, notaB: Int, notaC: Int): Int {

    var promedio = (notaA + notaB + notaC) / 3
    return(promedio)
}

fun main() {
    println("Ingresa tu 1° Nota: ")
    var notaA = readLine()!!.toInt()
    println("Ingresa tu 2° Nota: ")
    var notaB = readLine()!!.toInt()
    println("Ingresa tu 3° Nota: ")
    var notaC = readLine()!!.toInt()

    println("\nSu nota final es: ${notaFinal(notaA,notaB,notaC)}.")
}