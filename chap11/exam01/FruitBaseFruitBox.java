/*
 파일이름 : FruitBaseFruitBox.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam01;

public class FruitBaseFruitBox {
	public static void main(String[] args) {
		Apple apple = new Apple(500);
		AppleBox applebox = new AppleBox();
		
		applebox.store(apple);
		
		Apple tmpApple = applebox.pullOut();
		
		tmpApple.showAppleWeight();
		
		System.out.println("=====================\n");
		
		Orange orange = new Orange(8);
		OrangeBox orangebox = new OrangeBox();
		
		orangebox.store(orange);
		
		Orange tmpOrange = orangebox.pullOut();
		
		tmpOrange.showSugarcontent();
		
		System.out.println("=====================\n");
		
		orangebox.store(tmpOrange);// 안전. 개별포장
	}
}
