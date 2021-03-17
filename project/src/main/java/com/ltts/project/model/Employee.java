package com.ltts.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String email;
	private String mobile;
	private String password;
	private String user_name;
	private String employeeid;
	private String department;
	private String designation;
	private String employeename;
	private String immediatesupervisor;
	public Employee() {
		super();
	}
	
	public Employee(String email, String mobile, String password, String user_name, String employeeid,
			String department, String designation, String employeename, String immediatesupervisor) {
		super();
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.user_name = user_name;
		this.employeeid = employeeid;
		this.department = department;
		this.designation = designation;
		this.employeename = employeename;
		this.immediatesupervisor = immediatesupervisor;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getImmediatesupervisor() {
		return immediatesupervisor;
	}
	public void setImmediatesupervisor(String immediatesupervisor) {
		this.immediatesupervisor = immediatesupervisor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Employee [email=" + email + ", mobile=" + mobile + ", password=" + password + ", user_name=" + user_name
				+ ", employeeid=" + employeeid + ", department=" + department + ", designation=" + designation
				+ ", employeename=" + employeename + ", immediatesupervisor=" + immediatesupervisor + "]";
	}
}