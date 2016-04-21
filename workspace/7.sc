
val xs = Seq("a", "b", "c")


xs(2)
xs.apply(2)

xs: Seq[String]
xs: Int => String

val ys = Set("a", "b", "c")

ys: Set[String]
ys("c")
ys("aaa")

ys: String => Boolean

val hashMap = Map(1 -> "a", 2 -> "b", 3 -> "c")

hashMap: Map[Int, String]
hashMap(1)

hashMap: Int => String

val keys = Seq(1, 2, 3)

keys.map(hashMap)

val a2z = ('a' to 'z').map(_.toString)

a2z.filterNot(ys)





