package foodstore.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	
	private String lastName;
	
	private Date startDate;
	
	private Date endDate;
	
	private Date dateOfBirth;
	
	private int storeId;
	
	private String position;
	
	private String department;
	
	private int socialSecNum;
	
	private int employeeId;
	
	public Employee(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getSocialSecNum() {
		return socialSecNum;
	}

	public void setSocialSecNum(int socialSecNum) {
		this.socialSecNum = socialSecNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	

}
