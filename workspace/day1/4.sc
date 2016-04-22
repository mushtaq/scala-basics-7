import scala.annotation.tailrec

def map[A, B](list: List[A])(f: A => B): List[B] = {
  if(list.isEmpty) {
    List.empty[B]
  } else {
    f(list.head) :: map(list.tail)(f)
  }
}

def map2[A, B](list: List[A])(f: A => B): List[B] = {
  loop(list, List.empty[B])(f).reverse
}

@tailrec
def loop[A, B](list: List[A], acc: List[B])(f: A => B): List[B] = {
  if(list.isEmpty) {
    acc
  } else {
    val newAcc = f(list.head) :: acc
    loop(list.tail, newAcc)(f)
  }
}

map((1 to 10).toList)(x => x * x)
map2((1 to 10000).toList)(x => x * x)
