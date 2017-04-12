package bookstoreProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	Book book;
	@Before
	public void setUp() throws Exception {
		book = new Book("Max", "Frazier", "Houston", "Java programming");
	}

	@Test
	public void testCalculatePrice() {
		assertEquals(10, book.calculatePrice());
	}



}
