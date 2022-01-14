package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
class FactorialUsingRecursionTest extends AnyFlatSpec{

  "A condition" should "be valid if 5 will returns 120" in {
    val obj = new FactorialUsingRecursion()
    assert(120 == obj.factorial(5))
    }
  "A condition" should "be valid if 0 will returns 1" in {
    val obj = new FactorialUsingRecursion()
    assert(1 == obj.factorial(0))
  }
  "A condition" should "be invalid if 6 will returns 500" in {
    val obj = new FactorialUsingRecursion()
    assert(!(500 == obj.factorial(6)))
  }

}
