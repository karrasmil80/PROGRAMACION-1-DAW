package karrasmil80.models

import org.example.models.Jugador

//Clase hijo de Jugador
class JugadorDefensa (dorsal : Int): Jugador(dorsal) , Idefender  {

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
}