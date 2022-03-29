/*
 파일이름 : FruitBaseFruitBox.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam03;

public class FruitBaseFruitBox {
	public static void main(String[] args) {
		Orange orange = new Orange(7);
		Apple apple = new Apple(700);
		
		FruitBox<Orange> orangeBox = new FruitBox<Orange>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		orangeBox.store(orange);
//		orangeBox.store("오렌지");	// 맞지않은 자료형을 기입하여 error
//		orangeBox.store(apple);		// 맞지않은 자료형을 기입하여 error
		
		Orange tmpOrange = orangeBox.pullOut();
		tmpOrange.showSugarcontent();
		
	}
}
