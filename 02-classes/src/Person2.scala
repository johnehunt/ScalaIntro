/**
 * Class illustrating custom setter and getter methods.
 */
class Person2 {

  private var _name = ""
  private var _age = 0

  // Getters as public methods
  // include return type (although it is optional)
  def age: Int = _age
  def name: String = _name
  
  // Setters
  def age_=(value: Int): Unit = _age = value
  def name_=(value: String): Unit = _name = value
   
}


object Person2TestApp extends App {
  val p = new Person2()
  println(p.name + " is " + p.age)
  p.name = "John"
  p.age = 32
  println(p.name + " is " + p.age)
}