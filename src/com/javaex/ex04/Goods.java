package com.javaex.ex04;

//메소드(객체의 기능 또는 행동을 정의하는 함수)를 배워보자. = getter, setter를 배워보자.

public class Goods {
	
	private String name;
	private int price;
	private int x;
	private int y;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}
	
	public void showInfo() {
		System.out.println("상품명: " + name + "/ 가격: " + price);
	}
}
