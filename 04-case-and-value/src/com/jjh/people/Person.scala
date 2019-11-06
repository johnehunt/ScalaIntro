package com.jjh.people

/**
 * Defining a case class
 *
 * Case classes get:
 * 1. A default factory creation method - no need to use new
 * 2. All arguments to the constructor are val by default
 * 3. Default implementation of toString method
 * 4. Default value based implementation of equals method (used by ==)
 * 5. Default copy method to create a copy of an object
 * 6. Default implementation of the hashcode method
 */
case class Person(name: String = "John", var age: Int = 47)
