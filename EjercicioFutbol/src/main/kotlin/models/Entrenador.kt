package karrasmil80.models

import karrasmil80.models.EquipoFutbol

/**
 * @param nombre Nombre del entrenador
 * @param apellidos Apellidos del entrenador
 * @param añosExperiencia Tiempo en el oficio del entrenador
 */

//Clase entrenador que hereda el comportamiento entrenar
class Entrenador (nombre : String, apellidos: String, añosExperiencia : Int) : EquipoFutbol() {

    fun añosExperiencia( añosExperiencia : Int ) {
        println("Tengo $añosExperiencia años de experiencia como entrenador " )
    }
    override fun entrenar() {
        println("Estoy entrenando como entrenador")
    }
}

