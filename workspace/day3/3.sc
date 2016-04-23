import data.Data
import sorting.{Ord, Sorter}

Sorter.sort(Data.books)

Sorter.sort(List(2, 3, 1, 4))
Sorter.sort(List("b", "a", "z"))

Sorter.sort(List(Some(2), None, Some(1)))
Sorter.sort(List(Some("z"), None, Some("a")))

{
  implicit val customIntOrd: Ord[Int] = new Ord[Int] {
    def lt(a: Int, b: Int): Boolean = a > b
  }

  Sorter.sort(List((2, "b"), (1, "c"), (2, "a")))
}

Sorter.sort(List(
  (Some(2), Some("b")),
  (None, Some("c")),
  (Some(2), None))
)

