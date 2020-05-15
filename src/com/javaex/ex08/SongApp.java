package com.javaex.ex08;

public class SongApp {
	
	public static void main(String[] agrs) {
		
		Song iu1 = new Song("아이유", "좋은날", "Real", "이민수", 2010);

		Song iu2 = new Song("아이유", "좋은날", "Real", "이민수", 2010);
		iu2.setTrack(3);
		
		System.out.println(iu1.toString());
		System.out.println(iu2.toString());
		
		
	}

}
