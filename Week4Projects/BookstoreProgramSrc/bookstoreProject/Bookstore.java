
	package bookstoreProject;

	import java.util.ArrayList;
import java.util.Date;
import java.util.List;

	class Bookstore {

		List<Book> bookstoreList;
		
		Bookstore(){
			bookstoreList = new ArrayList<Book>();
			Date date1 = new Date();
			Date date2 = new Date();
			bookstoreList.add(new Book("Marck", "Bamaca", "Houston", "Java programming"));
			bookstoreList.add(new Book("Marck2", "Bamaca2", "Houston2", "Java programming2"));
			bookstoreList.add(new Magazine("Marck", "Bamaca", "Houston", "Java programming", "JavaPub", "JavaLand"));
			bookstoreList.add(new Magazine("MagMar", "Bam", "Atlanta", "JS Programming", "jsPub", "JSLand"));
			bookstoreList.add(new ElectronicBook("ElectronicMarck", "Bamaca", "Houston", "Java programming", date1));
			bookstoreList.add(new ElectronicBook("ElectronicMarck2", "Bamaca", "Houston", "Java programming", date2));

		}
		
		
		int calculateTotalPriceOfBooksInStore() {
			int totalPrice = 0;
			for(Book book: bookstoreList){
				totalPrice = totalPrice + book.calculatePrice();
			}
			return totalPrice;
		}

	}


