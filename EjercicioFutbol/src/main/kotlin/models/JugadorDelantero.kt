package karrasmil80.models

import org.example.models.Jugador

//Clase hijo de Jugador
class JugadorDelantero  (dorsal : Int): Jugador(dorsal) , Imarcar  {

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
}