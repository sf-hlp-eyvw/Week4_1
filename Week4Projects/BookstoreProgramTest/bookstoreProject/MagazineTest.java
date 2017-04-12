package bookstoreProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MagazineTest {
	Magazine magazine;
	@Before
	public void setUp() throws Exception {
		magazine = new Magazine("MagMar", "Bam", "Atlanta", "JS Programming", "jsPub", "JSLand");
	}

	@Test
	public void testCalculatePrice() {
		assertEquals(108, magazine.calculatePrice());
	}

}
