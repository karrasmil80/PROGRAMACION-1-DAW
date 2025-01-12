package org.example

import karrasmil80.models.JugadorCentro
import karrasmil80.models.JugadorDefensa
import karrasmil80.models.JugadorDelantero
import karrasmil80.models.JugadorPortero
import org.example.models.Entrenador

fun main() {

    /**
     * @param entrenador referencia a la clase Entrenador
     * @param defensa referencia a la clase Defensa
     * @param centro referencia a la clase Centro
     * @param portero referencia a la clase Portero
     * @param delantero referencia a la clase Delantero
     * @author karrasmil80
     */

    val entrenador = Entrenador(nombre = "Eustaquio", apellidos = "Morales", añosExperiencia = 22)
    val defensa = JugadorDefensa(dorsal = 1)
    val centro = JugadorCentro(dorsal = 2)
    val portero = JugadorPortero(dorsal = 3)
    val delantero = JugadorDelantero(dorsal = 4)

    entrenador.entrenar()
    entrenador.añosExperiencia(añosExperiencia = 22)
    println()
    defensa.entrenar()
    defensa.defender()
    defensa.jugar()
    println()
    centro.entrenar()
    centro.distribuir()
    centro.jugar()
    println()
    portero.entrenar()
    portero.parar()
    portero.jugar()
    println()
    delantero.entrenar()
    delantero.marcar()
    delantero.jugar()
}