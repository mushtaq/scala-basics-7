
val xs = List(1, 2, 3, 4)

xs.head
xs.tail

xs.head :: xs.tail.head :: xs.tail.tail.head :: xs.tail.tail.tail


def map[A, B](list: List[A])(f: A => B): List[B] = {
  val iterator = list.iterator

  var acc = List.empty[B]

  while (iterator.hasNext) {
    acc = f(iterator.next()) :: acc
  }

  acc.reverse
}

map(xs)(x => x * x)


Seq(1, 2).map(x => x + 1)
Vector(1, 2).map(x => x + 1)
(1 to 10).map(x => x + 1)
Map(1 -> 1).map(x => x._1)
