package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class LogTest extends AnyFlatSpec {

  "A condition" should "be valid if it returns " in {
    val obj = new Log()
    assert("[INFO]: Scala is amazing." == obj.log("Scala is amazing."))
  }
  "A condition" should "be valid if it returns updated argument" in {
    val obj = new Log()
    assert("[WARNING]: Scala hates mutation." == obj.log("Scala hates mutation.", "WARNING"))
  }




}
