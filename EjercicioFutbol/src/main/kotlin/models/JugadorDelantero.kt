package karrasmil80.models

import karrasmil80.models.Jugador

/**
 * Clase hijo de Jugador
 * @param dorsal Dorsal que identifica al jugador
 */

class JugadorDelantero  (dorsal : Int): Jugador(dorsal) , Idistribuir, Idefender, Iparar, Imarcar  {

    //Comportamiento entrenar
    override fun entrenar() {
        println("Estoy entrenando como jugador delantero")
    }

    //Comportamiento marcar
    override fun marcar() {
        println("Estoy marcando como jugador delantero")
    }

    //Comportamiento jugar
    override fun jugar() {
        println("Estoy jugando como delantero")
    }

    //Comportamiento defender
    override fun defender() {
        println("Estoy jugando de defensa siendo delantero ")
    }

    //Comportamiento parar
    override fun parar() {
        println("Estoy jugando de portero siendo delantero ")
    }

    //Comportamiento distribuir
    override fun distribuir() {
        println("Estoy jugando de centro campista siendo jugador delantero")
    }
}