### **PROGRAMACION-1-DAW**
## **Repositorio de Programación Orientada a Objetos**  
# **Introducción**  

La Programación Orientada a Objetos (POO) es un paradigma que organiza el código en torno a objetos que representan entidades con propiedades (atributos) y comportamientos (métodos). Este enfoque permite crear software más modular, reutilizable y fácil de mantener.

## **Conceptos básicos**  
- Herencia: Permite crear nuevas clases basadas en clases existentes, compartiendo y extendiendo su funcionalidad.
- Cohesión: Mide cuán relacionados están los elementos dentro de un módulo. Alta cohesión implica código bien organizado.
- Abstracción: Oculta detalles complejos y expone solo lo esencial.
- Polimorfismo: La habilidad de un objeto para tomar diferentes formas, según el contexto.
- Acoplamiento: Nivel de dependencia entre componentes. Bajo acoplamiento facilita la modificación.
- Encapsulamiento: Restringe el acceso directo a los detalles internos de un objeto, proporcionando una interfaz controlada.
- Ocultación: Define qué elementos son accesibles (públicos) y cuáles están restringidos (privados).

## **Objetos**  
Un objeto se define como una entidad con:  
- Estado: Representado por atributos.
- Comportamiento: Representado por métodos.
- Identidad: Unicidad del objeto.
- Mensajes: Los objetos se comunican mediante métodos, formando una interfaz que define las partes visibles del objeto.

## **Clases**  
Una clase es un modelo o plantilla para crear objetos. Define:
- Estado: A través de propiedades.
- Comportamiento: A través de métodos.
```Kotlin
class Persona(val nombre: String, var edad: Int) {
    fun saludar() {
        println("Hola, soy \$nombre y tengo \$edad años.")
    }
}
```

## **Propiedades y Métodos**  
- Propiedades: Describen el estado del objeto.
- Métodos: Definen su comportamiento.
- Accesibilidad: Controlada con modificadores públicos, privados o protegidos.

## **Constructores**  
- Primario: Declarado en la cabecera de la clase.
- Secundario: Definido en el cuerpo de la clase.
```kotlin
class Persona(val nombre: String) {
    var edad: Int = 0
    constructor(nombre: String, edad: Int) : this(nombre) {
        this.edad = edad
    }
}
```
## **Referencia this**  
Permite referirse al objeto actual, accediendo a sus miembros.
```kotlin
class Persona(val nombre: String) {
    fun presentarse() {
        println("Hola, soy \${this.nombre}.")
    }
}
```

## **Getters y Setters**  
- Getters: Recuperan el valor de una propiedad.
- Setters: Modifican el valor de una propiedad.
```kotlin
class Persona {
    var edad: Int = 0
        get() = field
        set(value) {
            field = if (value >= 0) value else 0
        }
}
```
## **Igualdad e Identidad en Kotlin**  
- Igualdad (==): Compara contenido usando equals.
- Identidad (===): Compara referencias de objetos.
```kotlin
val a = Persona("Juan", 30)
val b = Persona("Juan", 30)
println(a == b)  // true (contenido)
println(a === b) // false (referencias)
```
## **Data classes: POJOS y POKOS**  
Los POJOS (Plain Old Java Objects) son objetos simples que no tienen lógica de negocio en Java. Los POKOS (Plain Old Kotlin Objects) son objetos simples que no tienen lógica de negocio en Kotlin. En Kotlin, los POJOS y POKOS se definen como clases de datos.

Las data classes tienen los siguientes miembros:

- Estado del objeto con el constructor primario con los parámetros que se pasan al constructor y definen su estado fundamental.
- Propiedades deberían ser inmutables para cada parámetro del constructor primario.
- Método equals: compara el contenido de los objetos.
- Método hashCode: calcula el hash del objeto. Se utiliza para comparar objetos, pues dos objetos con el mismo hash son iguales.
- Método toString: devuelve una cadena con el nombre de la clase y los valores de los atributos.
```kotlin
// Definiendo una clase de persona como data class
data class Persona(val nombre: String, val apellidos: String, var experiencia: Int)

val persona1 = Persona("Juan", "Pérez", 99)
println(persona1) // Persona(nombre=Juan, apellidos=Pérez, experiencia=99)
println(persona1.nombre) // Juan

val persona2 = persona1.copy(nombre = "Pepe")
println(persona2) // Persona(nombre=Pepe, apellidos=Pérez, experiencia=99)

val persona3 = persona1.copy()
println(persona3) // Persona(nombre=Juan, apellidos=Pérez, experiencia=99)

println(persona1 == persona2) // false
println(persona1 == persona3) // true
println(persona1 === persona2) // false
println(persona1 === persona3) // false
println(persona1.hashCode() == persona2.hasCode()) // false
println(persona1.hashCode() == persona3.hasCode()) // true
```

## **Excepciones**  
Son errores que ocurren durante la ejecución de un programa. Se utilizan para manejar errores y situaciones excepcionales.
En Kotlin, las excepciones se manejan con:

- try: Ejecuta el código que puede lanzar una excepción.
- catch: Captura y maneja la excepción.
- finally: Ejecuta código que se debe ejecutar siempre, sin importar si hubo una excepción o no.
```kotlin
// Ejemplo de try catch finally
try {
    // Código que puede lanzar una excepción
    val resultado = 10 / 0
} catch (e: Exception) {
    // Captura la excepción y la maneja
    println("Ha ocurrido un error: ${e.message}")
} finally {
    // Código que se ejecuta siempre
    println("Código que se ejecuta siempre")
}
```

## **Requerir**  
Kotlin hace uso de require para lanzar excepciones personalizadas para los argumentos de una función u otras cosas que queramos comprobar que vayan por argumento
```kotlin
// Lanzar una excepción personalizada, el argumento b no puede ser cero
fun dividir(a: Int, b: Int): Int {
    require(b != 0) { "No se puede dividir por cero" }
    return a / b
}
```

## **Chequear**  
Para este tipo de situaciones, Kotlin nos ofrece la función check que lanza una excepción del tipo IllegalStateException si la condición no se cumple.
```kotlin
// Clase Persona
class Persona {
    var nombre: String = ""
    var apellidos: String = ""
    private var _maxEnergy: Int = 99

    fun programar(lenguaje: String) {
        println("Programando en $lenguaje")
    }
    private fun dormir() {
        println("Durmiendo...")
    }
    
    // Campos calculados
    val nombreCompleto: String
        get() = "$nombre $apellidos"

    // Campos con almacenamiento personalizado
    var maxEnergy: Int
        get() = _maxEnergy
        set(value) {
            check(value >= 0) { "La energía no puede ser negativa" }
            _maxEnergy = value
        }
}
```

## **Desestructuración de Objetos**  
Proceso de descomponer un objeto en sus propiedades individuales usando componentN.
```kotlin
val (nombre, edad) = Persona("Luis", 20)

Excepciones: Try-Catch
Maneja errores de ejecución.
Ejemplo:
try {
    val resultado = 10 / 0
} catch (e: ArithmeticException) {
    println("Error: \${e.message}")
}
```
## **Override**  
Reemplaza métodos o propiedades heredados.
```kotlin
open class Animal {
    open fun sonido() = println("Sonido genérico")
}

class Perro : Animal() {
    override fun sonido() = println("Ladrido")
}
```
## **Enum Classes**  
Definen conjuntos de constantes predefinidas.
```kotlin
enum class Dia { LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES }
```
## **Paquetes y visibilidad** 
En Kotlin, los paquetes son un mecanismo para organizar el código fuente. Los paquetes se definen con la palabra reservada package.
```kotlin
// Definimos un paquete
package dev.karrasmil80

// Definimos una clase
class Persona(val nombre: String, val apellidos: String)
```  
```kotlin
// importamos una clase
import com.joseluisgs.Persona

// importamos todas las clases de un paquete
import com.joseluisgs.*
```
## **Alias**  
Podemos usar alias para importar clases de otros paquetes. Esto es útil cuando tenemos clases con el mismo nombre en diferentes paquetes.
```kotlin
// importamos una clase con alias
import com.joseluisgs.Persona as PersonaJoseluisgs
import com.joseluisgs.Persona as PersonaJoseluisgs2
```
## **Visibilidad**  
En Kotlin, podemos definir la visibilidad de las clases, funciones y propiedades. Por defecto, las clases, funciones y propiedades son públicas.
- public: Puede ser accedido desde cualquier lugar.
- private: Solo puede ser accedido desde la clase que lo define.
- internal: Solo puede ser accedido desde el mismo módulo/Paquete.
- protected: Solo puede ser accedido desde la clase que lo define y sus subclases.
  
## **CRUD: Operaciones Básicas**
- Create: Crear registros.
- Read: Leer registros.
- Update: Actualizar registros.
- Delete: Eliminar registros.

## **Herencia en Kotlin**  
Herencia: Permite crear nuevas clases a partir de clases existentes, conservando las propiedades de la clase original e incorporando otras nuevas.
- Clase derivada (hija): La nueva clase obtenida.
- Clase base (padre): La clase a partir de la cual se crea la clase derivada.

**Ventajas:**  
- Cada vez que se crea un objeto derivado, se crea un solo objeto que contiene toda la información heredada.
- El programa será más flexible a cambios y ampliaciones.

**Puntos a tener en cuenta:**    

- Clases/Métodos abiertos o cerrados:
- Clases cerradas no pueden ser heredadas.
- Clases/Métodos abstractos o concretos:
- Clases abstractas no pueden ser instanciadas.
  
## **Mas cosas sobre la Herencia**  
- Métodos abstractos no tienen implementación y deben ser implementados en las clases derivadas.
- Palabra reservada open: Las clases y métodos son cerrados por defecto y deben ser marcados como open para permitir la herencia.
- Palabra reservada override: Para sobrescribir métodos de la clase padre.
- Palabra reservada super: Para acceder a los métodos de la clase padre.
- Constructores: Definen el estado propio no heredado de la clase, llamando al constructor de la clase base con el estado necesario.

```kotlin
open class Animal(val name: String) {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks")
    }
}

fun main() {
    val dog = Dog("Fido")
    dog.makeSound()  // Output: Fido barks
}
```
## **Singleton**  
El patrón singleton es un patrón de diseño que nos permite tener una única instancia de una clase. Por mucho que instanciamos un objeto, siempre nos devolverá la instancia original.
```kotlin
// Sin object es una clase normal con constructor privado y instancia pública de clase
class Persona private constructor(val nombre: String, val apellidos: String) {
    companion object {
        private var persona: Persona? = null
        fun getInstance(nombre: String, apellidos: String): Persona {
            if (persona == null) {
                persona = Persona(nombre, apellidos)
            }
            return persona!!
        }
    }
}

fun main() {
    val persona1 = Persona.getInstance("Pepe", "Perez")
    val persona2 = Persona.getInstance("Juan", "García")
    println(persona1) // Persona(nombre=Pepe, apellidos=Perez)
    println(persona2) // Persona(nombre=Pepe, apellidos=Perez)
}
```
```kotlin
// Con object
object Persona {
    var nombre: String = ""
    var apellidos: String = ""
}

fun main() {
    Persona.nombre = "Pepe"
    Persona.apellidos = "Perez"
    println(Persona) // Persona(nombre=Pepe, apellidos=Perez)
}
```
## **Factory**  
El patrón factory es un patrón de diseño que nos permite crear objetos de una clase sin tener que conocer la clase que los crea o poder especificar casos concretos. 
```kotlin
// Ejemplo de clase con factory
class Persona(val nombre: String, val apellidos: String) {

    enum class Sexo {
        HOMBRE, MUJER, OTRO
    }

    companion object {
        fun createHombre(nombre: String, apellidos: String): Persona {
            return Persona(nombre, apellidos, Sexo.HOMBRE)
        }

        fun createMujer(nombre: String, apellidos: String): Persona {
            return Persona(nombre, apellidos, Sexo.MUJER)
        }

        fun create(nombre: String, apellidos: String): Persona {
            return Persona(nombre, apellidos, Sexo.OTRO)
        }
    }
}

fun main() {
    val persona1 = Persona.createHombre("Pepe", "Perez")
    val persona2 = Persona.createMujer("Juan", "García")
    val persona3 = Persona.create("Ana", "García")
    println(persona1) // Persona(nombre=Pepe, apellidos=Perez, sexo=HOMBRE)
    println(persona2) // Persona(nombre=Juan, apellidos=García, sexo=MUJER)
    println(persona3) // Persona(nombre=Ana, apellidos=García, sexo=OTRO)
}
```

## **Polimorfismo**
Polimorfismo: Es la capacidad de referirse a un objeto de una superclase de varias formas diferentes, cada una con un comportamiento específico.

- Vinculación (Binding): Relación entre la llamada a un método y el código ejecutado.
- Vinculación temprana: Conocida en tiempo de compilación (sobrecarga).
- Vinculación tardía: Conocida en tiempo de ejecución (override o redefinición).

**Características:**

- Permite que el tipo de objeto determine qué método se ejecuta, no la referencia.
- No es una propiedad de los objetos, sino de las referencias.
- Una referencia de tipo padre puede asignarse a un objeto de tipo hijo, pero no al revés.
- Es recomendable hacer un casting a la clase hija si se quiere llamar a un método que no está en la clase padre.
```kotlin
open class Vehiculo(val marca: String, val modelo: String) {
    open fun arrancar() {
        println("Arrancando...")
    }

    open fun parar() {
        println("Parando...")
    }

    open fun acelerar() {
        println("Acelerando...")
    }
}

class Coche(marca: String, modelo: String, val color: String) : Vehiculo(marca, modelo) {
    override fun arrancar() {
        println("Arrancando...")
    }

    override fun parar() {
        println("Parando...")
    }

    override fun acelerar() {
        super.acelerar()
        println("Acelerando más...")
    }

    fun pintar(color: String) {
        this.color = color
    }
}

class Moto(marca: String, modelo: String, val cilindrada: Int) : Vehiculo(marca, modelo) {
    override fun arrancar() {
        println("Arrancando...")
    }

    override fun parar() {
        println("Parando...")
    }

    override fun acelerar() {
        super.acelerar()
        println("Acelerando más...")
    }
}

fun main() {
    val coche = Coche("Seat", "Ibiza", "Rojo")
    val moto = Moto("Yamaha", "MT-07", 689)

    coche.arrancar()
    coche.acelerar()
    coche.parar()
    coche.pintar("Azul")

    moto.arrancar()
    moto.acelerar()
    moto.parar()

    val vehiculos = arrayOf(coche, moto)
    for (vehiculo in vehiculos) {
        vehiculo.arrancar()
        vehiculo.acelerar()
        vehiculo.parar()
        if (vehiculo is Coche) {
            vehiculo.pintar("Verde")
        }
    }
}
```
## **Interfaces**
Las interfaces son un conjunto de métodos y variables (finales) que no estan obligadas a tener implementación. Son similares a una clase asbtracta.
```kotlin
interface Vehiculo {
    fun arrancar()
    fun parar()
    fun acelerar() {
        println("Acelerando...")
    }
}

class Coche(val marca: String, val modelo: String, val color: String) : Vehiculo {
    override fun arrancar() {
        println("Arrancando...")
    }

    override fun parar() {
        println("Parando...")
    }

    override fun acelerar() {
        println("Acelerando...")
    }

    fun pintar(color: String) {
        this.color = color
    }
}

class Moto(val marca: String, val modelo: String, val cilindrada: Int) : Vehiculo {
    override fun arrancar() {
        println("Arrancando...")
    }

    override fun parar() {
        println("Parando...")
    }

    override fun acelerar() {
        println("Acelerando...")
    }
}

fun main() {
    val coche = Coche("Seat", "Ibiza", "Rojo")
    val moto = Moto("Yamaha", "MT-07", 689)

    coche.arrancar()
    coche.acelerar()
    coche.parar()
    coche.pintar("Azul")

    moto.arrancar()
    moto.acelerar()
    moto.parar()

    val vehiculos = arrayOf(coche, moto)
    for (vehiculo in vehiculos) {
        vehiculo.arrancar()
        vehiculo.acelerar()
        vehiculo.parar()
        if (vehiculo is Coche) {
            vehiculo.pintar("Verde")
        }
    }
}
```
## **PRINCIPIOS SOLID**  

- SRP : Principio de responsabilidad única : un objeto debería de tener solo una razón para cambiar.
- OCP : Principio de abierta/cerrada : Las entidades deberían de estar abiertas para su extensión pero cerradas para la modificación
- LSP : Principio de sustitución de Liskov : Los objetos de un programa deberían de ser reemplazables por instancias de subtipos sin alterar el funcionamiento del programa.
- ISP : Principio de segregación de la interfaz : muchas interfaces cliente específicas son mejores que una general.  
- DIP : Principio de la inversión de la independencia : se debe depender de abstracciones y no de implementaciones

**SRP**
```kotlin
class Reporte {
    fun generar() {
        // Código para generar el reporte
    }

    fun imprimir() {
        // Código para imprimir el reporte
    }
}
```
Sin embargo, esto viola el principio de responsabilidad única porque la clase Reporte tiene dos razones para cambiar
Podemos refactorizar esto en dos clases, cada una con una única responsabilidad:
```kotlin
class Reporte {
    fun generar() {
        // Código para generar el reporte
    }
}

class Impresora {
    fun imprimir(reporte: Reporte) {
        // Código para imprimir el reporte
    }
}
```

**O**
```kotlin
open class Forma

class Circulo(val radio: Double) : Forma()

class Cuadrado(val lado: Double) : Forma()

fun areaTotal(formas: List<Forma>): Double {
    var area = 0.0
    for (forma in formas) {
        if (forma is Circulo) {
            area += Math.PI * Math.pow(forma.radio, 2.0)
        } else if (forma is Cuadrado) {
            area += Math.pow(forma.lado, 2.0)
        }
    }
    return area
}
```
Sin embargo, esto viola el principio abierto/cerrado porque cada vez que queremos añadir una nueva forma, tenemos que modificar la función areaTotal.
Podemos refactorizar esto para que cada Forma tenga su propio método area, y la función areaTotal simplemente sume estas áreas:
```kotlin
interface Forma {
    fun area(): Double
}

class Circulo(val radio: Double) : Forma {
    override fun area() = Math.PI * Math.pow(radio, 2.0)
}

class Cuadrado(val lado: Double) : Forma {
    override fun area() = Math.pow(lado, 2.0)
}

fun areaTotal(formas: List<Forma>) = formas.sumOf { it.area() }
```
**L**
```kotlin
open class Pajaro {
    open fun volar() {
        println("El pájaro está volando")
    }
}

class Pinguino : Pajaro() {
    override fun volar() {
        throw UnsupportedOperationException("Los pingüinos no pueden volar")
    }
}
```

Esto viola el principio de sustitución de Liskov porque aunque Pinguino es un Pajaro, no puede volar.
Podemos solucionar esto haciendo que volando sea una capacidad que solo tienen algunos pájaros:
```kotlin
interface Pajaro {
    fun moverse()
}

interface PajaroVolador : Pajaro {
    fun volar()
}

class Pinguino : Pajaro {
    override fun moverse() {
        println("El pingüino está nadando")
    }
}

class Aguila : PajaroVolador {
    override fun moverse() {
        println("El águila está caminando")
    }

    override fun volar() {
        println("El águila está volando")
    }
}
```

**I**
```kotlin
interface Impresora {
    fun imprimir()
    fun escanear()
}
```
Esto viola el principio de segregación de interfaces porque una impresora simple que no tiene capacidades de escaneo tendría que implementar el método escanear.
Podemos solucionar esto dividiendo Impresora en dos interfaces:

```kotlin
interface Impresora {
    fun imprimir()
}

interface Scaner {
    fun escanear()
}
```

**D**
```kotlin
open class MotorGasolina {
    fun encender() {
        println("Encendiendo motor de gasolina")
    }
}

open class MotorDiesel {
    fun encender() {
        println("Encendiendo motor diesel")
    }
}

open class MotorElectrico {
    fun encender() {
        println("Encendiendo motor eléctrico")
    }
}

open class MotorHibrido {
    fun encender() {
        println("Encendiendo motor híbrido")
    }
}

class Automovil {
    fun encenderMotor(motor: Any) {
        when (motor) {
            is MotorGasolina -> motor.encender()
            is MotorDiesel -> motor.encender()
            is MotorElectrico -> motor.encender()
            is MotorHibrido -> motor.encender()
        }
    }
}
```

Esto viola el principio de inversión de dependencias porque Automovil depende de las clases de bajo nivel MotorGasolina, MotorDiesel, MotorElectrico y MotorHibrido. Si quisieras agregar un nuevo tipo de motor, tendrías que cambiar la clase Automovil.

Podemos solucionar esto haciendo que Automovil dependa de una abstracción Motor:
```kotlin
interface Motor {
    fun encender()
}

class MotorGasolina : Motor {
    override fun encender() {
        println("Encendiendo motor de gasolina")
    }
}

class MotorDiesel : Motor {
    override fun encender() {
        println("Encendiendo motor diesel")
    }
}

class MotorElectrico : Motor {
    override fun encender() {
        println("Encendiendo motor eléctrico")
    }
}

class MotorHibrido : Motor {
    override fun encender() {
        println("Encendiendo motor híbrido")
    }
}

class Automovil(private val motor: Motor) {
    fun encenderMotor() {
        motor.encender()
    }
}
```
