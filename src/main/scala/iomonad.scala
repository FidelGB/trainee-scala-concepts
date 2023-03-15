/**
  * Monad es una manera de manipular efectos de manera segura
  * de tal manera que ningún dato será evaluado hasta que se de 
  * la instrucción de hacerlo
  */

import cats.effect._
import cats.effect.unsafe.implicits.global

object monad extends App {
    def toConsole(input: String): IO[Unit] = IO(println(input))

    toConsole("Hello world!!!").unsafeRunSync
}
