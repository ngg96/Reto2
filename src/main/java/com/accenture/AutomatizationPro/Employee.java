package com.accenture.AutomatizationPro;

public class Employee {
	
	public String Name;
	public String Company;
	public String Email;
	public double Salary;
	public Employee() {}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Employee(String name, String company, String email, double salary) {
		super();
		Name = name;
		Company = company;
		Email = email;
		Salary = salary;
	}
	
}
