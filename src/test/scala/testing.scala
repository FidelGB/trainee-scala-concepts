package calculator_dummie

import org.scalatest.funsuite.AnyFunSuite

class CalculatorSuite extends AnyFunSuite{
  val calculator = new Calculator

    test("Calculator multuply"){
      assert(calculator.multiply(234, 0) == 0)
      assert(calculator.multiply(-1, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)
    }

    test("Calculator division by 0") {
      assertThrows[ArithmeticException](calculator.divide(2342, 0))
    }

}
