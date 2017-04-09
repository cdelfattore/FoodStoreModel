/*
 * Chris Del Fattore
 * CECS-640-50
 * Implementation of the FoodStoreFacade java class
 */
package foodstore.services.impl;

import foodstore.dao.FoodStoreDAO;
import foodstore.model.Employee;
import foodstore.model.Item;
import foodstore.model.Store;
import foodstore.services.FoodStoreFacade;

public class FoodStoreFacadeImpl implements FoodStoreFacade {
	
	private FoodStoreDAO foodStoreDAO;
	
	public FoodStoreDAO getFoodStoreDAO() {
		return foodStoreDAO;
	}

	public void setFoodStoreDAO(FoodStoreDAO foodStoreDAO) {
		this.foodStoreDAO = foodStoreDAO;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return foodStoreDAO.getEmployeeInfo(employeeId);
	}

	@Override
	public boolean createEmployee(Employee newEmployee) {
		return foodStoreDAO.createEmployee(newEmployee);
	}

	@Override
	public boolean currentlyEmployed(int employeeId) {
		Employee emp = foodStoreDAO.getEmployeeInfo(employeeId);
		//if the end date is null, then employee is currently working for the store
		return emp.getEndDate() != null;
	}

	@Override
	public boolean createItem(Item newItem) {
		return foodStoreDAO.createItem(newItem);
	}

	@Override
	public Item getItem(int upc) {
		return foodStoreDAO.getItemInfo(upc);
	}

	@Override
	public String getItemDeparment(int upc) {
		return foodStoreDAO.getItemInfo(upc).getDepartment();
	}

	@Override
	public boolean createStore(Store newStore) {
		return foodStoreDAO.createStore(newStore);
	}

	@Override
	public Store getStore(int storeId) {
		return foodStoreDAO.getStoreInfo(storeId);
	}

	@Override
	public String getStoreName(int storeId) {
		return foodStoreDAO.getStoreInfo(storeId).getName();
	}

}
