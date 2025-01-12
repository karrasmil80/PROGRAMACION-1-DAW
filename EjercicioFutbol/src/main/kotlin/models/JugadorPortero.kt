package karrasmil80.models

import karrasmil80.models.Jugador

/**
 * Clase hijo de Jugador
 * @param dorsal Dorsal que identifica al jugador
 */

class JugadorPortero (dorsal: Int) : Jugador(dorsal) , Idistribuir, Idefender, Iparar, Imarcar {

    //Comportamiento entrenar
    override fun entrenar() {
        println("Estoy entrenando como jugador portero")
    }

    //Comportamiento parar
    override fun parar() {
        println("Estoy parando como jugador portero")
    }

    //Comportamiento jugar
    override fun jugar() {
        println("Estoy jugando como jugador portero ")
    }

    //Comportamiento defender
    override fun defender() {
        println("Estoy jugando de defensa siendo portero ")
    }

    //Comportamiento marcar
    override fun marcar() {
        println("Estoy jugando de delantero siendo portero ")
    }

    //Comportamiento distribuir
    override fun distribuir() {
        println("Estoy jugando de centro campista siendo portero ")
    }


}
