/*
 * Chris Del Fattore
 * CECS-640-50
 * This class contains hard coded data that would normally be stored in a database.
 * The data represents a food store with items and employees.
 */
package foodstore.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import foodstore.dao.FoodStoreDAO;
import foodstore.model.Employee;
import foodstore.model.Item;
import foodstore.model.Store;

public class FoodStoreDAOImpl implements FoodStoreDAO {
	
	private static FoodStoreDAOImpl foodStoreDAO = null;
	
	//In-memory copy of the data
	private HashMap<Integer, Store> storeMap = new HashMap<Integer, Store>();
	
	private HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	
	private HashMap<Integer, Item> itemMap = new HashMap<Integer, Item>();
	
	public static FoodStoreDAO getFoodStoreDAO(){
		if(foodStoreDAO == null){
			foodStoreDAO = new FoodStoreDAOImpl();
		}
		
		//init method will create the data
		foodStoreDAO.init();
		
		return foodStoreDAO;
	}
	
	/*
	 * Below init method is used to create all of the test data.
	 * 
	 */
	private void init() throws ParseException {
		//simple date format used for date variables
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//create three stores
		Store storeOne = new Store();
		storeOne.setName("Food Stop");
		storeOne.setStoreId(1);
		storeOne.setCity("Springfield");
		storeMap.put(storeOne.getStoreId(), storeOne);
		
		Store storeTwo = new Store();
		storeTwo.setName("Shop Town");
		storeTwo.setStoreId(2);
		storeTwo.setCity("Newark");
		storeMap.put(storeTwo.getStoreId(), storeTwo);
		
		Store storeThree = new Store();
		storeThree.setName("Half Foods");
		storeThree.setStoreId(3);
		storeThree.setCity("Trenton");
		storeMap.put(storeThree.getStoreId(), storeThree);
		
		//Create and employee for each store
		Employee empOne = new Employee();
		empOne.setFirstName("Casey");
		empOne.setLastName("Jones");
		empOne.setStartDate(sdf.parse("2014-01-01"));
		//empOne.setEndDate(null);
		empOne.setDateOfBirth(sdf.parse("1990-04-01"));
		empOne.setStoreId(1);
		empOne.setPosition("Manager");
		empOne.setDepartment("Meat");
		empOne.setSocialSecNum(123456789);
		empOne.setEmployeeId(1);
		employeeMap.put(empOne.getEmployeeId(), empOne);
		
		Employee empTwo = new Employee();
		empTwo.setFirstName("Walter");
		empTwo.setLastName("Smith");
		empTwo.setStartDate(sdf.parse("2017-09-01"));
		//empTwo.setEndDate(null);
		empTwo.setDateOfBirth(sdf.parse("2000-11-23"));
		empTwo.setStoreId(2);
		empTwo.setPosition("Cashier");
		empTwo.setDepartment("Front End");
		empTwo.setSocialSecNum(132321123);
		empTwo.setEmployeeId(2);
		employeeMap.put(empTwo.getEmployeeId(), empTwo);
		
		Employee empThree = new Employee();
		empThree.setFirstName("Lauren");
		empThree.setLastName("James");
		empThree.setStartDate(sdf.parse("2012-10-25"));
		//empThree.setEndDate(null);
		empThree.setDateOfBirth(sdf.parse("1983-11-23"));
		empThree.setStoreId(3);
		empThree.setPosition("Grocery");
		empThree.setDepartment("Stock Engineer");
		empThree.setSocialSecNum(111111111);
		empThree.setEmployeeId(3);
		employeeMap.put(empThree.getEmployeeId(), empThree);
		
		//create three items for the three stores
		
		
		
		
	}

	@Override
	public Employee getEmployeeInfo(int employeeId) {
		return employeeMap.get(new Integer(employeeId));
	}

	@Override
	public boolean createEmployee(Employee e) {
		employeeMap.put(e.getEmployeeId(), e);
		return employeeMap.get(e.getEmployeeId()) != null;
	}

	@Override
	public boolean updateEmployeeInfo(Employee e) {
		//employeeMap.remove(new Integer(e.getEmployeeId()));
		employeeMap.put(new Integer(e.getEmployeeId()), e);
		return employeeMap.get(new Integer(e.getEmployeeId())) != null;
	}

	@Override
	public boolean removeEmployee(int employeeId) {
		employeeMap.remove(new Integer(employeeId));
		return employeeMap.get(new Integer(employeeId)) == null;
	}

	@Override
	public Item getItemInfo(int upc) {
		return itemMap.get(new Integer(upc));
	}

	@Override
	public boolean createItem(Item i) {
		itemMap.put(new Integer(i.getUpc()), i);
		return itemMap.get(new Integer(i.getUpc())) != null;
	}

	@Override
	public boolean updateItem(Item i) {
		//itemMap.remove(new Integer(i.getUpc()));
		itemMap.put(new Integer(i.getUpc()), i);
		return itemMap.get(new Integer(i.getUpc())) != null;
	}

	@Override
	public boolean removeItem(int upc) {
		itemMap.remove(new Integer(upc));
		return itemMap.get(new Integer(upc)) == null;
	}

	@Override
	public Store getStoreInfo(int storeId) {
		return storeMap.get(new Integer(storeId));
	}

	@Override
	public boolean createStore(Store s) {
		storeMap.put(new Integer(s.getStoreId()), s);
		return storeMap.get(new Integer(s.getStoreId())) != null;
	}

	@Override
	public boolean updateStore(Store s) {
		storeMap.put(new Integer(s.getStoreId()), s);
		return storeMap.get(new Integer(s.getStoreId())) != null;
	}

	@Override
	public boolean removeStore(int storeId) {
		storeMap.remove(new Integer(storeId));
		return storeMap.get(new Integer(storeId)) == null;
	}

}
