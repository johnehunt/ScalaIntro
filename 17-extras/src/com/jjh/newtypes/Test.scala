package com.jjh.newtypes

trait Transport

class Test {
  type Name = String
  type IntToStringFunc = Int => String // Semantic name for function type
  type X                               // Abstract type
  type Y <: Transport                  // Upper Bound - Transport or subtype of Transport
  type Z >: Transport                  // Lower Bound - Transport or super type of Transport
}

