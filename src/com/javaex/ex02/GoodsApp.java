package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 900000;
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(computer.name +" "+computer.price + "원");
		System.out.println(cup.name +" "+cup.price + "원");
	}

}
