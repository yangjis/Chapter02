package com.javaex.ex05;

/*Point 클래스를 만드세요
x, y 좌표를 나타낼 수 있는 필드 작성
x, y 좌표에 접근할 수 있는 getter/setter 메소드 작성
다음 실행 결과를 참조하여 draw()메소드 작성*/


public class PointApp {

	public static void main(String[] args) {
		
		Point line1 = new Point();
		Point line2 = new Point();
		
		line1.setX(5);
		line1.setY(5);
		
		line2.setX(10);
		line2.setY(23);
		
		line1.draw();
		line2.draw();
	}

}
