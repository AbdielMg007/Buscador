package com.mg.buscador

class productos(var objeto: String) {

    operator fun invoke(): String {
        var objeto= objeto
        var precio: String

        precio = stock(objeto)
        return precio
    }

    fun stock(objeto: String):String{

        var preciodvd = "No esta en la lista"
        var objetodvd = objeto

        var palabra = Array(2) { arrayOfNulls<String>(8) }
        palabra[0][0] = "pelota"
        palabra[1][0] = "$25.50"
        palabra[0][1] = "sombrero"
        palabra[1][1] = "$120.00"
        palabra[0][2] = "celular"
        palabra[1][2] = "$7999.99"
        palabra[0][3] = "patineta"
        palabra[1][3] = "$1000.00"
        palabra[0][4] = "mochila"
        palabra[1][4] = "$530.05"
        palabra[0][5] = "peluche"
        palabra[1][5] = "$80.00"
        palabra[0][6] = "audifonos"
        palabra[1][6] = "$500.00"
        palabra[0][7] = "tenis"
        palabra[1][7] = "fosfo fosfo"

        for (i in 0 until 8) {
            if(objetodvd == palabra[0][i].toString()){
                preciodvd = palabra[1][i].toString()
            }

        }

        return preciodvd
    }

}