/**
  * Instancias parciales o funciones parcialmente aplicadas
  * 
  * Son aquellas instancias de funcion que no se le han pasado todos sus argumentos
  */

object partial extends App {
    def sum(n1: Int, n2: Int): Int = n1 + n2

    val partialSum = sum(1, _)
    val resultSum = partialSum(1)
    println(s"Resultado: $resultSum")

    def sumCurried(n1: Int)(n2: Int): Int = n1 + n2
    val partialCurriedSum = sumCurried(1)(_)
    val resultCurriedSum = partialCurriedSum(1)
    println(s"Resultado: $resultCurriedSum")
}