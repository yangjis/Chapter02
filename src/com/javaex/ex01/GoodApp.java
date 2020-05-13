package com.javaex.ex01;

//객체지향. 클래스의 정의를 배우자

public class GoodApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.name = "nikon";
		camera.price = 400000;
		
		System.out.println("이름: " + camera.name);
		System.out.println("가격: " + camera.price + "원");
		
	}
}
