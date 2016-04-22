object A {


  sealed trait Day

  object Day {
    case object Weekday extends Day
    case object Weekend extends Day
  }


  sealed trait Json

  case object JsonNull extends Json

  case class JsonString(value: String) extends Json
  case class JsonNumber(value: Double) extends Json
  case class JsonBoolean(value: Boolean) extends Json

  case class JsonArray(value: List[Json]) extends Json
  case class JsonObject(value: Map[String, Json]) extends Json


  val mushtaq: Json = JsonObject(Map(
    "id" -> JsonNull,
    "name" -> JsonString("mushtaq"),
    "age" -> JsonNumber(39),
    "isFemale" -> JsonBoolean(false),
    "children" -> JsonArray(List(JsonString("abc"), JsonString("xyz"))),
    "address" -> JsonObject(Map(
        "street" -> JsonString("baner"),
        "pin" -> JsonNumber(123)
    ))
  ))

}
