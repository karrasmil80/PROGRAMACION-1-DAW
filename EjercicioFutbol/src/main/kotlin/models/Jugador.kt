package org.example.models

import karrasmil80.models.EquipoFutbol

//Jugador se defino como abstract class debido a que es la clase padre de Jugador defensa, portero, delantero y centro y estos podran heredar su comportamiento
abstract class Jugador (val dorsal : Int) : EquipoFutbol() {

    //sobreescritura de la funcion entrenar definida en la abstract class EquipoFutbol
    override fun entrenar() {
        println("Estoy entrenando como jugador")
    }
    abstract fun jugar()
}
