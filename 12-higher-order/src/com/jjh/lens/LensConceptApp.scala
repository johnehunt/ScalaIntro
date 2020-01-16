package com.jjh.lens

case class Street(name: String, number: Int)
case class Address(country: String, city: String, street: Street)
case class User(id: Int, address: Address)

object Util {
  // Non Lens style of update
  // Can get difficult to read, convoluted, easy to get wrong
  def changeStreetNumber(user: User, i: Int): User = {
    user.copy(
      address = user.address.copy(
        street = user.address.street.copy(
          number = i
        )
      )
    )
  }
}

object LensUtils {

  // Defines a Lens used to access and update
  // values - reusable as get and set are functions
  case class Lens[A, B](get: A => B,
                        set: (A, B) => A
                       )

  // Can combine Lenses together to allow deeper lenses
  def compose[Outer, Inner, Value](
                                    outer: Lens[Outer, Inner],
                                    inner: Lens[Inner, Value]
                                  ): Lens[Outer, Value] = Lens[Outer, Value](
    get = outer.get andThen inner.get,
    set = (obj, value) => outer.set(obj, inner.set(outer.get(obj), value))
  )

}

object LensIdeaApp extends App {

  import LensUtils._

  // Inner most lens
  val streetNumberLens = Lens[Street, Int](
    get = street => street.number,
    set = (street, i) => street.copy(number = i)
  )

  val street = Street("High Street", 10)
  val address = Address("UK", "London", street)
  val user = User(123, address)

  println(streetNumberLens.get(street))
  println(streetNumberLens.set(street, 9))

  // Lens used with address to access a street
  val addressStreetLens = Lens[Address, Street](
    get = address => address.street,
    set = (address, street) => address.copy(street = street)
  )

  // Combining the lenses together
  val addressStreetNumberLens: Lens[Address, Int] =
    compose(addressStreetLens, streetNumberLens)

  println(addressStreetLens.get(address))
  println(addressStreetNumberLens.set(address, 8))


}
