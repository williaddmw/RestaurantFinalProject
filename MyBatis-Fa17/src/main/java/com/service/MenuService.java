package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.MenuDAO;
import com.domain.Menu;
import com.domain.MenuExample;
import com.domain.MenuKey;
import com.mapper.MenuMapper;

public class MenuService implements MenuMapper {	
	 @Autowired
	    private MenuDAO dataaccess = new MenuDAO();
	 
		public MenuService() {
			super();
			// TODO Auto-generated constructor stub
		}

		 public int deleteByPrimaryKey(MenuKey key){
			 int result=0;
			 try {
			 result=dataaccess.deleteByPrimaryKey(key);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
		 };

		 public  int insert(Menu record) {
			 int result=0;
			 try {
			 result=dataaccess.insert(record);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
		 };

		 public int insertSelective(Menu record) {
			 int result=0;
			 try {
			 result=dataaccess.insertSelective(record);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
		  };

		 public List<Menu> selectByExample(MenuExample example){
			   List<Menu> recordList = new ArrayList<Menu>();
			   recordList=dataaccess.selectByExample(example);		   
			   return recordList;
	   	};

	   	public Menu selectByPrimaryKey(MenuKey key){
			   Menu record = new Menu();
			   record=dataaccess.selectByPrimaryKey(key);
			   return record;
			   
		   };

		   public int updateByPrimaryKeySelective(Menu record) {
			   
				 int result=0;
				 try {
				 result=dataaccess.updateByPrimaryKeySelective(record);
				 }
				 catch(Exception ex){
					 result=0;
				 }
				 return result;
			   
		   };

		   public int updateByPrimaryKey(Menu record) {
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
