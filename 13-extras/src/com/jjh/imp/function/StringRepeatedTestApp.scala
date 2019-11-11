package com.jjh.imp.function

class StringRepeated(original: String) {
  def repeat(times: Int): String = {
    def multiply(times: Int, accumulated: String): String = {
      if (times > 1) multiply(times - 1, accumulated + original)
      else original + accumulated
    }
    multiply(times, "")
  }

  implicit def string2repeated(x: String): StringRepeated = new StringRepeated(x)
}

object StringRepeatedTestApp extends App {
  // Yuk - but could do it
  val repeated = new StringRepeated("=") repeat 10
  println(repeated)
  // But using the Implicit Conversion
  val result = "=" repeat 10
  // Is implicitly translated to 1st version
  println(result)
}
