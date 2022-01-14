package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FactorialUsingTailRecursionTest extends AnyFlatSpec {

  "A condition " should "be valid if 5 will returns 120" in {
    val obj = new FactorialUsingTailRecursion()
    assert(120 == obj.factorialUsingTail(5))
  }
  "A condition " should "be valid if 0 will returns 1" in {
    val obj = new FactorialUsingTailRecursion()
    assert(1 == obj.factorialUsingTail(0))
  }
  "A condition " should "be valid if -3 will returns 0" in {
    val obj = new FactorialUsingTailRecursion()
    assert(0 == obj.factorialUsingTail(-3))
  }
  "A condition " should "be invalid if 4 will returns 120" in {
    val obj = new FactorialUsingTailRecursion()
    assert( !(120 == obj.factorialUsingTail(4)))
  }
  "A condition " should "be invalid if -7 will returns -5040" in {
    val obj = new FactorialUsingTailRecursion()
    assert(!(-5040 == obj.factorialUsingTail(-7)))
  }

}
