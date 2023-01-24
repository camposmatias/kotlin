fun main(args: Array<String>) {
    val edad = 70
    val sexo = "M"

    if (edad >= 60 && sexo == "M" || edad >= 65 && sexo == "H") {
        println("Usted ya está en edad de recibir una jubilación.")
    } else {
        println("Aún no puedes jubilarte.")
    }
}
