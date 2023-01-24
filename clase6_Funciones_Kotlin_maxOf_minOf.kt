// Calse #6 | Funciones Kotlin - maxOf() - minOf()

fun main() {
    val a = 4
    val b = 9
    val c = 7
    println("\nEl mayor de los tres es ${maxOf(a, b, c)}.")
    min(a,b,c)
}

fun min(val1: Int,  val2: Int, val3: Int) {
    println("El menor de los tres es ${minOf(val1, val2, val3)}.")
}