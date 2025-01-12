package karrasmil80.models

import karrasmil80.models.Jugador

/**
 * Clase hijo de Jugador
 * @param dorsal Dorsal que identifica al jugador
 */

class JugadorDefensa (dorsal : Int): Jugador(dorsal) , Idistribuir, Idefender, Iparar, Imarcar  {

    //Comportamiento entrenar
    override fun entrenar() {
        println("Estoy entrenando como jugador defensa")
    }

    //Comportamiento defender
    override fun defender() {
        println("Estoy defendiendo como jugador defensa")
    }
    //Comportamiento jugar
    override fun jugar() {
        println("Estoy jugando como jugador defensa")
    }

    //Comportamiento marcar
    override fun marcar() {
        println("Estoy jugando de delantero siendo defensa ")
    }

    //Comportamiento parar
    override fun parar() {
        println("Estoy jugando de portero siendo defensa ")
    }

    //Comportamiento distribuir
    override fun distribuir() {
        println("Estoy jugando de centro campista siendo jugador defensa ")
    }

}