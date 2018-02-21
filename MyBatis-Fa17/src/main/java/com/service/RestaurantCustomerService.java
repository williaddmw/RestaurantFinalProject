package com.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.dao.RestaurantCustomerDAO;
import com.domain.RestaurantCustomer;
import com.domain.RestaurantCustomerExample;
import com.mapper.RestaurantCustomerMapper;

public class RestaurantCustomerService implements RestaurantCustomerMapper
{
    @Autowired
    private RestaurantCustomerDAO dataaccess = new RestaurantCustomerDAO();
 
	public RestaurantCustomerService() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public  int deleteByPrimaryKey(String email) {
		 int result=0;
		 try {
		 result=dataaccess.deleteByPrimaryKey(email);
		 }
		 catch(Exception ex){
			 result=0;
		 }
		 return result;
	 };

	 public  int insert(RestaurantCustomer record) {
		 int result=0;
		 try {
		 result=dataaccess.insert(record);
		 }
		 catch(Exception ex){
			 result=0;
		 }
		 return result;
	 };

	 public int insertSelective(RestaurantCustomer record) {
		 int result=0;
		 try {
		 result=dataaccess.insertSelective(record);
		 }
		 catch(Exception ex){
			 result=0;
		 }
		 return result;
	  };

	 public List<RestaurantCustomer> selectByExample(RestaurantCustomerExample example){
		   List<RestaurantCustomer> recordList = new ArrayList<RestaurantCustomer>();
		   recordList=dataaccess.selectByExample(example);		   
		   return recordList;
   	};

	   public RestaurantCustomer selectByPrimaryKey(String email) {
		   RestaurantCustomer record = new RestaurantCustomer();
		   record=dataaccess.selectByPrimaryKey(email);
		   return record;
		   
	   };

	   public int updateByPrimaryKeySelective(RestaurantCustomer record) {
		   
			 int result=0;
			 try {
			 result=dataaccess.updateByPrimaryKeySelective(record);
			 }
			 catch(Exception ex){
				 result=0;
			 }
			 return result;
		   
	   };

	   public int updateByPrimaryKey(RestaurantCustomer record) {
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
