package com.javaex.ex05;

/*Point 클래스를 만드세요
x, y 좌표를 나타낼 수 있는 필드 작성
x, y 좌표에 접근할 수 있는 getter/setter 메소드 작성
다음 실행 결과를 참조하여 draw()메소드 작성*/

public class Point {
	
	private int x;
	private int y;
	
	public int getX() {
		if(this.x < 0) {
			return 0;
		}else {
			return x;
		}
	}
	
	public void setX(int x) {
		if(x < 0) {
			this.x = 0;
		}else {
			this.x = x;
		}
	}
	
	public int getY() {
		if(this.x < 0) {
			return 0;
		}else {
			return y;
		}
	}
	
	public void setY(int y) {
		if(y < 0) {
			this.y = 0;
		}else {
			this.y = y;
		}
	}
	
	public void draw() {
		System.out.println("점 [x=" + this.x + ", y=" + this.y + "]을 그렸습니다.");
	}
	
}
