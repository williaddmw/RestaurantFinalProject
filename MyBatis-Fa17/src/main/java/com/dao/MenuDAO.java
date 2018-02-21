package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.Menu;
import com.domain.MenuExample;
import com.domain.MenuKey;
import com.util.ConnectionFactory;

public class MenuDAO {

	private SqlSession session;
	public MenuDAO() {
		//set the connection in the constructor
		this.session =ConnectionFactory.getSqlSessionFactory().openSession();
	}
	
	public  int deleteByPrimaryKey(MenuKey key) {		
		 try {
				session.delete("com.mapper.MenuMapper.deleteByPrimaryKey",key);
				} finally {
				  session.close();
				}		 
		 return 1;
	 };

	 public  int insert(Menu record) {
		 try {
				session.insert("com.mapper.MenuMapper.insert",record);
				} finally {
				  session.close();
				}	 
	 
		   return 1;
	 };

	 public int insertSelective(Menu record) {
		 try {
				session.insert("com.mapper.MenuMapper.insertSelective",record);
				} finally {
				  session.close();
				}		 
	    return 1;		 
	  };

	 public List<Menu> selectByExample(MenuExample example){
		   List<Menu> recordList = new ArrayList<Menu>();
		   try {
			   recordList=session.selectList("com.mapper.MenuMapper.selectByExample", example);		   
		   
		   } finally {
			   session.close();
		   }
		   return recordList;
	};

	   public Menu selectByPrimaryKey(MenuKey key){
		   Menu record = new Menu();		   
		   try {
			   record=session.selectOne("com.mapper.MenuMapper.selectByPrimaryKey",key);
				} finally {
				  session.close();
				}		 
		   
		   return record;
		   
	   };

	   public int updateByPrimaryKeySelective(Menu record) {
		   
			 try {
					session.update("com.mapper.MenuMapper.updateByPrimaryKeySelective",record);
					} finally {
					  session.close();
					}
			   return 1;		   
	   };

	   public int updateByPrimaryKey(Menu record) {
			 try {
					session.update("com.mapper.MenuMapper.updateByPrimaryKey",record);
					} finally {
					  session.close();
					}
			   return 1;
	   };

}
