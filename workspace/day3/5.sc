import data.Data
import sorting.Sorter

Data.books.sortBy(b => (b.basePrice, b.title))