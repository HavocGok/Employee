package com.sql.employee_management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDao {
	private Connection con;
	private Statement st;
	public EmployeeDao()
	{
		Class.forName("com.mysql.cj.jdbc.Driver");)
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b7262","gokul","12345678900987654321");
	}
	
	public void createTable() {
		try {
			st = con.createStatement();
			String sql = "create table employee(empid int primary key, empname varchar(30), empdept varchar(10), empDOJ date)";
			st.execute(sql);
		} catch (SQLException e) {
			System.out.println("DATABASE ERROR...");
		}
	}
	
	public void insertEmployeeData(int empid,String empname, String dept, String empDOJ)
	{
		try {
			st = con.createStatement();
			String sql = "insert into employee values("+empid+",'"+empname+"','"+dept+"','"+empDOJ+"')";
			st.execute(sql);
		} catch (SQLException e) {
			System.out.println("DATABASE ERROR...");
		}		
	}
}
