/**
  * Funciones que aceptan multiples listas de argumentos
  */

object Currying extends App{
    val multiplication: (Int, Int) => Int = (x, y) => x * y
    val curriedMultiplication: Int => Int => Int = x => y => x * y
    // Las dos lineas hacen lo mismo, pero se invocan de manera distinta

    val resMul = multiplication(3, 5)
    println(s"Multiplicacion con funcion normal: $resMul")

    val resCurriedMul = curriedMultiplication(3)(5)
    println(s"Multiplicacion con funcion currying: $resCurriedMul")
    
}