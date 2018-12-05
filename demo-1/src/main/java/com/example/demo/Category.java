package com.example.demo;

public class Category {
	private String Big;
	private String middle;
	private String small;
	public Category() {
		super();
	}
	public Category(String big, String middle, String small) {
		super();
		Big = big;
		this.middle = middle;
		this.small = small;
	}
	public String getBig() {
		return Big;
	}
	public void setBig(String big) {
		Big = big;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
}
