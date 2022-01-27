package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FactorialUsingRecursionTest extends AnyFlatSpec {

  val factorial = new FactorialUsingRecursion

  "A condition" should "be correct if 5 returns 120" in {
    assert(120 == factorial.factorial(5))
  }
  "A condition" should "be correct if 0 returns 1" in {
    assert(1 == factorial.factorial(0))
  }
  "A condition" should "not be correct if 6 returns 500" in {
    assert(!(500 == factorial.factorial(6)))
  }
}