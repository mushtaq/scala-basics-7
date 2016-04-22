import scala.annotation.tailrec

@tailrec
def foldLeft[A, B](xs: List[A])(seed: B)(f: (B, A) => B): B = {
  if(xs.isEmpty) {
    seed
  } else {
    foldLeft(xs.tail)(f(seed, xs.head))(f)
  }
}

val xs = List(1, 2, 3, 4)

foldLeft(xs)(0)(_ + _)
foldLeft(xs)(1)(_ * _)

xs.foldLeft(0)(_ + _)
xs.reduceLeft(_ + _)

List.empty[Int].reduceLeft(_ + _)

