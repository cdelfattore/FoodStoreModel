package foodstore.dao;

import foodstore.model.Employee;
import foodstore.model.Item;
import foodstore.model.Store;

public interface FoodStoreDAO {
	
	/*
	 * Employee methods
	 */
	public Employee getEmployeeInfo(int employeeId);
	
	public Employee createEmployee(Employee e);
	
	public boolean updateEmployeeInfo(Employee e);
	
	public boolean removeEmployee(int employeeId);
	
	/*
	 * Item methods
	 */
	public Item getItemInfo(int upc);
	
	public Item createItem(Item i);
	
	public boolean updateItem(Item i);
	
	public boolean removeItem(int upc);
	
	/*
	 * Store methods
	 */
	public Store getStoreInfo(int storeId);
	
	public Store createStore(Store s);
	
	public boolean updateStore(Store s);
	
	public boolean removeStore(int storeId);
	
	

}
