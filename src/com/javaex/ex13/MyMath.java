package com.javaex.ex13;

//static키워드를 사용해보자

public class MyMath {
	
	public static double PI =3.14;
	
	public static int plus(int a, int b) {
		return a +b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static double CircleArea(int radius) {
		return radius * radius * PI;
	}

}
