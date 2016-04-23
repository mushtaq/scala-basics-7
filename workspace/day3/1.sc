import data.{Book, Data}

Data.books.foldLeft(0.0)(_ + _.basePrice)
Data.books.foldLeft(0.0)((acc, book) => acc + book.basePrice)
Data.books.foldLeft(0.0) { case (acc, b@Book(_, _, p, _)) =>
  acc + p + b.basePrice
}
