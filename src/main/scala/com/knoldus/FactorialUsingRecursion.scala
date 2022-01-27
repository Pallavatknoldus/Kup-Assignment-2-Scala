package com.knoldus

class FactorialUsingRecursion {
  def factorial(element: Int): Int = {
    if (element <= 1) 1
    else element * factorial(element - 1)
  }
}