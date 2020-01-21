object PersonTest1 extends App {
  val p1: Person1 = new Person1()
  println(s"${p1.name} is ${p1.age}")
  p1.name = "John"
  p1.age = 48
  println(s"${p1.name} is ${p1.age}")
}
