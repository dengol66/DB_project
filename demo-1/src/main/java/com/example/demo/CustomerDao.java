package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Customer;

@Repository
public class CustomerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> listForBeanPropertyRowMapper()
	{
		String query = "SELECT * FROM CUSTOMER";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
	public int JoinCustomer(Customer C)
	{
		String query = "INSERT INTO CUSTOMER(ID,PW,FName,LName,PhoneNumber,Age,Sex,Works,Ttype) values(?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(query,C.getID(),C.getPassword(),C.getFName(),C.getLName(),C.getPhoneNumber(),C.getAge(),C.getSex(),C.getWorks(),C.getTtype());
	}
	
	public List<Customer> Login(String ID,String PW)
	{
		String query = "SELECT * from CUSTOMER WHERE ID='"+ID+"' AND PW='" + PW + "'";
		System.out.println(query);
		return jdbcTemplate.query(query,new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
	public int UpdateCustomer(Customer C)
	{
		String query = "UPDATE CUSTOMER SET PW='"+C.getPassword()+"', FName='"+C.getFName()+"', LName='"+C.getLName()+"', PhoneNumber='"+C.getPhoneNumber()+"', Age=" +C.getAge()+",Sex='"+C.getSex()+"',Works='"+C.getWorks()+"',Ttype='"+C.getTtype()+
				"'WHERE ID='"+C.getID()+"'";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
}