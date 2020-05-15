package com.javaex.ex08;

public class Goods {
	
	private String name;
	private int price;
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Goods(int price) {
		super();
		this.price = price;
	}

	public Goods(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	public void showInfo() {
		System.out.println(name + " /" + price + "원");
	}

}
