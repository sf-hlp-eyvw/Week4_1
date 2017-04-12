import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AuditionTest {
	Audition audition; 
	@Before
	public void setUp() throws Exception {
		audition = new Audition();
	}

	@Test
	public void performerListTestContainsPerformer() {
		audition.performAllPerformers();
		Assert.assertThat(audition.performAllPerformers(), CoreMatchers.containsString("performer"));

	}
	
	
	//the below tests work since it checks if the word dancer or sing exist within the single string in playing all the performers
	@Test
	public void performerListTestContainsDancer() {
		audition.performAllPerformers();
		Assert.assertThat(audition.performAllPerformers(), CoreMatchers.containsString("dancer"));

	}
	
	@Test
	public void performerListTestContainsVocalist() {
		audition.performAllPerformers();
		Assert.assertThat(audition.performAllPerformers(), CoreMatchers.containsString("sing"));

	}


}
