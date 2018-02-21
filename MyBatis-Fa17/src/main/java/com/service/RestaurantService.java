package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.RestaurantDAO;
import com.domain.Restaurant;
import com.domain.RestaurantExample;

public class RestaurantService {	
	 @Autowired
	    private RestaurantDAO dataaccess = new RestaurantDAO();
	 
		public RestaurantService() {
			super();
			// TODO Auto-generated constructor stub
		}

		 public  int deleteByPrimaryKey(Short RestId) {
			 int result=0;
			 try {
			 result=dataaccess.deleteByPrimaryKey(RestId);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
		 };

		 public  int insert(Restaurant record) {
			 int result=0;
			 try {
			 result=dataaccess.insert(record);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
		 };

		 public int insertSelective(Restaurant record) {
			 int result=0;
			 try {
			 result=dataaccess.insertSelective(record);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
		  };

		 public List<Restaurant> selectByExample(RestaurantExample example){
			   List<Restaurant> recordList = new ArrayList<Restaurant>();
			   recordList=dataaccess.selectByExample(example);		   
			   return recordList;
	   	};

		   public Restaurant selectByPrimaryKey(Short RestId) {
			   Restaurant record = new Restaurant();
			   record=dataaccess.selectByPrimaryKey(RestId);
			   return record;
			   
		   };

		   public int updateByPrimaryKeySelective(Restaurant record) {
			   
				 int result=0;
				 try {
				 result=dataaccess.updateByPrimaryKeySelective(record);
				 }
				 catch(Exception ex){
					 result=0;
				 }
				 return result;
			   
		   };

		   public int updateByPrimaryKey(Restaurant record) {
				 int result=0;
				 try {
				 result=dataaccess.updateByPrimaryKey(record);
				 }
				 catch(Exception ex){
					 result=0;
				 }
				 return result;
		   };

}
