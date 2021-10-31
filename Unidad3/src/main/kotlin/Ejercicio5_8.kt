/*
Ejercicio 5.8
Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos, sólo hora y minuto o sólo
la hora (si no se indica, el valor de minuto o segundo será 0). Crear el método toString para mostrar el tiempo en formato: XXh XXm XXs
En el programa principal, debe solicitar por teclado hora, minuto y segundo de forma que se puedan omitir los segundos o los minutos (y segundos, claro)
e instancie la clase Tiempo mostrando su valor.
*/

class Tiempo {
    var hora:Int=0
        get() = field
        set(value) {
            if(value>=0 && value<=24){
                field = value
            }else {
                "Eso no es una hora correcta"
            }
        }
    var min:Int=0
        get() = field
        set(value) {
            if (value>=0 && value<=60){
                field=value

            }else if (value==null) {
                min = 0
                seg = 0
            }
        }

    //utilizar los setters con los if para controlar cuando el valor sea nulo ya asignarle los 0
    var seg:Int=0
        get() = field
        set(value) {
            if (value>=0 && value<=60){
                field = value
            }else if (value==null) {
                seg = 0
            }
        }
    val muestraHora get()="Son las: "+hora+"h "+min+"m "+seg+"s"

}