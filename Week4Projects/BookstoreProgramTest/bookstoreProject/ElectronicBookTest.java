package bookstoreProject;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class ElectronicBookTest {
	ElectronicBook electronicBook;
	@Before
	public void setUp() throws Exception {
		Date date1 = new Date();
		electronicBook = new ElectronicBook("ElectronicMarck", "Bamaca", "Houston", "Java programming", date1);
	}

	@Test
	public void testCalculatePrice() {
		assertEquals(1, electronicBook.calculatePrice());
	}

}
