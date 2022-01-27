package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class LogTest extends AnyFlatSpec {

  val logger = new Log

  "Log" should "return default value of level with the message if level is not provided" in {
    assert("[INFO]: Scala is amazing." == logger.log("Scala is amazing."))
  }
  "Log" should "return updated value of level with the message if level is provided" in {
    assert("[WARNING]: Scala hates mutation." == logger.log("Scala hates mutation.", "WARNING"))
  }
  "Log" should "return updated value of level in upper case with the message if level is provided in lower case" in {
    assert("[SUCCESSFUL]: Scala loves immutation." == logger.log("Scala loves immutation.", "successful"))
  }
}