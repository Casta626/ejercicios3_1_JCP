/*
Ejercicio 5.7
Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos, el número de puertas y la matrícula.
Crear el constructor del coche, así como los métodos estándar: ¿getters, setters? y toString.
En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y vuelve a mostrarlos por pantalla.
*/

class Coche constructor (id:Int,color:String,marca:String ="",modelo:String ="",numCaballos:Int =0,numPuertas:Int =0,matricula:String =""){
    val id:Int=id
    var color:String =color
    val marca:String =marca
    val modelo:String =modelo
    val numCaballos:Int =numCaballos
    val numPuertas:Int =numPuertas
    val matricula:String =matricula
    val muestraCoches get() = "Caracteristicas del coche Nº"+id+"\n"+
            "| Color: "+color+" | Marca: "+marca+" | Modelo: "+modelo+" | Número de caballos: "+numCaballos+
            " | Número de puertas: "+numPuertas+" | Matrícula: "+matricula

    constructor():this(0,"","","",0,0,""){
        println("")
    }
}