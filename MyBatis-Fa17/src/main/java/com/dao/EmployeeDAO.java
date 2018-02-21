package com.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.util.ConnectionFactory;

import com.domain.Employee;

public class EmployeeDAO {

	public EmployeeDAO() {
		
	}
	public List<Employee> getEmpList() {
	
		SqlSession session = 
				ConnectionFactory.getSqlSessionFactory().openSession();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			empList = session.selectList("com.mapper.CompanyMapper.selectAllemployees");
			} finally {
			  session.close();
			}
		
		return empList;
	}
	
	public List<Employee> getEmpListBySalary(BigDecimal salary) {
		SqlSession session = 
				ConnectionFactory.getSqlSessionFactory().openSession();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			empList = session.selectList("com.mapper.CompanyMapper.selectBySalary",salary);
			} finally {
			  session.close();
			}
		
		return empList;
	}
	
	
	public List<HashMap<String,Object>> getSelectAllDepts() {
		SqlSession session = 
				ConnectionFactory.getSqlSessionFactory().openSession();
		List<HashMap<String,Object>> deptList = new ArrayList<HashMap<String,Object>>();
		
		try {
			deptList = session.selectList("com.mapper.CompanyMapper.selectAllDepts");
			} finally {
			  session.close();
			}
		
		return deptList;
	}

	

}
