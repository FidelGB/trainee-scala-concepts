import cats.Monoid
import cats.instances.string._ // for Monoid
import cats.instances.int._ // for Monoid
import cats.syntax.semigroup._ // for |+|

object cats3 extends App{

    //Instancias monoides
    val message = Monoid.apply[String].combine("Hello ", "World")
    println(message)

    val stringEmpty = Monoid.apply[String].empty
    println(stringEmpty)

    val number = Monoid.apply[Int].combine(10,20)
    println(number)

    val zero = Monoid.apply[String].empty
    println(zero)

    //Sintaxis monoide
    val stringResult = "Hello " |+| "world!!!" |+| Monoid[String].empty
    println(stringResult)

    val intResult = 10 |+| 10 |+| Monoid[Int].empty
    println(intResult)

    // Ejercicio
    def add(items: List[Int]): Int = items.foldLeft(Monoid[Int].empty)(_ |+| _)
    println(add(List[Int](1,2,3,4,5,6,7,8,9)))

    def addMonod[A](items: List[A])(implicit monoid: Monoid[A]): A = items.foldLeft(monoid.empty)(_ |+| _)

}
