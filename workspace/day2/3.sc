import data.Data

Data.books.sortBy(b => b.basePrice) foreach println

Data.books.sortBy(b => (b.basePrice, b.title)) foreach println

