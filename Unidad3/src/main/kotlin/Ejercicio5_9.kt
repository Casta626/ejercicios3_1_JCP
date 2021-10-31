/*
Ejercicio 5.9
Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo disponible. Además, se puede consultar
el saldo disponible, recibir abonos y realizar pagos.
Crear además una clase Persona, que se caracteriza por un DNI y un vector (Preguntar al profesor si tienes dudas sobre vector) de cuentas bancarias.
La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita añadir cuentas (hasta 3 que es el máximo). También debe contener un método que devuelva si la
persona es morosa (si tienen alguna cuenta con saldo negativo).
En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta, una sin saldo inicial y otra con 700 euros.
La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la primera cuenta, pero tiene que pagar el alquiler de 750 euros con la segunda. Imprimir por pantalla si la persona es morosa.
Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos) y mostrar por pantalla el estado de la persona.
*/

//CUENTA                                    PERSONA

//num cuenta                                DNI String
//saldo disponible                          Cuentas: Array<cuenta>

//realizarAbono(abono:Float):Float     <--  esMorosa():Boolean
//realizarCargo(cargo:Float):Float          incorporarCuenta(cuenta:Cuenta):Boolean




class Cuenta(cuenta: String, saldo: Double) {
    var cuenta:String=cuenta
        get() = "Cuenta de: "+field
        set(value) {
            field = value
        }
    var saldo: Double = saldo
        get() = field
        set(value) {
            field = value
        }
    fun esMorosa() {
            if (saldo >= 0) {
                println("No es morosa")
            } else {
                println("Es morosa")
            }


    }

    fun ingresar(ingreso:Double){
        try {
            saldo=saldo+ingreso
            println("Has introducido "+ingreso+"€")
        }catch (e: Exception){
            println("Introduce un número decimal correctamente")
        }


    }
    fun retirar(retiro:Double){
        try {
            saldo=saldo-retiro
            println("Has retirado "+retiro+"€")
        }catch (e: Exception){
            println("Introduce un número decimal correctamente")
        }


    }
}


class Persona(dni: String){
    val dni:String=dni
    var cuentas: Array<Cuenta?> = arrayOfNulls<Cuenta>(2)
    val cu1=cuentas[0]
}