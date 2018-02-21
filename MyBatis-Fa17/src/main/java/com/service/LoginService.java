package com.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.RestaurantCustomerDAO;
import com.domain.RestaurantCustomer;
import com.domain.RestaurantCustomerExample;
import com.service.RestaurantCustomerService;
import com.util.LoginMessage;

public class LoginService {
    @Autowired
    private RestaurantCustomerService custService= new RestaurantCustomerService();
    
	public LoginService() {
		super();
	}	
	
private boolean EmailAlreadyExists(RestaurantCustomer NewCustomer) {	
		
		String Email=NewCustomer.getEmail();
		String Password=NewCustomer.getPassword();
				
		Boolean success=false;
		RestaurantCustomerExample example = new RestaurantCustomerExample();				
       
		example.or()
			   .andEmailEqualToInsensitive(Email)//email is not case sensitive
			   .andPasswordEqualTo(Password);
		
		List<RestaurantCustomer> restCust = new ArrayList<RestaurantCustomer>();
		restCust=custService.selectByExample(example);
	
		if(!restCust.isEmpty()) {
			success=true;	
		} else {
			success=false;			
		}
		return success;
	}
	
	
	public int CreateNewUser(RestaurantCustomer NewCustomer) {	
				
		int insert=0;
		RestaurantCustomerService customerAccess = new RestaurantCustomerService();		
		//if (EmailAlreadyExists(NewCustomer)==false) {
     	insert=customerAccess.insertSelective(NewCustomer);		
		//}		
		return insert;
	}
	
	public LoginMessage Login(String Email,String Password) {
		
		Boolean success=false;
		String msg="No messsge changed";
		LoginMessage loginmessage =  new LoginMessage(success,msg);

		RestaurantCustomerExample example = new RestaurantCustomerExample();
		
		
        //public Criteria andEmailEqualToInsensitive(String value) {
        //addCriterion("upper(EMAIL) =", value.toUpperCase(), "email");
        //return (Criteria) this;
    	//}
					
		example.or()
		   .andEmailEqualToInsensitive(Email)
		   .andPasswordEqualTo(Password);
		
		if (custService.selectByExample(example).isEmpty()) {
			msg="Invalid user and password combination";
			success=false;
			LoginMessage loginfailed= new LoginMessage(false,msg);
			loginmessage=loginfailed;	
			
		}else {
			msg="Correct User and Password";
			success=true;
			LoginMessage correctuser= new LoginMessage(true,msg);
			loginmessage=correctuser;	
		}
		
		return loginmessage;
	}

}
