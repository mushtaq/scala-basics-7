
case class Person(name: String, age: Int)

val p = new Person("abc", 33)

p match {
  case Person(n, a) => (n, a)
}
