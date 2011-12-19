import org.junit.Before;
import org.junit.Test;

import play.test.MorphiaFixtures;
import play.test.UnitTest;

public class BasicTest extends UnitTest {

	@Before
	public void setup() {
		MorphiaFixtures.deleteAllModels();
	}

	@Test
	public void aVeryImportantThingToTest() {
		assertEquals(2, 1 + 1);
	}

}
