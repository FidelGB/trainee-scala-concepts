/**
 * Closures.
 * 
 * Funciones que usan una o mas variables que no se le pasan como parametros
 * (Variables libres)
*/
object Closures extends App{
    val rate: Double = 0.10
    val time: Int = 2

    def calcSimpleInterest(principal: Double): Double = 
        (principal * rate * time) / 1000
    
    val simpleInterest = calcSimpleInterest(20)
    println(s"Simple interest $simpleInterest")
}