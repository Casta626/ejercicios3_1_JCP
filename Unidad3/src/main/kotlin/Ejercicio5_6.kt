/*
Ejercicio 5.6
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el área y el perímetro.
Opcionalmente se puede crear el método toString para mostrar información sobre el rectángulo.
En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.
 */

class Rectangulo(var base:Int , var altura:Int){
    val area get() = this.base*this.altura
    val perimetro get() = this.base+this.altura
}