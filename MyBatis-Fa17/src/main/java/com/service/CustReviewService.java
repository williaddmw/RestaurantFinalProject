package com.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.dao.CustReviewDAO;
import com.dao.SequenceDAO;
import com.domain.CustReview;
import com.domain.CustReviewExample;
import com.mapper.CustReviewMapper;



public class CustReviewService implements CustReviewMapper
{
    @Autowired
    private CustReviewDAO dataaccess = new CustReviewDAO();
    private SequenceDAO sequence = new SequenceDAO();
    
    private String errormsg;
 
	public CustReviewService() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public  int deleteByPrimaryKey(Short reviewid) {
		 int result=0;
		 try {
		 result=dataaccess.deleteByPrimaryKey(reviewid);
		 }
		 catch(Exception ex){
			 result=0;
		 }
		 return result;
	 };

	 public  int insert(CustReview record) {
		 int result=0;
		 //adjust review id to sequence
		 Short inserterd=sequence.nextReview();
		 record.setReviewid(inserterd);		 
		 
		 try {
		 result=dataaccess.insert(record);
		 result=(int)inserterd;
		 }
		 catch(Exception ex){
			 this.errormsg=ex.getMessage();
			 result=10001;
		 }
		 return result;
	 };

	 public int insertSelective(CustReview record) {
		 int result=0;
		 Short inserterd=sequence.nextReview();
		 
		 try {
	     //adjust review id to sequence		
		 record.setReviewid(inserterd);			 
		 result=dataaccess.insertSelective(record);
		 result=(int)inserterd;
		 }
		 catch(Exception ex){
			 result=10002;
			 this.errormsg=ex.getMessage();
		 }
		 return result;
	  };

	 public List<CustReview> selectByExample(CustReviewExample example){
		   List<CustReview> recordList = new ArrayList<CustReview>();
		   recordList=dataaccess.selectByExample(example);		   
		   return recordList;
   	};

	   public CustReview selectByPrimaryKey(Short reviewid) {
		   CustReview record = new CustReview();
		   record=dataaccess.selectByPrimaryKey(reviewid);		   
		   return record;		   
	   };

	   public int updateByPrimaryKeySelective(CustReview record) {
		   
			 int result=0;
			 try {
			 result=dataaccess.updateByPrimaryKeySelective(record);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;		   
	   };

	   public int updateByPrimaryKey(CustReview record) {
			 int result=0;
			 try {
			 result=dataaccess.updateByPrimaryKey(record);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
	   };
	   
	   public String getError() {
		   return errormsg;
	   }
}
