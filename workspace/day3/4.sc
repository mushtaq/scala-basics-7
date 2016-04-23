import data.Data
import play.api.libs.json.Json

Json.toJson(100)
Json.toJson("b")
Json.toJson(false)
Json.toJson(List(1, 2, 3))
Json.toJson(List("a", "b"))
Json.toJson(List("a", "b"))
Json.toJson(Data.books)

