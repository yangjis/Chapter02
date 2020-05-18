package com.javaex.ex12;

public class Goods {
	
	private String name;
	private int price;
	private static int CountGoods;
	
	public Goods() {}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		CountGoods++;
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
	public int getCountGoods() {
		return CountGoods;
	}
	public void setCountGoods(int CountGoods) {
		this.CountGoods = CountGoods;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countGoods=" + CountGoods + "]";
	}
	
	
	
}
