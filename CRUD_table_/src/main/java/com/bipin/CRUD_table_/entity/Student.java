package com.bipin.CRUD_table_.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Student_table")
@Table(name="Student_table")
public class Student 
{
	@Id
	private int ID;
	private String Name;
	private String Email;
	private String Phone;
	private String Address;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + ", Address=" + Address
				+ "]";
	}
	
    

}
