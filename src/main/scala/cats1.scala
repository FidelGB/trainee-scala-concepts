/**
  * Comando Show utilizando cats
  */

import cats._
import cats.Show
import cats.instances.int._
import cats.instances.string._

import cats.syntax.show._

import java.util.Date

object cats1 extends App {
  
    // Importacion de instancias predeterminadas
    val showInt: Show[Int] = Show.apply[Int]
    val showString: Show[String] = Show.apply[String]

    val intAsString: String = showInt.show(123)
    val stringAsString: String = showString.show("abc")

    println(intAsString)
    println(stringAsString)

    println("==================================================")

    // Sintaxis de la interfaz de importación
    val showIntSyntax = 123.show
    val showStringSyntax = "abc".show

    println(showIntSyntax)
    println(showStringSyntax)

    println("==============================================")

    implicit val dateShow: Show[Date] = new Show[Date]{
      def show(date: Date): String = s"${date.getTime}ms since the epoch."
    }

    println(new Date().show)

    // Ejercicio
    println("======================================================")
    final case class Cat(name: String, age: Int, color: String)
    implicit val catShow: Show[Cat] = Show.show[Cat] { cat => 
      val name = cat.name.show
      val age = cat.age.show
      val color = cat.age.show
      s"$name is a $age years old $color cat"  
    }

    println(Cat("Garfield", 11, "orange").show)
}
