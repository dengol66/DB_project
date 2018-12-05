package com.example.demo;

public class Customer {
	
	private String Customercode;
	private String FName;
	private String LName;
	private String PhoneNumber;
	private String Age;
	private String Sex;
	private String Works;
	private String Ttype;
	private String ID;
	private String Password;
	public Customer() {
	}
	
	public Customer(String fName, String lName, String phoneNumber, String age, String sex,
			String works, String ttype, String iD, String password) {
		super();
		Customercode = "0";
		FName = fName;
		LName = lName;
		PhoneNumber = phoneNumber;
		Age = age;
		Sex = sex;
		Works = works;
		Ttype = ttype;
		ID = iD;
		Password = password;
	}
	public String getCustomercode() {
		return Customercode;
	}
	public void setCustomercode(String customercode) {
		Customercode = customercode;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getWorks() {
		return Works;
	}
	public void setWorks(String works) {
		Works = works;
	}
	public String getTtype() {
		return Ttype;
	}
	public void setTtype(String ttype) {
		Ttype = ttype;
	}
	@Override
	public String toString() {
		return "Customer [Customercode=" + Customercode + ", FName=" + FName + ", LName=" + LName + ", PhoneNumber="
				+ PhoneNumber + ", Age=" + Age + ", Sex=" + Sex + ", Works=" + Works + ", Ttype=" + Ttype + "]";
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}