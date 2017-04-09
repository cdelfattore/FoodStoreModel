/*
 * Class to represent a food store
 */
package foodstore.model;

import java.io.Serializable;

public class Store implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String city;
	
	private int storeId;
	
	public Store(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	
	

}
