package com.example.demo;

public class Item {
	private String Itemidx;
	private String TName;
	private String Itemcode;
	private String Unit;
	private String Cost;
	private String Amount;
	private String category_id;
	private String brand_id;
	
	public Item() {
		super();
	}
	public Item(String itemidx, String tName, String itemcode, String unit, String cost, String amount,
			String category_id, String brand_id) {
		super();
		Itemidx = itemidx;
		TName = tName;
		Itemcode = itemcode;
		Unit = unit;
		Cost = cost;
		Amount = amount;
		this.category_id = category_id;
		this.brand_id = brand_id;
	}	
	public String getItemidx() {
		return Itemidx;
	}
	public void setItemidx(String itemidx) {
		Itemidx = itemidx;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	public String getItemcode() {
		return Itemcode;
	}
	public void setItemcode(String itemcode) {
		Itemcode = itemcode;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public String getCost() {
		return Cost;
	}
	public void setCost(String cost) {
		Cost = cost;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	
}
