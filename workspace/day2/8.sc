import play.api.libs.json._

object :: {
  def unapply(str: String): Option[(String, String)] = str.split(":") match {
    case Array(prefix, suffix) => Some((prefix, suffix))
    case _                     => None
  }
}


def transform(json: JsValue): JsValue = json match {
  case JsNull                  => JsString("missing")
  case JsNumber(x)             => JsNumber(x * x)
  case JsBoolean(x)            => JsBoolean(!x)
  case JsString("")            => JsString("empty")
  case JsString("urn" :: post) => JsString(s"Hello $post")
  case JsArray(xs)             => JsArray(xs.map(transform))
  case JsObject(xs)            => JsObject(xs.map {
    case t@("m" | "n", v) => t
    case (k, v)           => (k, transform(v))
  })
  case blah                    => blah
}
