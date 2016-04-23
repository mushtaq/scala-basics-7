package data

import sorting.Ord

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Book {

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
}
