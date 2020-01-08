package com.jjh

/**
 * Defines a package object for the banking package.
 * Contains a utility method printAccount that can be imported
 * as part of the package or independently.
 */
package object banking {
  def printAccount(acc: Account): Unit = {
    import acc._
    println(name + ": " + number)
  }
}

