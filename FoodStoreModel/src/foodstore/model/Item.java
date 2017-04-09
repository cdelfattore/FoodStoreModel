/*
 * Class that represents and item sold at the store
 */
package foodstore.model;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String department;
	
	private int upc;
	
	private double price;
	
	public Item(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getUpc() {
		return upc;
	}

	public void setUpc(int upc) {
		this.upc = upc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
