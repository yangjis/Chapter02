package com.javaex.ex09;

//메소드 오버로딩에 대해 배워보자

public class PointApp {

	public static void main(String[] args) {
		Point line1 = new Point(5,5);
		
		line1.draw();
		line1.draw(false);
		line1.draw(true);
		
//		System.out.println(line1.toString());
	}

}
