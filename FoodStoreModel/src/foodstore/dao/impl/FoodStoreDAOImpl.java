/*
 * Chris Del Fattore
 * CECS-640-50
 * This class contains hard coded data that would normally be stored in a database.
 * The data represents a food store with items and employees.
 */
package foodstore.dao.impl;

import java.util.HashMap;

import foodstore.dao.FoodStoreDAO;
import foodstore.model.Employee;
import foodstore.model.Item;
import foodstore.model.Store;

public class FoodStoreDAOImpl implements FoodStoreDAO {
	
	//In-memory copy of the data
	private HashMap<Integer, Store> storeMap = new HashMap<Integer, Store>();
	
	private HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	
	private HashMap<Integer, Item> itemMap = new HashMap<Integer, Item>();

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
