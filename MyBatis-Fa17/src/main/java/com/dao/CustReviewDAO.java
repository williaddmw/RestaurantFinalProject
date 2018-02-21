package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.CustReview;
import com.domain.CustReviewExample;
import com.util.ConnectionFactory;

public class CustReviewDAO {

	private SqlSession session;
	public CustReviewDAO() {
		//set the connection in the constructor
		this.session =ConnectionFactory.getSqlSessionFactory().openSession();
	}
   
	public  int deleteByPrimaryKey(Short reviewid) {
	
		 try {
				session.delete("com.mapper.CustReviewMapper.deleteByPrimaryKey",reviewid);
				} finally {
				  session.close();
				}		 
		 return 1;
	 };

	 public  int insert(CustReview record) {
		 try {
				session.insert("com.mapper.CustReviewMapper.insert",record);
				session.commit();
				} finally {
				  session.close();
				}	 
	 
		   return 1;
	 };

	 public int insertSelective(CustReview record) {
		 try {
				session.insert("com.mapper.CustReviewMapper.insertSelective",record);
				session.commit();
				} finally {
				  session.close();
				}		 
	    return 1;		 
	  };

	 public List<CustReview> selectByExample(CustReviewExample example){
		   List<CustReview> recordList = new ArrayList<CustReview>();
		   try {
			   recordList=session.selectList("com.mapper.CustReviewMapper.selectByExample", example);		   
		   
		   } finally {
			   session.close();
		   }
		   return recordList;
	};

	   public CustReview selectByPrimaryKey(Short reviewid){
		   CustReview record = new CustReview();		   
		   try {
			   record=session.selectOne("com.mapper.CustReviewMapper.selectByPrimaryKey",reviewid);
				} finally {
				  session.close();
				}		 
		   
		   return record;
		   
	   };

	   public int updateByPrimaryKeySelective(CustReview record) {
		   
			 try {
					session.update("com.mapper.CustReviewMapper.updateByPrimaryKeySelective",record);
					} finally {
					  session.close();
					}
			   return 1;		   
	   };

	   public int updateByPrimaryKey(CustReview record) {
			 try {
					session.update("com.mapper.CustReviewMapper.updateByPrimaryKey",record);
					} finally {
					  session.close();
					}
			   return 1;
	   };
	
}
