import models.users.User;

import org.junit.Before;
import org.junit.Test;

import play.data.validation.Validation;
import play.test.MorphiaFixtures;
import play.test.UnitTest;

public class MongodbTest extends UnitTest {

	@Before
	public void setup() {
		MorphiaFixtures.deleteAllModels();
		Validation.current();
		Validation.clear();
	}

	@Test
	public void testInherit() {
		//Don't support inherit query
	}

	@Test
	public void testValidateion() {
		User customer = new User();
		customer.email = "ryvius.note@gmail.com";
		customer.password = "make076815";
		Validation validation = Validation.current();
		validation.valid(customer);
		assertFalse(Validation.hasErrors());
	}

	@Test
	public void testAutoTimestamp() {
		User customer = new User();
		customer.email = "ryvius.note@gmail.com";
		customer.password = "make076815";
		assertTrue(customer.create());
		assertNotNull(customer.created);
		customer.firstName = "Lee";
		customer.save();
		assertNotNull(customer.modified);
	}

	@Test
	// Annotation need remove cache and restart server
	public void testEncrypt() {
		User customer = new User();
		customer.email = "ryvius.note@gmail.com";
		customer.password = "make076815";
		assertTrue(customer.create());
		assertFalse(customer.password.equals("make076815"));
	}

}
