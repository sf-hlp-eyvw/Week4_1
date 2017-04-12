import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DancerTest {
	Dancer dancerHip;
	Dancer dancerTap;
	Dancer dancerSalsa;
	@Before
	public void setUp() throws Exception {
		dancerHip = new Dancer("hip hop");
		dancerTap = new Dancer("tap dance");
		dancerSalsa = new Dancer("salsa");
	}

	@Test
	public void testDancerStylesHipHop() {
		Assert.assertThat(dancerHip.getDanceStyle(), CoreMatchers.containsString("hip hop"));
	}
	
	
	@Test
	public void testDancerStylesSalsa() {
		Assert.assertThat(dancerSalsa.getDanceStyle(), CoreMatchers.containsString("salsa"));

	}
	
	@Test
	public void testDancerStylesTap() {
		Assert.assertThat(dancerTap.getDanceStyle(), CoreMatchers.containsString("tap dance"));

	}
	
}
