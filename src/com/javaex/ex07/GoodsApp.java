package com.javaex.ex07;

//객체를 메모리에 올릴때 데이터도 같이 초기화 한다.(이렇게 할 수 있는 이유는 생성자 덕분)

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 5000);
		Goods camera = new Goods("니콘", 50000);
		
		/*
		 * computer.showInfo(); 
		 * cup.showInfo(); 
		 * camera.showInfo();
		 */
		System.out.println(cup.toString());
		System.out.println(computer.toString());
		System.out.println(camera.toString());
	}

}
