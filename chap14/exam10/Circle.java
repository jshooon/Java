/*
 파일이름 : Circle.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam10;

import java.io.Serializable;

class Circle implements Serializable{
	int xPos;
	int yPos;
	double rad;
	
	public Circle(int xPos, int yPos, double rad) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}
	
	public void showCircleInfo() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
		System.out.println("rad : " + rad);
	}
	
}
