

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProductOwnerTest {
	
	ProductOwner martineDeLaSNCF;

	@Before
	public void setUp() throws Exception {
		this.martineDeLaSNCF = new ProductOwner("Oui_SNCF");
	}

	@After
	public void tearDown() throws Exception {
		this.martineDeLaSNCF = null;
	}

	@Test
	public void testProductToSprintBacklogStrategieOne() {
		assertEquals(martineDeLaSNCF.productToSprintBacklogStrategieOneDeprecated().toString(), martineDeLaSNCF.productToSprintBacklogStrategieOne().toString());
	}
	
	@Test
	public void testProductToSprintBacklogStrategieTwo() {
		assertEquals(martineDeLaSNCF.productToSprintBacklogStrategieTwoDeprecated().toString(), martineDeLaSNCF.productToSprintBacklogStrategieTwo().toString());
	}

}
