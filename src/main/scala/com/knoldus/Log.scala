package com.knoldus

class Log extends LogTrait { // Inherited LogTrait

  // Used S-Interpolator
  override def log(message: String, level: String = "INFO"): String = s"[$level]: $message"

}
