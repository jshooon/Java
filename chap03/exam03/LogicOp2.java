/*
파일 이름 : LogicOp2.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 27.(목)
프로그램 설명 : LogicOp2에 대한 실습 내용.
*/
package exam03;

public class LogicOp2 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		boolean result = false;
		
		System.out.println(num1 == 10);
		
		result = (num1 == 10) && (num2 == 30);	
		System.out.println(result);
		
		result = ((num1 >= 10) || (num2 <= 30));	
		System.out.println(result);
	}
}
