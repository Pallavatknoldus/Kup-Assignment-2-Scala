package com.knoldus

import scala.annotation.tailrec

class FactorialUsingTailRecursion {

  def factorialUsingTail(element: Int): BigInt = {
    @tailrec
    def innerFactorial(element: Int, counter: BigInt = 1): BigInt = {
      if (element >= 0) { // When number is positive or 0.
        if (element <= 1) counter
        else innerFactorial(element - 1, element * counter) // Counter keep changing by multiplying value of n.
      }
      else 0 // When number is negative, Factorial of negative numbers is 0.
    }

    innerFactorial(element)
  }
}