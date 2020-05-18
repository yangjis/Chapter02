package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램", 500000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 5000);
		System.out.println(cup.toString());
		
	}

}
