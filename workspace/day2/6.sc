
def add2(o1: Option[String], o2: Option[String]): Option[String] = {
  (o1, o2) match {
    case (Some(a), Some(b)) => Some(a + b)
    case (None, _)          => o2
    case (_, None)          => o1
  }
}

//def add(o1: Option[String], o2: Option[String]): Option[String] = {
//
//  if(o1.isInstanceOf[Some[String]]) {
//    if(o2.isInstanceOf[Some[String]]) {
//      val x1 = o1.asInstanceOf[Some[String]].x
//      val x2 = o2.asInstanceOf[Some[String]].x
//      Some(x1 + x2)
//    } else {
//      o1
//    }
//  } else {
//    o2
//  }
//
//}
