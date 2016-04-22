
class UsCanDrink extends (Int => Boolean) {
  def apply(age: Int): Boolean = age > 10
}

val mahaCanDrink: Int => Boolean = new (Int => Boolean) {
  def apply(age: Int): Boolean = age > 20
}

val mahaCanDrink2: Int => Boolean = { age =>
  age > 20
}

val mahaCanDrink3: (Int) => Boolean = { age: Int =>
  age > 20
}

def canDrink(age: Int) = age > 20

val mahaCanDrink4 = mahaCanDrink3

mahaCanDrink3(23)
canDrink(23)


class Person(age: Int, isFemale: Boolean) {

  def isWise = if(isFemale) age > 18 else age > 21

  def canMarry(canDrink: Int => Boolean) =
    this.isWise && canDrink(age)

}

val p = new Person(20, true)

p.isWise

p.canMarry(mahaCanDrink3)
p.canMarry(canDrink)

p.canMarry(new UsCanDrink)
p.canMarry(mahaCanDrink)
p.canMarry { age =>
  age > 100
}
p.canMarry(age => age > 100)
p.canMarry(_ > 100)
