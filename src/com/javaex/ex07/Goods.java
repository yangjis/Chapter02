package com.javaex.ex07;

//생성자를 만들어서 사용해보자

public class Goods {

	private String name;
	private int price;
	
	//생성자--------------------------------------------------
	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Goods(String name) {
		this.name = name;
	}

	public Goods(int price) {
		this.price = price;
	}

	//getter, setter----------------------------------------
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
	
	//메소드------------------------------------------------
	public void showInfo() {
		System.out.println(name + "/ " + price + "원");
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}
