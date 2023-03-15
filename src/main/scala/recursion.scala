/**
  * Recursion
  * La recursion es una manera de hacer bucles sin ciclos. Esto se hace cuando 
  * una funcion se llama a si misma
  */

object recursion extends App{
    def factorial(num: Int): Int = if(num == 1) 1 else num * factorial(num - 1)

    println(s"Factorial de 6: ${factorial(6)}")
}
