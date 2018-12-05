package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	Customer cus;
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private CategoryDao categorydao;
	
	@Autowired
	private ItemDao itemdao;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		return "Login";
	}
	
	@RequestMapping("/join")
	public String join(Model model)
	{
		return "join";
	}
	
	@RequestMapping("/select")
	public String userlistPage(Model model)
	{
		model.addAttribute("name","SpringBlog");
		model.addAttribute("customers",customerDao.listForBeanPropertyRowMapper());
		return "select";
	}
	
	@GetMapping("/main.do")
	public String viewmain(Model model)
	{
		model.addAttribute("FName",cus.getFName());
		model.addAttribute("LName",cus.getLName());
		if(cus.getID().equals("admin"))
			return "MainMaster";
		return "Main";
	}
	
	@PostMapping("/main.do")
	public String main(@RequestParam("id")String ID,@RequestParam("password")String PW,Model model)
	{
		System.out.println(ID +" + " +PW);
		List<Customer> ret = customerDao.Login(ID, PW);
		System.out.println(ret.get(0));
		if(ret.size() == 1)
			System.out.println("login success");
		else
			System.out.println("login failed");
		cus = ret.get(0);
		model.addAttribute("FName",cus.getFName());
		model.addAttribute("LName",cus.getLName());
		if(ID.equals("admin"))
			return "MainMaster";
		return "Main";
	}
	
	@RequestMapping("/join.do")
	public String Login(@RequestParam("id")String ID,@RequestParam("password")String Password,
			@RequestParam("passwordcheck")String passwordcheck,@RequestParam("FName")String FName,
			@RequestParam("LName")String LName,@RequestParam("PhoneNumber")String PhoneNumber,
			@RequestParam("Age")String Age,@RequestParam("gender")String Gender,
			@RequestParam("Works")String Works,@RequestParam("Ttype")String Ttype,Model model)
	{
		Customer customer = new Customer(FName,LName,PhoneNumber,Age,Gender,Works,Ttype,ID,Password);
		if(customerDao.JoinCustomer(customer) == 1) {
			System.out.println("sueccess insert");
		}
		else
			System.out.println("failed insert");
		System.out.println("enter Login Method");
		System.out.println(customer);
		model.addAttribute("FName",cus.getFName());
		model.addAttribute("LName",cus.getLName());
		return "Main";
	}
	
	@RequestMapping("/CheckProduct.do")
	public String Categoryselect(@RequestParam("bigCat")String bigCat,
			@RequestParam("midCat")String midCat,@RequestParam("smaCat")String smgCat,Model model)
	{
		String categorynum = categorydao.GetGategoryNum(new Category(bigCat,midCat,smgCat));
		model.addAttribute("items",itemdao.listofCategory(categorynum));
		return "CheckProduct";
	}
	
	@PostMapping("/updatecustomer.do")
	public String updateCustomer(Model model)
	{
		model.addAttribute("FName",cus.getFName());
		model.addAttribute("LName",cus.getLName());
		model.addAttribute("PhoneNumber", cus.getPhoneNumber());
		model.addAttribute("Age", cus.getAge());
		model.addAttribute("Works", cus.getWorks());
		return "update";
	}
	
	@PostMapping("/updatecomplete.do")
	public String updateComplete(@RequestParam("password")String Password,
			@RequestParam("passwordcheck")String passwordcheck,@RequestParam("FName")String FName,
			@RequestParam("LName")String LName,@RequestParam("PhoneNumber")String PhoneNumber,
			@RequestParam("Age")String Age,@RequestParam("gender")String Gender,
			@RequestParam("Works")String Works,@RequestParam("Ttype")String Ttype,Model model)
	{
		cus.setFName(FName);
		cus.setPassword(Password);
		cus.setLName(LName);
		cus.setPhoneNumber(PhoneNumber);
		cus.setAge(Age);
		cus.setSex(Gender);
		cus.setWorks(Works);
		cus.setTtype(Ttype);
		customerDao.UpdateCustomer(cus);
		model.addAttribute("FName",cus.getFName());
		model.addAttribute("LName",cus.getLName());
		return "Main";
	}
	
	@RequestMapping("/shoppingbag.do")
	public String shoppingbag(Model model)
	{
		model.addAttribute("items",itemdao.listofShoppingBag(cus.getCustomercode()));
		return "ShoppingBag";
	}
}
