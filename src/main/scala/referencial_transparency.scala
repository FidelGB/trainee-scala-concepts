/**
  * Funciones transparentemente referenciadas
  * 
  * Se le llaman funciones transparentes a aquellas que no alteran el estado de la aplicación
  * y provocando que en multiples llamadas a la funcion con los mismo parametros, retorne 
  * resultados distintos
  */

object referencial_transparency extends App {

    var x = 1

    def nonTransparentFunction(number: Integer): Integer = {
        x = x + number
        return x
    }

    println(s"Primera llamada a funcion no transparente: ${nonTransparentFunction(1)}")
    println(s"Segunda llamada a funcion no transparente: ${nonTransparentFunction(1)}")
    println(s"Tercera llamada a funcion no transparente: ${nonTransparentFunction(1)}")
    println(s"Cuarta llamada a funcion no transparente: ${nonTransparentFunction(1)}")

    x = 1
    def transparentFunction(number: Integer): Integer ={
        return x + number
    }

    println(s"Primera llamada a funcion transparente: ${transparentFunction(1)}")
    println(s"Segunda llamada a funcion transparente: ${transparentFunction(1)}")
    println(s"Tercera llamada a funcion transparente: ${transparentFunction(1)}")
    println(s"Cuarta llamada a funcion transparente: ${transparentFunction(1)}")
}
