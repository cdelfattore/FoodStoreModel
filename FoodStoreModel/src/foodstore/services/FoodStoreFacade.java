package foodstore.services;

import foodstore.model.Employee;
import foodstore.model.Item;
import foodstore.model.Store;

public interface FoodStoreFacade {
	
	/*
	 * Methods for Employee
	 */
	public Employee getEmployee(int employeeId);
	
	public Employee createEmployee(Employee newEmployee);
	
	public boolean currentlyEmployed(int employeeId);
	
	/*
	 * Methods for Item
	 */
	public Item createItem(Item newItem);
	
	public Item getItem(int upc);
	
	public String getItemDeparment(int upc);
	
	/*
	 * Methods for Store
	 */
	public Store createStore(Store newStore);
	
	public Store getStore(int storeId);
	
	public String getStoreName(int storeId);

}
