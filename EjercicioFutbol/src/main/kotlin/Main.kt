package karrasmil80

import karrasmil80.models.JugadorCentro
import karrasmil80.models.JugadorDefensa
import karrasmil80.models.JugadorDelantero
import karrasmil80.models.JugadorPortero
import karrasmil80.models.Entrenador

fun main() {

    /**
     * @property entrenador referencia a la clase Entrenador
     * @property defensa referencia a la clase Defensa
     * @property centro referencia a la clase Centro
     * @property portero referencia a la clase Portero
     * @property delantero referencia a la clase Delantero
     * @param dorsal Dorsal que peternece al jugador
     *
     * @author karrasmil80
     */

    val entrenador = Entrenador(nombre = "Eustaquio", apellidos = "Morales", añosExperiencia = 22)
    val defensa = JugadorDefensa(dorsal = 1)
    val centro = JugadorCentro(dorsal = 2)
    val portero = JugadorPortero(dorsal = 3)
    val delantero = JugadorDelantero(dorsal = 4)

    //Instancia de la clase Entrenador
    entrenador.entrenar()
    entrenador.añosExperiencia(añosExperiencia = 22)

    //Instancia de la clase Defensa
    println()
    defensa.entrenar()
    defensa.defender()
    defensa.jugar()
    defensa.marcar()
    defensa.parar()
    defensa.distribuir()
    println()

    //Instancia de la clase Centro
    centro.entrenar()
    centro.distribuir()
    centro.jugar()
    centro.parar()
    centro.defender()
    centro.marcar()
    println()

    //Instancia de la clase Portero
    portero.entrenar()
    portero.parar()
    portero.jugar()
    portero.defender()
    portero.marcar()
    portero.distribuir()
    println()

    //Instancia de la clase Delantero
    delantero.entrenar()
    delantero.marcar()
    delantero.jugar()
    delantero.parar()
    delantero.defender()
    delantero.distribuir()
}