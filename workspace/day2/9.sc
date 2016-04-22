
class Person(val name: String, val age: Int)

object AAAA {
  def unapply(person: Person): Option[(String, Int)] = Some((person.name, person.age))
}

val p = new Person("abc", 33)

val AAAA(nm, ag) = p

val email = "mushtaq@tw.com"

object Email {
  def unapply(email: String): Option[(String, String)] = email.split("@") match {
    case Array(user, domain) => Some((user, domain))
    case _                   => None
  }
}

val Email(a, b) = email

def m(email: String): String = email match {
  case Email(user, domain) => s"$user----$domain"
  case _                   => "error"
}

m(email)
