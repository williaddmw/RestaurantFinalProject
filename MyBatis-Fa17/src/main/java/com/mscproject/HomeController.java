package com.mscproject;

import com.domain.*;
import com.service.*;
import com.util.*;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

///import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({"email","serviceError","processMessage"})

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = {"/","/home","/logout"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);				
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);		
		String formattedDate = dateFormat.format(date);	
		UserLoggedon user = new UserLoggedon();		
		model.addAttribute("userloggedon", user );
		model.addAttribute("serverTime", formattedDate );					
		return "home";
	}
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String Login(Model model) {	
		logger.info("Welcome home! The client locale is {}.", "jOHN");
		///JOptionPane.showMessageDialog(null, "Incorrect Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);	
		 UserLoggedon user = new UserLoggedon();		
		 model.addAttribute("userloggedon", user );
		return "login";			

	}
	
	@RequestMapping(value = {"/registeruser"}, method = RequestMethod.GET)
	public String RegisterUser(Model model) {
		
		RestaurantCustomer customer= new RestaurantCustomer();
		/// UserLoggedon user = new UserLoggedon();		
		 model.addAttribute("customer", customer );
		return "registeruser";			

	}
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.POST)
	 public String Login(@ModelAttribute("userloggedon") UserLoggedon userloggedon, Model model) {
		//https://www.boraji.com/spring-mvc-4-sessionattributes-example

		 LoginMessage auth = new LoginMessage();
		 LoginService logservice = new LoginService();		 
		 auth=logservice.Login(userloggedon.getEmail(), userloggedon.getPassword());	
		 
		 String address;
		 model.addAttribute("email", userloggedon.getEmail() );
		 model.addAttribute("processMessage","User is now logged in");
		 
		 if (auth.getSuccess()==true) {
			 //JOptionPane.showMessageDialog (null, auth.getMessage(), "Login Message", JOptionPane.INFORMATION_MESSAGE);
			 address = "redirect:/restaurants";
		 }else {
			 
			 //JOptionPane.showMessageDialog (null, auth.getMessage(), "Login Message", JOptionPane.INFORMATION_MESSAGE);
			 address =  "redirect:/home";
		 } 
		 
		 return address;

	  }
	
	@RequestMapping(value = {"/adduser"}, method = RequestMethod.POST)
	 public String AddNewUser(@ModelAttribute("customer") RestaurantCustomer customer, Model model) {

		 LoginService logservice = new LoginService();
		 logservice.CreateNewUser(customer);
	 
		 return  "redirect:/home";
	}

	@RequestMapping(value = "/restaurants", method = RequestMethod.GET)
	public String restaurants(Model model) {
		
		RestaurantExample example =  new RestaurantExample();
		example.createCriteria().andRnameLike("%%");
				
		List<Restaurant> rsList = new ArrayList<Restaurant>();
		RestaurantService rssvc = new RestaurantService();
		rsList=rssvc.selectByExample(example);

		model.addAttribute("restaurantdata", rsList );
				
		return "restaurants";
	}
	
	
	@RequestMapping(value = "/restaurantsbyname", method = RequestMethod.GET)
	public String restaurantsbyname(@RequestParam String namesearch,Model model) {

		//uses new criteria stub added to the Restaurant Example
		
		//public Criteria andRestaurantNameLikeInsensitive(String value) {
	      	  //addCriterion("upper(RNAME) like",
	      	    //value.toUpperCase(), "rname");
	      	  //return (Criteria) this;
	      	//}
		
		RestaurantExample example =  new RestaurantExample();
		example.createCriteria().andRestaurantNameLikeInsensitive("%"+namesearch+"%");
		
				
		List<Restaurant> rsList = new ArrayList<Restaurant>();
		RestaurantService rssvc = new RestaurantService();
		rsList=rssvc.selectByExample(example);

		model.addAttribute("restaurantdata", rsList );
				
		return "restaurants";
	}
	
	@RequestMapping(value = "/restaurant", method = RequestMethod.GET)
	public String restaurant(Model model) {
		
		RestaurantExample restExample =  new RestaurantExample();
		restExample.createCriteria().andRnameLike("%%");
				
		List<Restaurant> rsList = new ArrayList<Restaurant>();
		RestaurantService rssvc = new RestaurantService();
		rsList=rssvc.selectByExample(restExample);
		
		Restaurant rest = new Restaurant();
		rest=rsList.get(0);	

		model.addAttribute("restaurantdata", rest );
					
		return "restaurantdetails";
	}
	
	
	@RequestMapping(value = "/restaurantdetails", method = RequestMethod.GET)
	public String restaurant(@RequestParam Short restid,Model model) {
		
		Restaurant rest = new RestaurantService().selectByPrimaryKey(restid);		
		model.addAttribute("restaurantdata", rest );
					
		return "restaurantdetails";
	}
	
	@RequestMapping(value = "/ordermenu", method = RequestMethod.GET)
	public String restaurantmenu(
			@RequestParam Short restid,
			Model model,@ModelAttribute("email") String email,
			@ModelAttribute("processMessage") String processMessage
			) {
		
		MenuExample example =  new MenuExample();
		example.createCriteria().andRestidEqualTo(restid);
				
		List<Menu> menuList = new ArrayList<Menu>();
		MenuService menusvc = new MenuService();
		menuList=menusvc.selectByExample(example);
		
		model.addAttribute("processMessage", processMessage);
		model.addAttribute("menuList", menuList);
					
		return "ordermenu";
	}
	
	
	@RequestMapping(value = {"/addreview"}, method = RequestMethod.GET)
	public String Review(@RequestParam Short restid,Model model,@ModelAttribute("email") String email) {
	     CustReview review = new CustReview();
	     review.setRestid(restid);	  
	     review.setCustemail(email);
	    
	     Date date = new Date();
	     //DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT);
	     //df.format(date)
	     review.setReviewdate(date);
	     model.addAttribute("review", review );
		return "review";			
	}
	
	@RequestMapping(value = {"/reviewedbyme"}, method = RequestMethod.GET)
	public String ReviewedByMe(@RequestParam Short restid,Model model,@ModelAttribute("email") String email) {
	     List<CustReview> reviewList = new ArrayList<CustReview>();
	     
	     CustReviewExample example = new CustReviewExample();
	     
	     example.or()
	     		.andRestidEqualTo(restid)
	     		.andCustemailEqualTo(email);

	     CustReviewService svc = new CustReviewService();
	     reviewList=svc.selectByExample(example);    
		 model.addAttribute("reviewList", reviewList );
		return "reviews";			
	}
	
	@RequestMapping(value = {"/reviewdetail"}, method = RequestMethod.GET)
	public String ReviewDetails(@RequestParam Short reviewid,Model model) {
	     CustReview review = new CustReview();	
	     review= new CustReviewService().selectByPrimaryKey(reviewid);	     
		 model.addAttribute("review", review );
		return "reviewdetail";			
	}
	
	
	@RequestMapping(value = {"/postreview"}, method = RequestMethod.POST)
	 public String Review(@ModelAttribute("review") CustReview record, Model model,RedirectAttributes redirectAttributes) {
	
	 CustReviewService revservice = new CustReviewService();
	 Date reviewdate = new Date();
	 record.setReviewdate(reviewdate);
	 int inserted = revservice.insert(record);
	 model.addAttribute("serviceError", revservice.getError());
	 
	 redirectAttributes.addAttribute("reviewid",inserted);			 
	 return  "redirect:/reviewdetail";
		
	}
		
	
	@RequestMapping(value = {"/testing"}, method = RequestMethod.GET)
	public String Testing(Model model) {
		Testing testingrecord = new Testing();
		model.addAttribute("testingdata", testingrecord );
		return "testingpage";
	}
	
	
	@RequestMapping(value = {"/createtesting"}, method = RequestMethod.POST)
	 public String CreatingTesting(@ModelAttribute("testingdata") Testing record, Model model,RedirectAttributes redirectAttributes) {
	
	 ///Testing testing = new Testing();	 
	 
		model.addAttribute("testingdata", record );
		return "testingpage";	
		
	}
	
	
	@RequestMapping(value = {"/placeorder"}, method = RequestMethod.POST)
	 public String CreatingOrder(
			 @RequestParam Short restid ,
			 @RequestParam String foodname ,
			 @RequestParam int quantity ,
			 @RequestParam String dinein ,
			 @RequestParam String delivery ,
			 @RequestParam String pickup,
			 @ModelAttribute("email") String email,
			 Model model,RedirectAttributes redirectAttributes, HttpSession session) 
	{
	 
	 //placeorder?restid=1000&foodname=Edamame+Beans&quantity=1&dinein=N&delivery=N&Pickup=Y
		String sess = (String)session.getAttribute("email"); 

		String orderMsg="Thank you!\n ";		
		OrderService OrderService = new OrderService(email);
		orderMsg+=OrderService.OrderPlace(restid, foodname, quantity, dinein, delivery, pickup);		
		
		model.addAttribute("processMessage", orderMsg );
		redirectAttributes.addAttribute("restid",restid);
		JOptionPane.showMessageDialog (null, orderMsg, sess, JOptionPane.INFORMATION_MESSAGE);
		
		return  "redirect:/ordermenu";
		
		
		
	}
	
	
	
}
