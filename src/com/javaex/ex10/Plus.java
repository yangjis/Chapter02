package com.javaex.ex10;

//메소드 오버로딩을 배워보자

public class Plus {
	
	private int a;
	private int b;
	
	public Plus() {}
	
	public Plus(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void plus(int a, int b) {
		System.out.println(a + b);
	}
	public void plus(double a, double b) {
		System.out.println(a + b);
	}
	public void plus(String a, String b) {
		System.out.println(a + b);
	}

	@Override
	public String toString() {
		return "Plus [a=" + a + ", b=" + b + "]";
	}
	
}
