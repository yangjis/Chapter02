package com.javaex.ex10;

//메소드 오버로딩을 배워보자

public class PlusApp {

	public static void main(String[] args) {
		
		Plus p = new Plus();
		
		p.plus(7, 5);
		p.plus(5.6, 9);
		p.plus("안녕", "하세요");
		
	}
}
