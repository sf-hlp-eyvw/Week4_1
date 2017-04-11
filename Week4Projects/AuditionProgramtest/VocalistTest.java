import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class VocalistTest {
	Vocalist vocalistG;
	Vocalist vocalistB;
	Vocalist vocalistBat9;
	Vocalist vocalistBat11;

	@Before
	public void setUp() throws Exception {
		vocalistG = new Vocalist("G");
		vocalistB = new Vocalist("B");
		vocalistBat9 = new Vocalist("B", 9);
		vocalistBat11 = new Vocalist("B", 11);

	}

	@Test
	public void testVocalistB() {
		Assert.assertThat(vocalistB.getKey(), CoreMatchers.containsString("B"));
	}
	
	@Test
	public void testVocalistBat9Volume() {
		Assert.assertThat(vocalistB.getKey(), CoreMatchers.containsString("B"));
		Assert.assertEquals(9, vocalistBat9.getVolume());
	}
	
	@Test
	public void testVocalistBat11Volume() {
		Assert.assertThat(vocalistB.getKey(), CoreMatchers.containsString("B"));
		Assert.assertEquals(0, vocalistBat11.getVolume());
	}
	

}
