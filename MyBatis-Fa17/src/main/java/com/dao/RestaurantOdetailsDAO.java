package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.RestaurantOdetails;
import com.domain.RestaurantOdetailsExample;
import com.domain.RestaurantOdetailsKey;
import com.util.ConnectionFactory;

public class RestaurantOdetailsDAO {
	private SqlSession session;
	public RestaurantOdetailsDAO() {
		//set the connection in the constructor
		this.session =ConnectionFactory.getSqlSessionFactory().openSession();
	}
   
	public  int deleteByPrimaryKey(RestaurantOdetailsKey key) {
	
		 try {
				session.delete("com.mapper.RestaurantOdetailsMapper.deleteByPrimaryKey",key);
				session.commit();
				} finally {
				  session.close();
				}		 
		 return 1;
	 };

	 public  int insert(RestaurantOdetails record) {
		 try {
				session.insert("com.mapper.RestaurantOdetailsMapper.insert",record);
				session.commit();
				} finally {
				  session.close();
				}	 
	 
		   return 1;
	 };

	 public int insertSelective(RestaurantOdetails record) {
		 try {
				session.insert("com.mapper.RestaurantOdetailsMapper.insertSelective",record);
				session.commit();
				} finally {
				  session.close();
				}		 
	    return 1;		 
	  };

	 public List<RestaurantOdetails> selectByExample(RestaurantOdetailsExample example){
		   List<RestaurantOdetails> recordList = new ArrayList<RestaurantOdetails>();
		   try {
			   recordList=session.selectList("com.mapper.RestaurantOdetailsMapper.selectByExample", example);		   
		   
		   } finally {
			   session.close();
		   }
		   return recordList;
	  };

	   public RestaurantOdetails selectByPrimaryKey(RestaurantOdetailsKey key) {
		   RestaurantOdetails record = new RestaurantOdetails();		   
		   try {
			   record=session.selectOne("com.mapper.RestaurantOdetailsMapper.selectByPrimaryKey",key);
				} finally {
				  session.close();
				}		 
		   
		   return record;
		   
	   };

	   public int updateByPrimaryKeySelective(RestaurantOdetails record) {
		   
			 try {
					session.update("com.mapper.RestaurantOdetailsMapper.updateByPrimaryKeySelective",record);
					session.commit();
					} finally {
					  session.close();
					}
			   return 1;		   
	   };

	   public int updateByPrimaryKey(RestaurantOdetails record) {
			 try {
					session.update("com.mapper.RestaurantOdetailsMapper.updateByPrimaryKey",record);
					session.commit();
					} finally {
					  session.close();
					}
			   return 1;
	   };
	
}
