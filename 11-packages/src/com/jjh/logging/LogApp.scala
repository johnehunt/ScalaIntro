package com.jjh.logging

import com.typesafe.scalalogging.LazyLogging

// Uses com.typesafe.scala-logging:scala-logging_2.13:3.9.5
// and ch.qos.logback:logback-classic:1.2.6

object LogApp extends App with LazyLogging {
  logger.info("Hello there")
}
