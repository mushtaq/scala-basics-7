package sorting

object Sorter {
  def insert[T](x: T, xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil                             => List(x)
    case head :: tail if ord.lt(head, x) => head :: insert(x, tail)(ord)
    case head :: tail                    => x :: xs
  }

  def sort[T](xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail)(ord))(ord)
  }
}
