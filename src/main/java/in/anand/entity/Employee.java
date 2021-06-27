package in.anand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="Emp_Id")
	private Integer employeeID;
	@Column(name="Emp_Name")
	private String employeeName;
	@Column(name="Emp_Saly")
	private Float employeeSalary;
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	

}
