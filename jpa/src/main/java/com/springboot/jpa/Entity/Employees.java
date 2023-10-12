package com.springboot.jpa.Entity;

import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	private String employee_name;
	
	@NotNull(message="department name is required")
	private String department;
	private Date joiningdate;
	private int age;
	private String address;
	private float salary;
	private ZonedDateTime lefton;
	private boolean leftjob;
	
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public ZonedDateTime getLefton() {
		return lefton;
	}
	public void setLefton(ZonedDateTime lefton) {
		this.lefton = lefton;
	}
	public boolean isLeftjob() {
		return leftjob;
	}
	public void setLeftjob(boolean leftjob) {
		this.leftjob = leftjob;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", employee_name=" + employee_name + ", department="
				+ department + ", joiningdate=" + joiningdate + ", age=" + age + ", address=" + address + ", salary="
				+ salary + ", lefton=" + lefton + ", leftjob=" + leftjob + ", getDepartment()=" + getDepartment()
				+ ", getJoiningdate()=" + getJoiningdate() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", getSalary()=" + getSalary() + ", getLefton()=" + getLefton() + ", isLeftjob()=" + isLeftjob()
				+ ", getEmployee_name()=" + getEmployee_name() + ", getEmployee_id()=" + getEmployee_id()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
