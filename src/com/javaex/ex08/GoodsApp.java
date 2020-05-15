package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods("니콘", 50000);
		Goods cup = new Goods("머그컵", 5000);
		
		System.out.println(camera.toString());
		System.out.println(cup.toString());
	}

}
