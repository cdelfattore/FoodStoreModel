package foodstore.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import foodstore.dao.impl.FoodStoreDAOImpl;
import foodstore.model.Employee;
import foodstore.model.Item;
import foodstore.model.Store;
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
		Employee emp = new Employee();
		emp.setFirstName("John");
		emp.setLastName("James");
		emp.setEmployeeId(55);
		foodStoreFacade.createEmployee(emp);
		assertTrue(foodStoreFacade.getEmployee(55) != null);
	}

	@Test
	public void testCurrentlyEmployed() {
		//the init method creates three employees
		//each with a employee id of either 1, 2 or 3
		//if I assert that employee one exist than the method
		//is working properly.
		assertTrue(foodStoreFacade.getEmployee(1) != null);
	}

	@Test
	public void testCreateItem() {
		Item itemOne = new Item();
		itemOne.setName("Cheese");
		itemOne.setPrice(1.50);
		itemOne.setUpc(17778);
		itemOne.setDepartment("Dairy");
		
		foodStoreFacade.createItem(itemOne);
		
		assertTrue(
				foodStoreFacade.getItem(17778).getDepartment() == "Dairy" &&
				foodStoreFacade.getItem(17778).getPrice() == 1.50 &&
				foodStoreFacade.getItem(17778).getName() == "Cheese"
				);
	}

	@Test
	public void testGetItem() {
		assertTrue(foodStoreFacade.getItem(12345).getName() == "Milk");
	}

	@Test
	public void testGetItemDeparment() {
		assertTrue(foodStoreFacade.getItem(12345).getDepartment() == "Dairy");
	}

	@Test
	public void testCreateStore() {
		Store sto = new Store();
		sto.setName("Super Cheap Food");
		sto.setStoreId(56);
		sto.setCity("Camden");
		
		foodStoreFacade.createStore(sto);
		
		assertTrue(foodStoreFacade.getStore(56).getCity() == "Camden");
	}

	@Test
	public void testGetStore() {
		assertTrue(foodStoreFacade.getStore(1).getName() == "Food Stop");
	}

	@Test
	public void testGetStoreName() {
		assertTrue(
				foodStoreFacade.getStore(1) != null &&
				!foodStoreFacade.getStore(1).getName().isEmpty()
				);
	}

}
