
val xs = Option(19)
val ys = Option(7)

xs.flatMap(x => ys.map(y => x + y))


for {
  x <- xs
  if x > 9
  y <- ys
  if y < 8
} yield x + y

