package karrasmil80.models

import karrasmil80.models.EquipoFutbol

/**
 * Jugador se define como abstract class debido a que es la clase padre de Jugador defensa, portero, delantero y centro. Estos podrán heredar su comportamiento
 * @param dorsal Dorsal que identifica al jugador
 */

abstract class Jugador (val dorsal : Int) : EquipoFutbol() {

    //sobreescritura de la funcion entrenar definida en la abstract class EquipoFutbol
    override fun entrenar() {
        println("Estoy entrenando como jugador")
    }
    abstract fun jugar()
}
