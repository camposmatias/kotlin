fun main() {
    println("\nIngrese su edad: ")

    var edad = readLine()!!.toInt()

    if (edad >= 18)
        println("¡Podés ingresar al Club!")
    else if (edad >= 14 && edad <= 18)
        println("¡Podes ingresar al Club Matineé.!")
    else
        println("Los menores de 14 años, no pueden ingresar")
}
