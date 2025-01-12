package karrasmil80.models

// EquipoFutbol se define como abstract class debido a que es la clase padre de sus hijos Entrenador y Jugador y estos podran heredar su comportamiento
abstract class EquipoFutbol() {
    abstract fun entrenar()
}
