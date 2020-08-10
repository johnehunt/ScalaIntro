package com.jjh.collections

object FlatMapApp extends App {

  println("Starting")

  val data = List(
    List(Person("John", 55), Person("Denise", 52)),
    List(Person("Phoebe", 22), Person("Adam", 20), Person("Joselyn", 18)),
    List(Person("Jasmine", 20), Person("Gryff", 24))
  )
  println(s"data: $data")

  // Apply map and then flatten the result
  val data2 = data.flatMap(list => list.filter(p => p.age < 21))
  println(s"data2: $data2")

  // Equal to
  val data3 = data.map(list => list.filter(p => p.age < 21))
  println(s"data3: $data3")
  val data4 = data3.flatten // note removal of empty list
  println(s"data4: $data4")

  println("-" * 25)

  val myToInt: String => Option[Int] = (s: String) => {
    import scala.util.Try
    Try {
      Some(s.toInt)
    } recover { case _: Exception => None }
  }.get

  // Illustrates removal of None values by flat part of flatMap
  val info: List[String] = List("1", "2", "foo", "3", "hi")
  println(info)
  val info1 = info.map(myToInt)
  println(info1)
  val info2: List[Int] = info.flatMap(myToInt)
  println(info2)

  print("Done")

}
