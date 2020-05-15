package com.javaex.ex11;

//강사님이 내주신 tv만들기 문제

public class TVApp {
	
	public static void main(String[] agrs) {
		TV tv = new TV();
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}
}
