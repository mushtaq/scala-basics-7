case class Pincode(value: Int)

case class Address(street: String, pincode: Pincode)

case class Person(name: String, age: Int, address: Address)

val p1 = Person("abc", 33, Address("pune", Pincode(100)))

val p2 = Person("mushtaq", 39, Address("pune", Pincode(100)))
val p3 = Person("mushtaq", 39, Address("pune", Pincode(100)))


p1 == p2
p2 == p3

p1.hashCode()
p2.hashCode()
p3.hashCode()


p1.toString

p1.name

p1.copy(age = 50)

