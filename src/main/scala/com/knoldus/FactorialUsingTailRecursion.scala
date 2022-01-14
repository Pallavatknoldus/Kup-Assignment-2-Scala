package com.knoldus

import scala.annotation.tailrec

class FactorialUsingTailRecursion {

  def factorialUsingTail(n: Int): Int = {
    @tailrec
    def innerFactorial(n: Int, counter: Int): Int = {
      if(n >= 0) {  // When number is positive or 0.
        if(n<=1) counter
        else innerFactorial(n-1, n * counter) // Counter keep changing by multiplying value of n.
      }
      else 0 // When number is negative, Factorial of negative numbers is 0.
    }
    innerFactorial(n, 1)
  }

}
