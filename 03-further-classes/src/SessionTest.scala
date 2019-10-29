object SessionTest extends App {
    val s1 = Session.Create
    println(s1)
    val s2 = Session.Create
    println(s2)
    val s3 = new Session(42)
    println(s3)
}
