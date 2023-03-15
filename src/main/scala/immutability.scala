/**
  * Variables inmutables
  * 
  * Todas las variables deben de ser creadas con "val"
  * 
  * Solo se utilizan collecciones de clases inmutables, como List, Vector, Map y Set
  */

object inmutables extends App {
    val a = List("jane", "jon", "mary", "joe")
    val b = a.filter(_.startsWith("j")).map(_.capitalize)

    println(s"Lista a: $a")
    println(s"Lista b: $b")

    case class Person(firstname: String, lastname: String)
    val person1 = Person("Fidel", "Garcia")
    val person1_copy = person1.copy("Daniela", "Cebrera")

    println(s"Person1: $person1")
    println(s"Person1_copy: $person1_copy")
}