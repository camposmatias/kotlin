fun main () {
    println("NOTAS DE LA MATERIA DE MATEMATICA")
    println("")
    println("cuanto te sacaste en el primer cuatrimestre?")
    var nota1 = readLine()?.toInt() as Int
    println("cuanto te sacaste en el segundo cuatrimestre?")
    var nota2 = readLine()?.toInt() as Int
    println("cuanto te sacaste en el tercer cuatrimestre?")
    var nota3 = readLine()?.toInt() as Int

    var promedio = (nota1 + nota2 + nota3) / 3

    when {
        promedio >= 7 -> println("fuiste promociona")
        promedio < 7 -> println("fuiste promociona")
        promedio >= 4 -> println("reprobado")

    }

}