import data.Data


val t = (1, "abc", true)

t._1
t._2
t._3


Data.books foreach println


Data.books.groupBy(book => book.author)
Data.books.groupBy(book => book.author) foreach println

List(1, 2, 3, 1, 4, 2).groupBy(identity).mapValues(_.length)


Data.books.sortBy(book => -book.basePrice)  foreach println


