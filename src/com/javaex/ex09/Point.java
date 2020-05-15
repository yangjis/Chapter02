package com.javaex.ex09;

//메소드 오버로딩에 대해 배워보자

public class Point {
	private int x;
	private int y;

	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println(x + ", " + y + "그렸습니다.");
	}
	public void draw(boolean action) {
		if(action == true) {
			System.out.println(x + ", " + y + "그렸습니다.");
		}else {
			System.out.println(x + ", " + y + "지웠습니다.");
		}
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
