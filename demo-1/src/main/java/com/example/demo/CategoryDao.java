package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String GetGategoryNum(Category c)
	{
		String query = "SELECT category_id from CATEGORY WHERE Big='"+c.getBig()+"' AND middle='"+c.getMiddle()+"' AND small='"+c.getSmall()+"'";
		
		return jdbcTemplate.queryForObject(query, String.class);
	}
}
