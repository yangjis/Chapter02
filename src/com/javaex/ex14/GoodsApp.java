package com.javaex.ex14;

//클래스를 배열에 담아보자

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Goods computer = new Goods("LG그램", 5000);
		System.out.println(computer);
		
		Goods[] goodsArray = new Goods[3];
		for(int i = 0; i < goodsArray.length; i++){
			
			goodsArray[i] = new Goods();
			
			System.out.print("이름은? :");
			goodsArray[i].setName(scan.next()); 
			
			System.out.print("가격은? :");
			goodsArray[i].setPrice(scan.nextInt());
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(goodsArray[i]);
		}
		
		scan.close();
	}
}
