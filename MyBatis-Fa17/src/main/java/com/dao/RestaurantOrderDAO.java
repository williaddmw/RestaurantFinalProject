package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.RestaurantOrder;
import com.domain.RestaurantOrderExample;
import com.util.ConnectionFactory;

public class RestaurantOrderDAO {

	private SqlSession session;
	public RestaurantOrderDAO() {
		//set the connection in the constructor
		this.session =ConnectionFactory.getSqlSessionFactory().openSession();
	}
   
	public  int deleteByPrimaryKey(Short OrderId) {
	
		 try {
				session.delete("com.mapper.RestaurantOrderMapper.deleteByPrimaryKey",OrderId);
				session.commit();
				} finally {
				  session.close();
				}		 
		 return 1;
	 };

	 public  int insert(RestaurantOrder record) {
		 try {
				session.insert("com.mapper.RestaurantOrderMapper.insert",record);
				session.commit();
				} finally {
				  session.close();
				}	 
	 
		   return 1;
	 };

	 public int insertSelective(RestaurantOrder record) {
		 try {
				session.insert("com.mapper.RestaurantOrderMapper.insertSelective",record);
				session.commit();
				} finally {
				  session.close();
				}		 
	    return 1;		 
	  };

	 public List<RestaurantOrder> selectByExample(RestaurantOrderExample example){
		   List<RestaurantOrder> recordList = new ArrayList<RestaurantOrder>();
		   try {
			   recordList=session.selectList("com.mapper.RestaurantOrderMapper.selectByExample", example);		   
		   
		   } finally {
			   session.close();
		   }
		   return recordList;
	};

	   public RestaurantOrder selectByPrimaryKey(Short OrderId) {
		   RestaurantOrder record = new RestaurantOrder();		   
		   try {
			   record=session.selectOne("com.mapper.RestaurantOrderMapper.selectByPrimaryKey",OrderId);
				} finally {
				  session.close();
				}		 
		   
		   return record;
		   
	   };

	   public int updateByPrimaryKeySelective(RestaurantOrder record) {
		   
			 try {
					session.update("com.mapper.RestaurantOrderMapper.updateByPrimaryKeySelective",record);
					session.commit();
					} finally {
					  session.close();
					}
			   return 1;		   
	   };

	   public int updateByPrimaryKey(RestaurantOrder record) {
			 try {
					session.update("com.mapper.RestaurantOrderMapper.updateByPrimaryKey",record);
					session.commit();
					} finally {
					  session.close();
					}
			   return 1;
	   };
	
	
}
