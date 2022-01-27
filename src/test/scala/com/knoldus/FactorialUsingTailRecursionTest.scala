package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FactorialUsingTailRecursionTest extends AnyFlatSpec {

  val factorialTail = new FactorialUsingTailRecursion

  "A condition " should "be correct if 5 returns 120" in {
    assert(120 == factorialTail.factorialUsingTail(5))
  }
  "A condition " should "be correct if 0 returns 1" in {
    assert(1 == factorialTail.factorialUsingTail(0))
  }
  "A condition " should "be correct if -3 returns 0" in {
    assert(0 == factorialTail.factorialUsingTail(-3))
  }
  "A condition " should "be incorrect if 4 returns 120" in {
    assert(!(120 == factorialTail.factorialUsingTail(4)))
  }
  "A condition " should "be incorrect if -7 returns -5040" in {
    assert(!(-5040 == factorialTail.factorialUsingTail(-7)))
  }
}