fun main(args: Array<String>) {

    val reset = "\u001B[0m"
    val rojo = "\u001B[31m"
    val azul = "\u001B[34m"
    val cian = "\u001B[36m"
    val verde = "\u001B[32m"
    val amarillo = "\u001B[33m"
    val purpura = "\u001B[35m"

    val r1=Rectangulo(2,4)
    val r2=Rectangulo(3,5)
    val r3=Rectangulo(6,8)

    println(verde+"El Área del Rectangulo Nº1 es de "+r1.area+"u² y su Perímetro es de "+r1.perimetro+"u")
    println("El Área del Rectangulo Nº2 es de "+r2.area+"u² y su Perímetro es de "+r2.perimetro+"u")
    println("El Área del Rectangulo Nº3 es de "+r3.area+"u² y su Perímetro es de "+r3.perimetro+"u")

    println("")
    println("")
    println("")

    val c1:Coche=Coche(1,"rojo", "Renault", "Clio", 91, 5, "1231-ACV")
    var c2:Coche=Coche(2,"negro", "Mercedes", "Benz", 116, 5, "7070-DIO")
    var c3:Coche=Coche(3,"blanco", "Opel", "Corsa", 75, 5, "6226-SBR")
    println(azul+c1.muestraCoches)
    println(c2.muestraCoches)
    println(c3.muestraCoches)
    println("")
    println("Cambia el color del coche Nº"+c2.id+" por el que quieras, escribelo a continuación:")
    val cambiaColorC2:String = readLine().toString()
    c2.color=cambiaColorC2
    println(c2.muestraCoches)
    println("")
    println("Cambia el color del coche Nº"+c3.id+" por el que quieras, escribelo a continuación:")
    val cambiaColorC3:String = readLine().toString()
    c3.color=cambiaColorC3
    println(c3.muestraCoches)

    println("")
    println("")
    println("")

    val tiempo:Tiempo=Tiempo()
    println(cian+"Escribe la hora:")
    val h:Int= readLine()!!.toInt()
    tiempo.hora=h
    println("Escribe los minutos:")
    val m:Int= readLine()!!.toInt()
    tiempo.min=m
    println("Escribe los segundos:")
    val s:Int= readLine()!!.toInt()
    tiempo.seg=s
    println(tiempo.muestraHora)

    println("")
    println("")
    println("")

    val p1:Persona=Persona("12345678A")
    val p2:Persona=Persona("87654321B")
    val p3:Persona=Persona("28643719C")
    val p4:Persona=Persona("70745000J")
    val cuentas: Array<Cuenta> = arrayOf(Cuenta("ana", -522.50), Cuenta("juan", 0.0), Cuenta("carlos", 750.24), Cuenta("maria", 1500.65))
    val cu1=cuentas[0]
    val cu2=cuentas[1]
    val cu3=cuentas[2]
    val cu4=cuentas[3]

    println(purpura+cu1.cuenta)
    println("Tu saldo actual es de "+cu1.saldo)
    cu1.ingresar(1100.0)
    println("Tu saldo actual es de "+cu1.saldo)
    cu1.retirar(750.0)
    println("Tu saldo actual es de "+cu1.saldo)
    cu1.esMorosa()

    println("")

    println(cu2.cuenta)
    println("Tu saldo actual es de "+cu2.saldo)
    cu2.ingresar(1100.0)
    println("Tu saldo actual es de "+cu2.saldo)
    cu2.retirar(750.0)
    println("Tu saldo actual es de "+cu2.saldo)
    cu2.esMorosa()

    println("")

    println(cu3.cuenta)
    println("Tu saldo actual es de "+cu3.saldo)
    cu3.ingresar(1100.0)
    println("Tu saldo actual es de "+cu3.saldo)
    cu3.retirar(750.0)
    println("Tu saldo actual es de "+cu3.saldo)
    cu3.esMorosa()

    println("")

    println(cu4.cuenta)
    println("Tu saldo actual es de "+cu4.saldo)
    cu4.ingresar(1100.0)
    println("Tu saldo actual es de "+cu4.saldo)
    cu4.retirar(750.0)
    println("Tu saldo actual es de "+cu4.saldo)
    cu4.esMorosa()

    println("")
    println("")
    println("")


    val l1:Libro=Libro("Hamlet","William Shakespeare",720,8)
    val l2:Libro=Libro("Romeo y Julieta","William Shakespeare",160,7)
    val l3:Libro=Libro("Hamlet","William Shakespeare",720,8)
    println(amarillo+"Libros: ")
    l1.mostrarDatosLibro()
    l2.mostrarDatosLibro()
    l3.mostrarDatosLibro()
    println("")
    println("Añade un nuevo libro:")
    println("Escribe con el titulo")
    val tit:String= readLine().toString()
    println("Escribe el autor:")
    val aut:String= readLine().toString()
    println("Escribe el nº de páginas que tiene:")
    val npag:Int= readLine()!!.toInt()
    println("Escribe la calificación que ha tenido")
    val cali:Int= readLine()!!.toInt()
    val l4:Libro=Libro(tit,aut,npag,cali)
    l4.mostrarDatosLibro()
    val conjunto1:ConjuntoLibros=ConjuntoLibros(l1)


}