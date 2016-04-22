
object A {
  trait Day
  case object Weekday extends Day
  case object Weekend extends Day

  trait Customer
  case object Regular extends Customer
  case object Rewards extends Customer

  case class Category(customer: Customer, day: Day)

  case class Request(customer: Customer, days: List[Day]) {
    def categories: List[Category] = days.map(d => Category(customer, d))
  }

  case class Hotel(name: String, rating: Int, rateCard: Map[Category, Int]) {
    def costOf(request: Request): Int = request.categories.map(rateCard).sum
  }

  case class HotelService(hotels: Hotel*) {
    def bestHotel(request: Request): Hotel =
      hotels.minBy(h => (h.costOf(request), -h.rating))
  }

}
