fun main() {

    println("Ingrese la nota de su 1° examen: ")
    var nota1 = readLine()!!.toInt()
    var nota2 = 4
    var nota3 = 2

    var promedio = (nota1 + nota2 + nota3) / 3

    if (promedio < 4 ) {println("Reprobado.")}
    else if (promedio >= 4 && promedio < 7 ) { println("Aprobado.") }
    else if (promedio >= 7) { println("Promocionado.") }
    else { println("Recuperatorio.") }
}
