package karrasmil80.models

import org.example.models.Jugador

//Clase hijo de Jugador
class JugadorCentro (dorsal : Int) : Jugador(dorsal) , Idistribuir {

    //Comportamiento entrenar
    override fun entrenar() {
        println("Estoy entrenando como jugador centro campista")
    }

    //Comportamiento distribuir
    override fun distribuir() {
        println("Estoy distribuyendo como jugador centro campista ")
    }

    //Comportamiento jugar
    override fun jugar() {
        println("Estoy jugando como jugador centro campista ")
    }

}