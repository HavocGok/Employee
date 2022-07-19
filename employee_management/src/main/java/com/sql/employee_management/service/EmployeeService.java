package com.sql.employee_management.service;

import com.sql.employee_management.dao.EmployeeDao;

public class EmployeeService {
	private EmployeeDao empdao;
	
	public void create empTable()
	{
		empdao.createTable();
		System.out.println("Table created successfully");
	}
}
