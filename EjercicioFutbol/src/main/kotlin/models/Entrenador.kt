package org.example.models

import karrasmil80.models.EquipoFutbol
//Clase entrenador que hereda el comportamiento entrenar
class Entrenador (nombre : String, apellidos: String, añosExperiencia : Int) : EquipoFutbol() {

    fun añosExperiencia( añosExperiencia : Int ) {
        println("Tengo $añosExperiencia años de experiencia como entrenador " )
    }
    override fun entrenar() {
        println("Estoy entrenando como entrenador")
    }
}

