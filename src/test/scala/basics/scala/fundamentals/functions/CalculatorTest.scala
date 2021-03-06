package basics.scala.fundamentals.functions

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite{

  test("Calculator.sum"){
    val calculator = new Calculator
    val sum = calculator.sum(10,20)
    assert(sum == 30)
  }

  test("Calculator.multiplier"){
    val calculator = new Calculator
    val multiplier: Int = calculator.multiplierWitFactor(2)
    assert(20 == multiplier)
  }

  test("Calculator.divide"){
    val calculator = new Calculator
    val result: Either[DivisionError, Int] = calculator.divide(4,2)
    println(result.productElement(0))
  }

  test("Calculator.divide by cero"){
    val calculator = new Calculator
    val result: Either[DivisionError, Int] = calculator.divide(4,0)
    println(result.productElement(0))
  }
}
