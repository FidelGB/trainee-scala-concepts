
/**
  * Uso de la librería cats para comparaciones
  */

import cats.Eq
import cats.instances.int._
import cats.instances.option._
import cats.syntax.eq._
import cats.syntax.option._

import java.util.Date
import cats.instances.long._

object cats2 extends App{
    val eqInt = Eq[Int]

    println(eqInt.eqv(1, 1))
    println(eqInt.eqv(2, 3))

    println(123 === 123)
    println(123 =!= 345)

    // println(Some(1) === None) // Error porque no son del mismo tipo
    println((Some(1): Option[Int]) === (None: Option[Int])) // Solucion al anterior, agregamos el tipo de dato

    println(Option(1) == Option.empty[Null])

    println(1.some === none[Int])
    println(1.some =!= none[Int])

    implicit val dateEq: Eq[Date] = Eq.instance[Date] {(date1, date2) => date1.getTime === date2.getTime}

    val x = new Date()
    val y = new Date()

    println(x===x)
    println(x === y)

    final case class Cat(name: String, age: Int, color: String)

    implicit val catEq = Eq.instance[Cat] {(cat1, cat2) => 
        cat1.name === cat2.name && cat1.color === cat2.color && cat1.age === cat2.age    
    }

    val cat1 = Cat("Garfield",   38, "orange and black")
    val cat2 = Cat("Heathcliff", 33, "orange and black")

    println(cat1 === cat2)
    println(cat1 =!= cat2)

    val optionCat1 = Option(cat1)
    val optionCat2 = Option.empty[Cat]

    println(optionCat1 === optionCat2)
    println(optionCat1 =!= optionCat2)

}
