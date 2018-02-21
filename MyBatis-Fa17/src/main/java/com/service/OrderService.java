package com.service;

import com.domain.RestaurantOrder;
import com.domain.RestaurantOrderExample;
import com.domain.RestaurantOdetails;
import com.domain.RestaurantOdetailsExample;

import com.dao.RestaurantOrderDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.RestaurantOdetailsDAO;
import com.dao.SequenceDAO;

public class OrderService {
	private String customeremail;

	public OrderService() {
		super();
	}
	public OrderService(String CustomerEmail) {
		this.customeremail=CustomerEmail;
		// TODO Auto-generated constructor stub
	}
	
	public String OrderPlace(Short RestId,String FoodName, int Quantity,String DineIn,String Delivery,String Pickup ) {

	    RestaurantOdetails odetails= new RestaurantOdetails();		
	    Short nextorder;
	    
		nextorder=this.CreatedOrder(RestId, FoodName, DineIn, Delivery, Pickup);
		String message="Created Order = "+nextorder;
		
			RestaurantOdetailsDAO odetailsAccess = new RestaurantOdetailsDAO();			
			odetails.setOno(nextorder);
			odetails.setFoodname(FoodName);
			odetails.setRestid(RestId);
			odetails.setQty(Quantity);			
			odetailsAccess.insertSelective(odetails);
			
		return message;
	}
	
	
	private Short CreatedOrder(Short RestId,String FoodName,String DineIn,String Delivery,String Pickup ) {
		RestaurantOrder order = new RestaurantOrder();;	

		Short nextorder;	
		SequenceDAO sqdata = new SequenceDAO();
		RestaurantOrderDAO accessOrder = new RestaurantOrderDAO();		
	
		nextorder=sqdata.nextOrder();		
		Date date = new Date();
		Date pickuptime = new Date(System.currentTimeMillis()+20*60*1000); //time plus 20 minutes
		
		//insert order
		order.setOno(nextorder);
		order.setOrderdate(date);
		order.setCustemail(customeremail);
		order.setOrderdineinflag(DineIn);
		order.setOrderdeliveryflag(Delivery);
		order.setOrderpickupflag(Pickup);
		if (Pickup=="Y") {
			order.setOrderpickupdate(pickuptime);
		}
		
		
		accessOrder.insert(order);
	    
		return nextorder;
	}
	
	
	public List<RestaurantOrder> MyOrdersPending(){
		
		List<RestaurantOrder> orders = new ArrayList<RestaurantOrder>();
		RestaurantOrderExample example = new RestaurantOrderExample();
		
		example.or()
			   .andCustemailEqualTo(customeremail)
			   .andOrderdeliverydateIsNull();
		RestaurantOrderDAO orderAccess = new RestaurantOrderDAO();		
		orders=orderAccess.selectByExample(example);
		return orders;
		
	}
	
	public List<RestaurantOrder> MyOrdersPicked(){
		
		List<RestaurantOrder> orders = new ArrayList<RestaurantOrder>();
		RestaurantOrderExample example = new RestaurantOrderExample();		
		example.or()
			   .andCustemailEqualTo(customeremail)
			   .andOrderdeliverydateIsNotNull();
		RestaurantOrderDAO orderAccess = new RestaurantOrderDAO();		
		orders=orderAccess.selectByExample(example);
		return orders;
		
	}
	
	public int PickupOrder(Short OrderId) {
		int picked = 1;
		
		RestaurantOrder order = new RestaurantOrder();
		List<RestaurantOrder> orders = new ArrayList<RestaurantOrder>();
		RestaurantOrderDAO orderAccess = new RestaurantOrderDAO();
		RestaurantOrderExample example = new RestaurantOrderExample();
		
		example.or()
			   .andOnoEqualTo(OrderId)
			   .andOrderdeliverydateIsNull();				
		orders=orderAccess.selectByExample(example);
		
		if (!orders.isEmpty()) {
			order=orderAccess.selectByPrimaryKey(OrderId);			
			Date pickedtime = new Date();		
			order.setOrderpickupdate(pickedtime);		
			orderAccess.updateByPrimaryKey(order);			
			picked=1;			
		}
			
		return picked;
		
	}

	
	
	
	

}
