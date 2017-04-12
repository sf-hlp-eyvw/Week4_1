package bookstoreProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PublisherTest {
	Publisher publisher;
	@Before
	public void setUp() throws Exception {
		publisher = new Publisher("JavaPub", "Arizona");
	}

	@Test
	public void testGetPublisherInfo() {
		assertEquals("JavaPub Arizona", publisher.toString());
	}


}
