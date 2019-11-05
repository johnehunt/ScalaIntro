package com.jjh.collections.custom

class MyException extends RuntimeException { }

object ExceptionGenerationApp extends App {
    throw new MyException()
}
