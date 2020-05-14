package com.javaex.ex04;

//메소드(객체의 기능 또는 행동을 정의하는 함수)를 배워보자. = getter, setter를 배워보자.

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		cup.setName("머그컵");
		cup.setPrice(5000);
		
//		System.out.println("상품명: " + computer.getName() + "/ 가격: " + computer.getPrice());
//		System.out.println("상품명: " + cup.getName() + "/ 가격: " + cup.getPrice());
		
		cup.showInfo();
		computer.showInfo();
		

	}

}
