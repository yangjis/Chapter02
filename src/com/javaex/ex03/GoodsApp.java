package com.javaex.ex03;

//접근자에 대해 배워보자.(private, public, default, protected)

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods cup = new Goods();
		Goods computer = new Goods();
		
		cup.name = "머그컵";
//		cup.price = 5000;
		
		computer.name = "LG그램";
//		computer.price = 900000; 
		
		System.out.println(cup.name);
		System.out.println(computer.name);
	}
}
