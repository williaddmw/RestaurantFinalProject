package com.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.EmployeeDAO;
import com.domain.Employee;
import com.util.ConnectionFactory;

public class EmployeeService {
	
	public EmployeeService() {
		
	}
	
	public List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<Employee>();
		EmployeeDAO empDAO = new EmployeeDAO();
		empList = empDAO.getEmpList();
		
		return empList;
		
	}
	
	public List<Employee> getEmpListBySalary(BigDecimal salary) {
		List<Employee> empList = new ArrayList<Employee>();
		EmployeeDAO empDAO = new EmployeeDAO();
		empList = empDAO.getEmpListBySalary(salary);
		
		return empList;	
		
	}
	
	public List<HashMap<String,Object>> getSelectAllDepts() {
		List<HashMap<String,Object>> deptList = new ArrayList<HashMap<String,Object>>();
		EmployeeDAO empDAO = new EmployeeDAO();
		deptList = empDAO.getSelectAllDepts();			
		return deptList;
	}
	
	

}
