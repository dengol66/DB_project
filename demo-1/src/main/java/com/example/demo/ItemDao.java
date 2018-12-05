package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.example.demo.Item;

@Repository
public class ItemDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Item> listofCategory(String category_id)
	{
		String query = "SELECT * FROM ITEM WHERE category_id="+category_id;
		System.out.println(query);
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Item>(Item.class));
	}
	
	public List<Item> listofShoppingBag(String customer)
	{
		String query = "SELECT ITEM.*"
				+ "FROM SHOPPINGBAG,ITEM WHERE Customercode = '"+customer+"' AND SHOPPINGBAG.Itemidx=ITEM.Itemidx";
		System.out.println(query);
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Item>(Item.class));
	}
}
