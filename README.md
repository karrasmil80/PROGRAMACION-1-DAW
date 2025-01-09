### **PROGRAMACION-1-DAW**
## **Repositorio de Programación Orientada a Objetos**  
# **Introducción**  

La Programación Orientada a Objetos (POO) es un paradigma que organiza el código en torno a objetos que representan entidades con propiedades (atributos) y comportamientos (métodos). Este enfoque permite crear software más modular, reutilizable y fácil de mantener.

**Conceptos básicos**
- Herencia: Permite crear nuevas clases basadas en clases existentes, compartiendo y extendiendo su funcionalidad.
- Cohesión: Mide cuán relacionados están los elementos dentro de un módulo. Alta cohesión implica código bien organizado.
- Abstracción: Oculta detalles complejos y expone solo lo esencial.
- Polimorfismo: La habilidad de un objeto para tomar diferentes formas, según el contexto.
- Acoplamiento: Nivel de dependencia entre componentes. Bajo acoplamiento facilita la modificación.
- Encapsulamiento: Restringe el acceso directo a los detalles internos de un objeto, proporcionando una interfaz controlada.
- Ocultación: Define qué elementos son accesibles (públicos) y cuáles están restringidos (privados).

**Objetos**
Un objeto se define como una entidad con:  
- Estado: Representado por atributos.
- Comportamiento: Representado por métodos.
- Identidad: Unicidad del objeto.
- Mensajes: Los objetos se comunican mediante métodos, formando una interfaz que define las partes visibles del objeto.

**Clases**
Una clase es un modelo o plantilla para crear objetos. Define:
- Estado: A través de propiedades.
- Comportamiento: A través de métodos.
Ejemplo en Kotlin:

```Kotlin
class Persona(val nombre: String, var edad: Int) {
    fun saludar() {
        println("Hola, soy \$nombre y tengo \$edad años.")
    }
}
```

**Propiedades y Métodos**
- Propiedades: Describen el estado del objeto.
- Métodos: Definen su comportamiento.
- Accesibilidad: Controlada con modificadores públicos, privados o protegidos.

**Constructores**
- Primario: Declarado en la cabecera de la clase.
- Secundario: Definido en el cuerpo de la clase.
Ejemplo en Kotlin:
```kotlin
class Persona(val nombre: String) {
    var edad: Int = 0
    constructor(nombre: String, edad: Int) : this(nombre) {
        this.edad = edad
    }
}
```
**Referencia this**  
Permite referirse al objeto actual, accediendo a sus miembros.
Ejemplo:
```kotlin
class Persona(val nombre: String) {
    fun presentarse() {
        println("Hola, soy \${this.nombre}.")
    }
}
```

**Getters y Setters**
- Getters: Recuperan el valor de una propiedad.
- Setters: Modifican el valor de una propiedad.
Ejemplo en Kotlin:
```kotlin
class Persona {
    var edad: Int = 0
        get() = field
        set(value) {
            field = if (value >= 0) value else 0
        }
}
```
**Igualdad e Identidad en Kotlin**
- Igualdad (==): Compara contenido usando equals.
- Identidad (===): Compara referencias de objetos.
Ejemplo en Kotlin
```kotlin
val a = Persona("Juan", 30)
val b = Persona("Juan", 30)
println(a == b)  // true (contenido)
println(a === b) // false (referencias)
```
**Clases de Datos en Kotlin**
Las Data Classes son ideales para almacenar datos y ofrecen implementaciones automáticas de:
equals(), hashCode(), toString() y copy(): 
Ejemplo en Kotlin
```kotlin
data class Persona(val nombre: String, val edad: Int)

Inmutabilidad y Copia de Objetos
Inmutabilidad: Las propiedades no cambian después de inicializadas.
Copia: Uso de copy para crear un nuevo objeto con variaciones.
Ejemplo:
val persona1 = Persona("Ana", 25)
val persona2 = persona1.copy(edad = 26)
```
**Desestructuración de Objetos**
Proceso de descomponer un objeto en sus propiedades individuales usando componentN.
Ejemplo en Kotlin
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
**Override**
Reemplaza métodos o propiedades heredados.
Ejemplo en Kotlin
```kotlin
open class Animal {
    open fun sonido() = println("Sonido genérico")
}

class Perro : Animal() {
    override fun sonido() = println("Ladrido")
}
```
**Enum Classes**
Definen conjuntos de constantes predefinidas.
Ejemplo en Kotlin
```kotlin
enum class Dia { LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES }
```

**CRUD: Operaciones Básicas**
- Create: Crear registros.
- Read: Leer registros.
- Update: Actualizar registros.
- Delete: Eliminar registros.
