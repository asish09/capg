package march16;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class books {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				List<product> getBooks = new ArrayList<>();
				getBooks.add(new product(12, "Peekaboo", "Toy", 4580.5));
				getBooks.add(new product(5, "Sherlock Holmes", "Books", 900.56));
				getBooks.add(new product(1, "Thousand leagues under the sea", "Books", 850.36));
				getBooks.add(new product(2, "Draw Easy", "Books", 56.32));

				List<product> Books = getBooks.stream().filter(b -> b.getCategory().equals("Books"))
						.filter(b1 -> b1.getPrice() > 100).collect(Collectors.toList());
				Books.forEach(b -> System.out.println(b.getId() + " Price::" + b.getPrice() + " Name:: " + b.getName()));
			}

		}