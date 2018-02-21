package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.domain.Restaurant;
import com.domain.RestaurantExample;
import com.util.ConnectionFactory;

public class RestaurantDAO {
	private SqlSession session;
	public RestaurantDAO() {
		//set the connection in the constructor
		this.session =ConnectionFactory.getSqlSessionFactory().openSession();
	}
   
	public  int deleteByPrimaryKey(Short restid) {

		 try {
				session.delete("com.mapper.RestaurantMapper.deleteByPrimaryKey",restid);
				} finally {
				  session.close();
				}		 
		 return 1;
	 };

	 public  int insert(Restaurant record) {
		 try {
			 
				session.insert("com.mapper.RestaurantMapper.insert",record);
				} finally {
				  session.close();
				}	 
	 
		   return 1;
	 };

	 public int insertSelective(Restaurant record) {
		 try {
				session.insert("com.mapper.RestaurantMapper.insertSelective",record);
				} finally {
				  session.close();
				}		 
	    return 1;		 
	  };

	 public List<Restaurant> selectByExample(RestaurantExample example){
		   List<Restaurant> recordList = new ArrayList<Restaurant>();
		   try {
			   recordList=session.selectList("com.mapper.RestaurantMapper.selectByExample", example);		   
		   
		   } finally {
			   session.close();
		   }
		   return recordList;
	};

	   public Restaurant selectByPrimaryKey(Short restid) {
		   Restaurant record = new Restaurant();		   
		   try {
			   record=session.selectOne("com.mapper.RestaurantMapper.selectByPrimaryKey",restid);
				} finally {
				  session.close();
				}	 
		   
		   return record;
		   
	   };

	   public int updateByPrimaryKeySelective(Restaurant record) {
		   
			 try {
					session.update("com.mapper.RestaurantMapper.updateByPrimaryKeySelective",record);
					} finally {
					  session.close();
					}
			   return 1;		   
	   };

	   public int updateByPrimaryKey(Restaurant record) {
			 try {
					session.update("com.mapper.RestaurantMapper.updateByPrimaryKey",record);
					} finally {
					  session.close();
					}
			   return 1;
	   };

}
