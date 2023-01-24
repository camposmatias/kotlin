fun main(args: Array<String>) {

    println("**********************************")
    println("*Programa para ingresar al club. *")
    println("**********************************")
    println("")
    println("Cual es tu edad: ")
    var edad = readLine()!!.toInt()

    if (edad >= 18)
        println("Podés pasar.")
    else
        println("Lo siento, sos menor y no podes pasar.")
}

