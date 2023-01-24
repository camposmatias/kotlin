// Clase #6 | Funciones Anidadas - Mostrar mayor

fun mostrarMayor() {
    fun numeroMayor (x1: Int, x2: Int): Int {
        if (x1 > x2){
            return x1
        } else {
            return x2
        }
    }
    print("\nIngrese un primer valor numérico entero ->: ")
    val valor1 = readLine()!!.toInt()
    print("Ingrese un segundo valor numérico entero ->: ")
    val valor2 = readLine()!!.toInt()
    println("\nEl número ingresado de mayor valor es: ${numeroMayor(valor1, valor2)}")
}
fun main() {
    mostrarMayor()
}
