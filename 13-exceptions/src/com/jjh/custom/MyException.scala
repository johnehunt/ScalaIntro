package com.jjh.custom

/**
 * Custom Exception type.
 */
class MyException extends RuntimeException { }

object ExceptionGenerationApp extends App {
    throw new MyException()
}
