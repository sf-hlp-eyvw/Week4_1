package bookstoreProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookstoreTest {

	Bookstore bookstore;
	@Before
	public void setUp() throws Exception {
		bookstore = new Bookstore();
	}

	@Test
	public void testCalculateTotalPriceOfBooksInBookStore() {
		assertEquals(266, bookstore.calculateTotalPriceOfBooksInStore());
	}

	
}
