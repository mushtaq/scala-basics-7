val xs = List(1, 2, 3, 4)

xs.map(x => x * x)
xs.filter(x => x > 2)

xs.foldLeft(0)((acc, elm) => acc + elm)
xs.foldLeft(1)((acc, elm) => acc * elm)
xs.foldLeft("")((acc, elm) => acc + elm)

def map[A, B](list: List[A])(f: A => B): List[B] = {
  list.foldLeft(List.empty[B])((acc, elm) => f(elm) :: acc).reverse
}

map((1 to 10000).toList)(x => x * x)

def reverse[A](xs: List[A]): List[A] = {
  xs.foldLeft(List.empty[A])((acc, elm) => elm :: acc)
}

reverse((1 to 10000).toList)

def filter[A](xs: List[A])(f: A => Boolean): List[A] = {
  xs.foldLeft(List.empty[A]) { (acc, elm) =>
    if(f(elm)) {
      elm :: acc
    } else {
      acc
    }
  }.reverse
}

filter(xs)(_ > 2)
