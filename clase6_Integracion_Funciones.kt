// Clase #6 | Funciones - Integración

val nombreBot = "@matiBot"


fun main() {
    saludar1()
    listaSecciones()
    listaDetalles()
}

fun saludar1(){
    println("\nBienvenido a tus lecciones interactivas de Kotlin. Mi nombre es: $nombreBot.\n ¿Cómo te llamas?")
    val nombreUsuario = readLine()!!.toString()
    println("\nHola $nombreUsuario. Estoy para ayudarte a aprender el lenguaje Koltin.")
    println("\nElige la sección que deseas aprender: \n")
}

fun listaSecciones() {
    println("[1] Aprende sobre instalación del IDE.")
    println("[2] Aprende sobre Variables y Operadores aritméticos básicos.")
    println("[3] Aprende sobre Operadores Relacionales, lógicos y condicionales.")
    println("[4] Aprende sobre When.")
    println("[5] Aprende sobre Bucles.")
    println("[6] Aprende sobre Funciones.")
    println("[7] Aprende sobre Arreglos.")
    println("[8] Aprende sobre Listas.")
    println("[9] Aprende sobre POO.")
    println("[10] Aprende sobre .xml.")
}

fun listaDetalles() {
    var opcion_elegida = readLine()!!.toInt()
    while (opcion_elegida != 0) {
        when(opcion_elegida) {

            1 -> {println("Bienvenido a la Sección sobre la instalación del IDE..")
                opcion_elegida = 0}
            2 -> {println("Bienvenido a la Sección sobre Variables y Operadores aritméticos básicos.")
                opcion_elegida = 0}
            3 -> {println("Bienvenido a la Sección sobre Operadores Relacionales, lógicos y condicionales.")
                opcion_elegida = 0}
            4 -> {println("Bienvenido a la Sección sobre When.")
                opcion_elegida = 0}
            5 -> {println("Bienvenido a la Sección sobre Bucles.")
                opcion_elegida = 0}
            6 -> {println("Bienvenido a la Sección sobre Funciones.")
                opcion_elegida = 0}
            7 -> {println("Bienvenido a la Sección sobre Arreglos.")
                opcion_elegida = 0}
            8 -> {println("Bienvenido a la Sección sobre Listas.")
                opcion_elegida = 0}
            9 -> {println("Bienvenido a la Sección sobre POO")
                opcion_elegida = 0}
            10 -> {println("Bienvenido a la Sección sobre .xml")
                opcion_elegida = 0}

            else -> {
                println("Ingresa un opción válida: ")
                println("[1] Aprende sobre instalación del IDE.")
                println("[2] Aprende sobre Variables y Operadores aritméticos básicos.")
                println("[3] Aprende sobre Operadores Relacionales, lógicos y condicionales.")
                println("[4] Aprende sobre When.")
                println("[5] Aprende sobre Bucles.")
                println("[6] Aprende sobre Funciones.")
                println("[7] Aprende sobre Arreglos.")
                println("[8] Aprende sobre Listas.")
                println("[9] Aprende sobre POO.")
                println("[10] Aprende sobre .xml.")
                opcion_elegida = readLine()!!.toInt()
            }
        }

    }
}