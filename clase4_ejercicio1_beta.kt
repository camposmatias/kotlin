fun main() {
    println("Cuánto te sacaste en el 1° examen?")
    val nota1 = readLine()!!.toInt()
    println("Cuánto te sacaste en el 2° examen?")
    val nota2 = readLine()!!.toInt()
    println("Cuánto te sacaste en el 3° examen?")
    val nota3 = readLine()!!.toInt()

    val promedio = (nota1 + nota2 + nota3) / 3

    if (promedio >= 7)
        print("Promocionado. Tu nota final es: $promedio.")
    else if (promedio >= 4)
        print("Aprobado. Tu nota final es: $promedio.")
    else
        print("Reprobado.Tu nota final es: $promedio.")
}
