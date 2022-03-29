/*
 파일이름 : FruitBaseFruitBox.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam02;

public class FruitBaseFruitBox {
	public static void main(String[] args) {
		Apple apple = new Apple(500);
		FruitBox applebox = new FruitBox();
		
		applebox.store(apple);
		
		Apple tmpApple = (Apple)applebox.pullOut();
		
		tmpApple.showAppleWeight();
		
		System.out.println("=====================\n");
		
		Orange orange = new Orange(8);
		FruitBox orangebox = new FruitBox();
		
		orangebox.store(orange);
		
		Orange tmpOrange = (Orange)orangebox.pullOut();
		
		tmpOrange.showSugarcontent();
		
		System.out.println("=====================\n");
		
		orangebox.store("오렌지"); // 범용적 포장지. 자료형 안전하지 않음.
	}
}
