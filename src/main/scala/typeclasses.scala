/**
  * 
  */

object typeclasses extends App {
    trait Show[A]{
        def show(a: A): String
    }

    /*
    object Show{
        val intCanShow: Show[Int] = new Show[Int] {
            def show(int: Int): String = s"int $int"
        }
        val doubleCanShow: Show[Double] = new Show[Double] {
            def show(d: Double): String = s"double: $d"
        }
    }

    println(Show.intCanShow.show(29)) // Llamada engorrosa
    println(Show.doubleCanShow.show(23.23)) // Llamada engorrosa
    */
    object Show {
        def show[A: Show](a: A) = implicitly[Show[A]].show(a)
        implicit val intCanShow: Show[Int] = new Show[Int] {
            def show(a: Int): String = s"init $a"
        }
        implicit val doubleCanShow: Show[Double] = new Show[Double]{
            def show(a: Double): String = s"double $a"
        }
    }

    println(Show.show(23))
    println(Show.show(23.44))
}
