package com.knoldus

class Log extends LogTrait {

  // Used S-Interpolator
  override def log(message: String, level: String = "INFO"): String = s"[${level.toUpperCase}]: $message"
}