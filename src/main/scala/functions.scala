object Functions extends App {
    /**
      * Function to calculate anything
      *
      * @param number
      * @param calcFunction
      * @return
      */
    def calcAnyThing(number: Int, calcFunction: Int => Int): Int = calcFunction(number)
    
    /**
      * Function to calculate square of a number
      *
      * @param num
      * @return
      */
    def calcSquare(num: Int): Int = num * num
    
    /**
      * Function to calculate cube of a number
      *
      * @param num
      * @return
      */
    def calcCube(num: Int): Int = num * num * num
    
    
    val squareCalculated = calcAnyThing(2, calcSquare)
    println(squareCalculated)
    
    val cubeCalculated = calcAnyThing(3, calcCube)
    println(cubeCalculated)

    // ---------------------------------------------------------------------------------------
    /**
      * Funciton to add number to another number
      *
      * @param x
      * @param y
      * @return
      */
    def performAddition(x: Int, y: Int): Int = x + y

    /**
      * Funciton to substract number to another number
      *
      * @param x
      * @param y
      * @return
      */
    def performSubstraction(x: Int, y: Int): Int = x - y

    /**
      * Function to multiplicate two numbers
      *
      * @param x
      * @param y
      * @return
      */
    def performMultiplication(x: Int, y: Int): Int = x * y

    /**
      * Function to make an aritmetic operation
      *
      * @param num1
      * @param num2
      * @param operation
      * @return
      */
    def performArithmeticOperation(num1: Int, num2: Int, operation: String): Int = {
        operation match {
            case "addition" => performAddition(num1, num2)
            case "substraction" => performSubstraction(num1, num2)
            case "multiplication" => performMultiplication(num1, num2)
            case _ => -1
        }
    }

    val additionResult = performArithmeticOperation(2, 4, "addition")
    println(s"Result of addition: $additionResult")

    val substraction = performArithmeticOperation(10, 6, "substraction")
    println(s"Result of substraction: $substraction")

    val multiplicationResult = performArithmeticOperation(8, 5, "multiplication")
    println(s"Result of multiplication: $multiplicationResult")

}

