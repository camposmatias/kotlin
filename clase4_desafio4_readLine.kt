fun main() {
    println("Ingrese el número de día en el que se encuentra: ")
    val dia = readLine()!!.toInt()
    when (dia) {
        1 -> print("Lunes")
        2 -> print("Martes")
        3 -> print("Miercoles")
        4 -> print("Jueves")
        5 -> print("Viernes")
        6 -> print("Sábado")
        7 -> print("Domingo")
        else -> print("Error en el ingreso.")
    }
}