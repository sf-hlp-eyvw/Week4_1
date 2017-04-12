import static org.junit.Assert.fail;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PerformerTest {
	Performer performer;
	@Before
	public void setUp() throws Exception {
		performer = new Performer();
	}

	@Test
	public void testPerformer() {
		
		Assert.assertThat(performer.perform(), CoreMatchers.containsString("performer"));

	}



}
