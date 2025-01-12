package karrasmil80.models

import karrasmil80.models.Jugador

/**
 * Clase hijo de Jugador
 * @param dorsal Dorsal que identifica al jugador
 */

class JugadorCentro (dorsal : Int) : Jugador(dorsal) , Idistribuir, Idefender, Iparar, Imarcar {

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

    //Comportamiento defender
    override fun defender() {
        println("Estoy jugando como defensa siendo jugador centro campista ")
    }

    //Comportamiento marcar
    override fun marcar() {
        println("Estoy jugando como delantero como jugador centro campista ")
    }

    //Comportamiento parar
    override fun parar() {
        println("Estoy jugando como portero como jugador centro campista ")
    }

}