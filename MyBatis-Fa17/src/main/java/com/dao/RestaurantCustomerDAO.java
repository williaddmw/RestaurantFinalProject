package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.RestaurantCustomer;
import com.domain.RestaurantCustomerExample;
import com.util.ConnectionFactory;

public class RestaurantCustomerDAO {

	private SqlSession session;
	public RestaurantCustomerDAO() {
		//set the connection in the constructor
		this.session =ConnectionFactory.getSqlSessionFactory().openSession();
	}
   
	public  int deleteByPrimaryKey(String email) {
	
		 try {
				session.delete("com.mapper.RestaurantCustomerMapper.deleteByPrimaryKey",email);
				session.commit();
				} finally {
				  session.close();
				}		 
		 return 1;
	 };

	 public  int insert(RestaurantCustomer record) {
		 try {
				session.insert("com.mapper.RestaurantCustomerMapper.insert",record);
				session.commit();
				} finally {
				  session.close();
				}	 
	 
		   return 1;
	 };

	 public int insertSelective(RestaurantCustomer record) {
		 try {
				session.insert("com.mapper.RestaurantCustomerMapper.insertSelective",record);
				session.commit();
				} finally {
				  session.close();
				}		 
	    return 1;		 
	  };

	 public List<RestaurantCustomer> selectByExample(RestaurantCustomerExample example){
		   List<RestaurantCustomer> recordList = new ArrayList<RestaurantCustomer>();
		   try {
			   recordList=session.selectList("com.mapper.RestaurantCustomerMapper.selectByExample", example);		   
		   
		   } finally {
			   session.close();
		   }
		   return recordList;
	};

	   public RestaurantCustomer selectByPrimaryKey(String email) {
		   RestaurantCustomer record = new RestaurantCustomer();		   
		   try {
			   record=session.selectOne("com.mapper.RestaurantCustomerMapper.selectByPrimaryKey",email);
				} finally {
				  session.close();
				}		 
		   
		   return record;
		   
	   };

	   public int updateByPrimaryKeySelective(RestaurantCustomer record) {
		   
			 try {
					session.update("com.mapper.RestaurantCustomerMapper.updateByPrimaryKeySelective",record);
					session.commit();
					} finally {
					  session.close();
					}
			   return 1;		   
	   };

	   public int updateByPrimaryKey(RestaurantCustomer record) {
			 try {
					session.update("com.mapper.RestaurantCustomerMapper.updateByPrimaryKey",record);
					session.commit();
					} finally {
					  session.close();
					}
			   return 1;
	   };
	
	
}
