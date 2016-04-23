

sealed trait List[+T]
case object Nil extends List[Nothing]
case class ::[T](head: T, tail: List[T]) extends List[T]

val xs = ::(1, ::(2, ::(3, Nil)))

def length[T](xs: List[T]): Int = xs match {
  case Nil      => 0
  case h :: t => 1 + length(t)
}

length(xs)
