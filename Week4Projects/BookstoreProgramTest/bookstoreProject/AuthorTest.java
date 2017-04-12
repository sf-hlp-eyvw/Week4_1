package bookstoreProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {
	Author author;
	@Before
	public void setUp() throws Exception {
		author = new Author("Max","Frazier","Houston");
	}


	@Test
	public void testGetAuthorsInfo() {
		assertEquals("Max Frazier", author.toString());
	}


}
