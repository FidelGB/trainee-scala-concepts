/**
  * For Comprension
  * 
  * La estructura for es una funcion ciclica que recorre cada uno de los 
  * elementos de un objeto que contenga multiples datos almacenados (listas, arrays, etc)
  * 
  * La sentencia for puede ser utilizada en conjunto a un if para solo recorrer
  * los elementos que cumplan una condición
  * 
  * Finalmente el for puede filtrar elementos y almacenarlos en una variable tipo lista
  * si al final de este se le agrega la instrucción "yield" seguido por el dato
  * a almacenar
  */

object forComprension extends App{
  case class User(name: String, age: Int)

  val userBase = List(
    User("Travis", 28),
    User("Kelly", 33),
    User("Jennifer", 44),
    User("Dennis", 23)
  )

  for (user <- userBase) println(s"User: ${user.name}, age: ${user.age}")

  val twentySomethings =
    for (user <- userBase if user.age >=20 && user.age < 30)
    yield user

  twentySomethings.foreach(user => {
    println(s"${user.name} is ${user.age} years old")
  })
}
