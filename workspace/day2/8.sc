import play.api.libs.json._

def transform(json: JsValue): JsValue = json match {
  case JsNull                              => JsString("missing")
  case JsNumber(x)                         => JsNumber(x * x)
  case JsBoolean(x)                        => JsBoolean(!x)
  case JsString(x) if x.startsWith("urn:") => JsString(x.replaceFirst("urn:", "Hello "))
  case JsArray(xs)                         => JsArray(xs.map(transform))
  case JsObject(xs)                        => JsObject(xs.mapValues(transform))
  case blah                                => blah
}
