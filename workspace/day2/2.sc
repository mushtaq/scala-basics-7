
trait Day {
  def a = "adasd"
}
case object Weekday extends Day
case object Weekend extends Day

Weekday.a

class Person

val p = new Person
val p2 = new Person

p: Person
p: p.type
p2: p2.type


object A {
  def m = 10
}

object B {
  def x = "asdasd"
}

A: AnyRef
B: AnyRef

A.m
B.x

A: A.type
B: B.type







