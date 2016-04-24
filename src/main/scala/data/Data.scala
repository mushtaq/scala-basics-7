package data

import play.api.libs.json.{JsString, JsValue, Json, Writes}
import sorting.Ord

case class Address(street: String, pin: Int)

object Address {
  implicit val writes: Writes[Address] = new Writes[Address] {
    def writes(o: Address): JsValue = JsString(o.street + "-" + o.pin)
  }
}

case class Person(name: String, address: Address)

object Person {
  implicit val writes = Json.writes[Person]
}

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Book {

  implicit val writes = Json.writes[Book]

  implicit val booOrd: Ord[Book] = new Ord[Book] {
    def lt(a: Book, b: Book): Boolean = a.basePrice < b.basePrice
  }

}

object Data {

  val books = List(
    Book("odersky", "scala prog", 100, false),
    Book("odersky", "apple", 100, false),
    Book("odersky", "complexity", 400, false),
    Book("misky", "ocaml prog", 1000, true),
    Book("misky", "sml", 88, false),
    Book("hickey", "clojure prog", 500, true)
  )

  val people = List(
    Person("mushtaq", Address("baner", 123)),
    Person("ajit", Address("pashan", 100))
  )
}
