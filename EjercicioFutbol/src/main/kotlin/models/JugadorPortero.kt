package karrasmil80.models

import org.example.models.Jugador

//Clase hijo de Jugador
class JugadorPortero (dorsal: Int) : Jugador(dorsal) , Iparar {

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
}
