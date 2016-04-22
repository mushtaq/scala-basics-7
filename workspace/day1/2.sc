import scala.collection.mutable

val xs = List(1, 2, 3, 4)

def map[A, B](list: List[A])(f: A => B): List[B] = {
  val iterator = list.iterator
  val result = mutable.Buffer.empty[B]

  while (iterator.hasNext) {
    result.append(f(iterator.next()))
  }

  result.toList
}

map(xs)(x => x * x)


Seq(1, 2).map(x => x + 1)
Vector(1, 2).map(x => x + 1)
(1 to 10).map(x => x + 1)
Map(1 -> 1).map(x => x._1)
