package com.jjh.http

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import scala.concurrent.ExecutionContextExecutor
import scala.io.StdIn

object WebServer extends App {

  println("Starting the Actor System")
  implicit val system: ActorSystem = ActorSystem("my-system")
  // needed for the future flatMap/onComplete in the end
  implicit val executionContext: ExecutionContextExecutor = system.dispatcher

  println("Setting up the routes")
  val route =
    concat(
      get {
        pathPrefix("users") {
          complete(HttpEntity(ContentTypes.`application/json`, "[{id: 2, name: john}]"))
        }
      },
      get {
        pathPrefix("user" / LongNumber) { id =>
          complete(HttpEntity(ContentTypes.`application/json`, s"{id: $id, name: john}"))
        }
      }
    )

  println("Binding to the host and port")
  val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)

  println(s"Server started at http://localhost:8080/users")

  println("Press RETURN to terminate ...")
  StdIn.readLine() // let it run until user presses return
  bindingFuture
    .flatMap(_.unbind()) // trigger unbinding from the port
    .onComplete(_ => system.terminate()) // and shutdown when done

}