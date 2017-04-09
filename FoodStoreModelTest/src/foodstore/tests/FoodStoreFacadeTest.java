package foodstore.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import foodstore.dao.impl.FoodStoreDAOImpl;
import foodstore.services.impl.FoodStoreFacadeImpl;
import junit.framework.TestCase;

public class FoodStoreFacadeTest extends TestCase {
	
	FoodStoreFacadeImpl foodStoreFacade;
	
	public void setUp() throws Exception{
		super.setUp();
		
		foodStoreFacade = new FoodStoreFacadeImpl();
		
		foodStoreFacade.setFoodStoreDAO(FoodStoreDAOImpl.getFoodStoreDAO());
	}
	
	@Test
	public void testGetEmployee() {
		assertTrue(foodStoreFacade.getEmployee(1) != null);
	}

	@Test
	public void testCreateEmployee() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testCurrentlyEmployed() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testCreateItem() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetItem() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetItemDeparment() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testCreateStore() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetStore() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetStoreName() {
		fail("Not yet implemented"); // TODO
	}

}
