package com.jjh.qanda

// Example of sealed trait - must be used in this file

sealed trait Answer

object Yes extends Answer
object No extends Answer
